package com.example.cargo.bdd;

import com.example.cargo.domain.*;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.PathNotFoundException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;

/** US9 - Delete a cargo. 2 scenarios. */
public class Us9DeleteCargoSteps {

    private static final String DELETE_PATH = "/cargo/{trackingId}";

    private static final int ORIGIN = 10;
    private static final int DESTINATION = 20;
    private static final int DEADLINE = 1796083200; // 2026-12-01, unix seconds

    @Autowired private MockMvc mockMvc;
    @Autowired private CargoRepositoryFake cargos;

    private final Map<String, Integer> trackingIds = new LinkedHashMap<>();
    private int nextTrackingId = 1;
    private int reportedTime = 1796000000;

    private String lastTrackingLabel;
    private DeliveryHistory historyBefore;
    private int cargoCountBefore;

    private MvcResult result;
    private String body;
    private Throwable unhandledException;

    // --- Given ------------------------------------------------------------

    @Given("a cargo with tracking identifier {string} has not been handled with any event")
    public void aCargoHasNotBeenHandledWithAnyEvent(String trackingId) {
        seedCargo(trackingId, List.of());
    }

    @Given("a cargo with tracking identifier {string} has been handled with at least one event")
    public void aCargoHasBeenHandledWithAtLeastOneEvent(String trackingId) {
        HandlingEvent received = new HandlingEvent();
        received.setType(HandlingEventType.Receive);
        received.setPort(new SharedLocation(ORIGIN));
        received.setReportedTime(reportedTime++);
        seedCargo(trackingId, List.of(received));
    }

    // --- When -------------------------------------------------------------

    @When("I delete cargo {string}")
    public void iDeleteCargo(String trackingId) {
        lastTrackingLabel = trackingId;

        Cargo before = cargos.byId(id(trackingId)).orElse(null);
        historyBefore = before == null ? null : before.getHistory();
        cargoCountBefore = cargos.count();

        unhandledException = null;
        try {
            result = mockMvc.perform(delete(DELETE_PATH, id(trackingId))).andReturn();
            body = result.getResponse().getContentAsString();
        } catch (Exception e) {
            // No exception handler mapped it: a real client would receive a 500
            unhandledException = rootCause(e);
            result = null;
            body = null;
        }
    }

    // --- Then -------------------------------------------------------------

    @Then("the cargo is deleted")
    public void theCargoIsDeleted() {
        assertSuccessful();

        String label = currentTrackingLabel();
        assertTrue(cargos.byId(id(label)).isEmpty(),
                "The cargo is still stored. " + diagnostics());
        assertEquals(cargoCountBefore - 1, cargos.count(),
                "Exactly one cargo should have been removed. " + diagnostics());

        Object returned = readOrNull("$.deletedCargo");
        assertNotNull(returned, "The response does not contain the deleted cargo. " + diagnostics());
        assertEquals(id(label), intOrNull("$.deletedCargo.trackingId"),
                "The response refers to a different cargo. " + diagnostics());
    }

    @Then("its history is deleted")
    public void itsHistoryIsDeleted() {
        // The history is owned by the cargo, so removing the cargo must take it with it
        assertNotNull(historyBefore, "The cargo had no history before the deletion");
        assertTrue(cargos.byId(id(currentTrackingLabel())).isEmpty(),
                "The cargo, and therefore its history, is still stored. " + diagnostics());

        boolean orphaned = cargos.snapshot().stream()
                .anyMatch(c -> c.getHistory() != null && c.getHistory() == historyBefore);
        assertFalse(orphaned, "The deleted cargo's history is still reachable. " + diagnostics());
    }

    @Then("the cargo is NOT deleted")
    public void theCargoIsNotDeleted() {
        String label = currentTrackingLabel();
        Optional<Cargo> stored = cargos.byId(id(label));

        assertTrue(stored.isPresent(),
                "The cargo was deleted although it has been handled. " + diagnostics());
        assertEquals(cargoCountBefore, cargos.count(),
                "The number of stored cargos changed. " + diagnostics());

        List<HandlingEvent> events = stored.get().getHistory().getEvents();
        assertNotNull(events, "The cargo's history was emptied. " + diagnostics());
        assertFalse(events.isEmpty(), "The cargo's handling events were removed. " + diagnostics());
    }

