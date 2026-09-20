package com.example.customer.bdd;

import com.example.customer.domain.Customer;
import com.example.customer.repository.CustomerRepository;
import io.cucumber.java.Before;
import jakarta.persistence.EntityNotFoundException;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.util.ReflectionTestUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.reset;

/**
 * Backs the @MockitoBean CustomerRepository with an in-memory table for one scenario.
 * Entities are copied on save and on read, so a change is only "persisted" if the service calls save.
 */
public class CustomerRepositoryFake {

    @Autowired private CustomerRepository repository;

    private final Map<Long, Customer> rows = new LinkedHashMap<>();
    private final AtomicLong sequence = new AtomicLong(1);

    @Before(order = 0)
    public void installFake() throws Exception {
        rows.clear();
        sequence.set(1);
        reset(repository);

        Answer<Object> answer = invocation -> dispatch(invocation.getMethod(), invocation.getArguments());
        for (Method method : CustomerRepository.class.getMethods()) {
            if (Modifier.isStatic(method.getModifiers()) || method.isBridge() || method.isSynthetic()) continue;
            Object stubbed = doAnswer(answer).when(repository);
            Object[] matchers = Arrays.stream(method.getParameterTypes()).map(CustomerRepositoryFake::anyOf).toArray();
            method.invoke(stubbed, matchers);
        }
    }

    // --- API for step definitions --------------------------------------------

    public Customer seed(Long id, String name, String email) {
        return copy(store(Customer.builder().customerId(id).name(name).email(email).build()));
    }

    public Optional<Customer> byId(long id) {
        return Optional.ofNullable(rows.get(id)).map(CustomerRepositoryFake::copy);
    }

    public List<Customer> byEmail(String email) {
        return rows.values().stream().filter(c -> Objects.equals(email, c.getEmail())).map(CustomerRepositoryFake::copy).toList();
    }

    public int count() {
        return rows.size();
    }

    public List<Customer> snapshot() {
        return rows.values().stream().map(CustomerRepositoryFake::copy).toList();
    }

    // --- Repository behaviour ------------------------------------------------

    private Object dispatch(Method method, Object[] args) {
        switch (method.getName()) {
            case "save", "saveAndFlush":
                return store((Customer) args[0]);
            case "saveAll", "saveAllAndFlush": {
                List<Customer> saved = new ArrayList<>();
                for (Object o : (Iterable<?>) args[0]) saved.add(store((Customer) o));
                return saved;
            }
            case "findById":
                return byId(toLong(args[0]));
            case "existsById":
                return rows.containsKey(toLong(args[0]));
            case "getReferenceById", "getById", "getOne":
                return byId(toLong(args[0])).orElseThrow(() -> new EntityNotFoundException("Customer " + args[0]));
            case "findAllById": {
                List<Customer> found = new ArrayList<>();
                for (Object id : (Iterable<?>) args[0]) byId(toLong(id)).ifPresent(found::add);
                return found;
            }
            case "findAll":
                if (args.length == 0) return snapshot().stream().collect(ArrayList::new, List::add, List::addAll);
                break;
            case "count":
                if (args.length == 0) return (long) rows.size();
                break;
            case "deleteById":
                rows.remove(toLong(args[0]));
                return null;
            case "delete":
                rows.remove(((Customer) args[0]).getCustomerId());
                return null;
            case "deleteAll", "deleteAllInBatch", "deleteInBatch":
                if (args.length == 0) { rows.clear(); return null; }
                for (Object o : (Iterable<?>) args[0]) rows.remove(((Customer) o).getCustomerId());
                return null;
            case "deleteAllById", "deleteAllByIdInBatch":
                for (Object id : (Iterable<?>) args[0]) rows.remove(toLong(id));
                return null;
            case "flush":
                return null;
            default:
        }
        if (method.getName().contains("By")) return derivedQuery(method, args);
        throw new UnsupportedOperationException("CustomerRepositoryFake does not support " + method);
    }

    /** Handles Spring Data derived queries such as findByEmail, existsByEmailIgnoreCase, findByNameAndEmail. */
    private Object derivedQuery(Method method, Object[] args) {
        String name = method.getName();
        int by = name.indexOf("By");
        String subject = name.substring(0, by);
        String[] parts = name.substring(by + 2).split("And");

        Predicate<Customer> filter = c -> true;
        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            boolean ignoreCase = part.endsWith("IgnoreCase");
            if (ignoreCase) part = part.substring(0, part.length() - "IgnoreCase".length());
            String field = Character.toLowerCase(part.charAt(0)) + part.substring(1);
            Object expected = args[i];
            filter = filter.and(c -> matches(readField(c, field), expected, ignoreCase));
        }

        List<Customer> hits = rows.values().stream().filter(filter).map(CustomerRepositoryFake::copy).toList();
        Class<?> type = method.getReturnType();

        if (subject.startsWith("exists")) return !hits.isEmpty();
        if (subject.startsWith("count")) {
            if (type == int.class || type == Integer.class) return hits.size();
            return (long) hits.size();
        }
        if (subject.startsWith("delete") || subject.startsWith("remove")) {
            hits.forEach(c -> rows.remove(c.getCustomerId()));
            if (type == void.class) return null;
            if (type == int.class || type == Integer.class) return hits.size();
            if (type == long.class || type == Long.class) return (long) hits.size();
            return new ArrayList<>(hits);
        }
        if (type == Optional.class) return hits.stream().findFirst();
        if (Stream.class.isAssignableFrom(type)) return hits.stream();
        if (Iterable.class.isAssignableFrom(type)) return new ArrayList<>(hits);
        return hits.isEmpty() ? null : hits.get(0);
    }

    private Customer store(Customer customer) {
        if (customer.getCustomerId() == null) {
            customer.setCustomerId(sequence.getAndIncrement());
        } else {
            long id = customer.getCustomerId();
            sequence.updateAndGet(next -> Math.max(next, id + 1));
        }
        rows.put(customer.getCustomerId(), copy(customer));
        return customer;
    }

    private static Customer copy(Customer c) {
        return Customer.builder().customerId(c.getCustomerId()).name(c.getName()).email(c.getEmail()).build();
    }

    private static Object readField(Customer c, String field) {
        try {
            return ReflectionTestUtils.getField(c, field);
        } catch (IllegalArgumentException e) {
            // Rethrown as IllegalStateException so GlobalExceptionHandler doesn't turn it into a 400
            throw new IllegalStateException("Customer has no field '" + field + "'", e);
        }
    }

    private static boolean matches(Object actual, Object expected, boolean ignoreCase) {
        if (actual instanceof Number a && expected instanceof Number e) return a.longValue() == e.longValue();
        if (ignoreCase && actual instanceof String a && expected instanceof String e) return a.equalsIgnoreCase(e);
        return Objects.equals(actual, expected);
    }

    private static long toLong(Object id) {
        return ((Number) id).longValue();
    }

    private static Object anyOf(Class<?> type) {
        if (type == int.class) return anyInt();
        if (type == long.class) return anyLong();
        if (type == boolean.class) return anyBoolean();
        if (type == double.class) return anyDouble();
        if (type == float.class) return anyFloat();
        if (type == short.class) return anyShort();
        if (type == byte.class) return anyByte();
        if (type == char.class) return anyChar();
        return any();
    }
}