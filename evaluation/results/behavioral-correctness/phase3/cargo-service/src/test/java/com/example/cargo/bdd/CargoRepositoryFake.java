package com.example.cargo.bdd;

import com.example.cargo.domain.Cargo;
import com.example.cargo.repository.CargoRepository;
import io.cucumber.java.Before;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.util.ReflectionTestUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.reset;

/** Backs the @MockitoBean CargoRepository with an in-memory table for one scenario. */
public class CargoRepositoryFake {

    @Autowired private CargoRepository repository;

    private final Map<Integer, Cargo> rows = new LinkedHashMap<>();
    private final AtomicInteger sequence = new AtomicInteger(1);

    @Before(order = 0)
    public void installFake() throws Exception {
        rows.clear();
        sequence.set(1);
        reset(repository);

        Answer<Object> answer = invocation -> dispatch(invocation.getMethod(), invocation.getArguments());
        for (Method method : CargoRepository.class.getMethods()) {
            if (Modifier.isStatic(method.getModifiers()) || method.isBridge() || method.isSynthetic()) continue;
            Object stubbed = doAnswer(answer).when(repository);
            Object[] matchers = Arrays.stream(method.getParameterTypes()).map(CargoRepositoryFake::anyOf).toArray();
            method.invoke(stubbed, matchers);
        }
    }

    // --- API for step definitions --------------------------------------------

    /** Stores a cargo as if it had been persisted, running the JPA lifecycle callbacks. */
    public Cargo seed(Cargo cargo) {
        return store(cargo);
    }

    public Optional<Cargo> byId(int trackingId) {
        return Optional.ofNullable(rows.get(trackingId));
    }

    public Set<Integer> ids() {
        return new LinkedHashSet<>(rows.keySet());
    }

    public int count() {
        return rows.size();
    }

    public List<Cargo> snapshot() {
        return new ArrayList<>(rows.values());
    }

    // --- Repository behaviour ------------------------------------------------

    private Object dispatch(Method method, Object[] args) {
        switch (method.getName()) {
            case "save", "saveAndFlush": return store((Cargo) args[0]);
            case "findById":             return byId(toInt(args[0]));
            case "existsById":           return rows.containsKey(toInt(args[0]));
            case "getReferenceById", "getById":
                return byId(toInt(args[0])).orElseThrow(() -> new EntityNotFoundException("Cargo " + args[0]));
            case "count":                if (args.length == 0) return (long) rows.size(); break;
            case "findAll":              if (args.length == 0) return snapshot(); break;
            case "deleteById":           rows.remove(toInt(args[0])); return null;
            case "delete":               rows.remove(((Cargo) args[0]).getTrackingId()); return null;
            case "deleteAll":            if (args.length == 0) { rows.clear(); return null; } break;
            case "flush":                return null;
            case "deleteByTrackingId": {
                Cargo removed = rows.remove(toInt(args[0]));
                return removed; // the generated service returns the deleted cargo
            }
            default:
        }
        if (method.getName().contains("By")) return derivedQuery(method, args);
        throw new UnsupportedOperationException("CargoRepositoryFake does not support " + method);
    }

    /** Handles Spring Data derived queries such as findByTrackingId. */
    private Object derivedQuery(Method method, Object[] args) {
        String name = method.getName();
        int by = name.indexOf("By");
        String subject = name.substring(0, by);
        String[] parts = name.substring(by + 2).split("And");

        Predicate<Cargo> filter = c -> true;
        for (int i = 0; i < parts.length; i++) {
            String field = Character.toLowerCase(parts[i].charAt(0)) + parts[i].substring(1);
            Object expected = args[i];
            filter = filter.and(c -> matches(ReflectionTestUtils.getField(c, field), expected));
        }

        List<Cargo> hits = rows.values().stream().filter(filter).toList();
        Class<?> type = method.getReturnType();

        if (subject.startsWith("exists")) return !hits.isEmpty();
        if (subject.startsWith("count")) return type == int.class || type == Integer.class ? hits.size() : (long) hits.size();
        if (type == Optional.class) return hits.stream().findFirst();
        if (Stream.class.isAssignableFrom(type)) return hits.stream();
        if (Iterable.class.isAssignableFrom(type)) return new ArrayList<>(hits);
        return hits.isEmpty() ? null : hits.get(0); // findByTrackingId returns Cargo or null
    }

    private Cargo store(Cargo cargo) {
        boolean isNew = cargo.getTrackingId() == null;
        runCallbacks(cargo, isNew ? PrePersist.class : PreUpdate.class);
        if (isNew) {
            cargo.setTrackingId(sequence.getAndIncrement());
        } else {
            int id = cargo.getTrackingId();
            sequence.updateAndGet(next -> Math.max(next, id + 1));
        }
        rows.put(cargo.getTrackingId(), cargo);
        return cargo;
    }

    /** Simulates JPA lifecycle validation, which does not run when the repository is mocked. */
    private static void runCallbacks(Cargo cargo, Class<? extends Annotation> annotation) {
        for (Method m : Cargo.class.getDeclaredMethods()) {
            if (!m.isAnnotationPresent(annotation)) continue;
            try {
                m.setAccessible(true);
                m.invoke(cargo);
            } catch (InvocationTargetException e) {
                if (e.getCause() instanceof RuntimeException re) throw re;
                throw new IllegalStateException(e.getCause());
            } catch (IllegalAccessException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    private static boolean matches(Object actual, Object expected) {
        if (actual instanceof Number a && expected instanceof Number e) return a.longValue() == e.longValue();
        return Objects.equals(actual, expected);
    }

    private static int toInt(Object id) {
        return ((Number) id).intValue();
    }

    private static Object anyOf(Class<?> type) {
        if (type == int.class) return anyInt();
        if (type == long.class) return anyLong();
        if (type == boolean.class) return anyBoolean();
        return any();
    }
}