    @Then("I am informed that the cargo has been handled")
    public void iAmInformedThatTheCargoHasBeenHandled() {
        assertEquals(400, status(), "Expected 400. " + diagnostics());
        assertEquals(Boolean.FALSE, readOrNull("$.success"),
                "Rejected by the framework, not by the service's business rules. " + diagnostics());

        String error = String.valueOf(readOrNull("$.error")).toLowerCase(Locale.ROOT);
        assertTrue(error.contains("handled") || error.contains("event"),
                "The error does not say the cargo has been handled. " + diagnostics());
    }

    // --- helpers ---------------------------------------------------------

    private void seedCargo(String trackingLabel, List<HandlingEvent> events) {
        CarrierMovement delivery = new CarrierMovement();
        delivery.setSource(new SharedLocation(ORIGIN));
        delivery.setDestination(new SharedLocation(DESTINATION));

        DeliverySpecification goal = new DeliverySpecification();
        goal.setDelivery(delivery);
        goal.setDeadline(DEADLINE);

        SharedCustomer role = new SharedCustomer();
        role.setCustomerId(1);

        DeliveryHistory history = new DeliveryHistory();
        history.setEvents(new ArrayList<>(events));
        if (!events.isEmpty()) history.setLastValidEvent(events.get(events.size() - 1));

        Cargo cargo = new Cargo();
        cargo.setTrackingId(id(trackingLabel));
        cargo.setRole(role);
        cargo.setGoal(goal);
        cargo.setStatus(events.isEmpty() ? TransportStatus.Unreceived : TransportStatus.Received);
        cargo.setHistory(history);
        cargo.setItinerary(new ArrayList<>());

        cargos.seed(cargo);
        lastTrackingLabel = trackingLabel;
    }

    private int id(String trackingLabel) {
        String v = trackingLabel.trim();
        if (v.matches("\\d+")) return Integer.parseInt(v);
        return trackingIds.computeIfAbsent(v, k -> nextTrackingId++);
    }

    private String currentTrackingLabel() {
        assertNotNull(lastTrackingLabel, "No cargo was addressed in a previous step");
        return lastTrackingLabel;
    }

    private void assertSuccessful() {
        int status = status();
        assertTrue(status >= 200 && status < 300, "Expected 2xx. " + diagnostics());
    }

    private int status() {
        return result != null ? result.getResponse().getStatus() : 500;
    }

    private Integer intOrNull(String path) {
        Object value = readOrNull(path);
        return value instanceof Number n ? n.intValue() : null;
    }

    private String diagnostics() {
        String exception;
        if (unhandledException != null) {
            exception = "UNHANDLED " + unhandledException.getClass().getSimpleName()
                    + ": " + unhandledException.getMessage();
        } else {
            Exception resolved = result.getResolvedException();
            exception = resolved == null ? "none"
                    : resolved.getClass().getSimpleName() + ": " + resolved.getMessage();
        }

        String stored = "";
        Cargo c = lastTrackingLabel == null ? null : cargos.byId(id(lastTrackingLabel)).orElse(null);
        if (c != null) {
            List<HandlingEvent> events = c.getHistory() == null ? null : c.getHistory().getEvents();
            stored = ", stillStored=true, storedEventCount=" + (events == null ? "null" : events.size());
        } else if (lastTrackingLabel != null) {
            stored = ", stillStored=false";
        }

        return "status=" + status()
                + ", body=" + (body == null || body.isBlank() ? "<empty>" : body)
                + ", exception=" + exception
                + ", cargoCountBefore=" + cargoCountBefore
                + ", cargoCountNow=" + cargos.count()
                + ", trackingIds=" + trackingIds
                + stored;
    }

    private Object readOrNull(String path) {
        if (body == null || body.isBlank()) return null;
        try {
            return JsonPath.read(body, path);
        } catch (PathNotFoundException e) {
            return null;
        }
    }

    private static Throwable rootCause(Throwable t) {
        Throwable cause = t;
        while (cause.getCause() != null && cause.getCause() != cause) cause = cause.getCause();
        return cause;
    }
}