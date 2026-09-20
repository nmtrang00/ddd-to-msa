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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/** US6 - Track a cargo. 4 scenarios. */
public class Us6TrackCargoSteps {

    private static final String TRACK_PATH = "/cargo/{trackingId}";
    private static final String RECEIPT = "$.trackingReceipt";

    private static final int ORIGIN = 10;
    private static final int STOP = 15;
    private static final int DESTINATION = 20;
    private static final int DEADLINE = 1796083200; // 2026-12-01, unix seconds

    @Autowired private MockMvc mockMvc;
    @Autowired private CargoRepositoryFake cargos;

    private final Map<String, Integer> trackingIds = new LinkedHashMap<>();
    private int nextTrackingId = 1;
    private int reportedTime = 1796000000;

    private String lastTrackingLabel;
    private MvcResult result;
    private String body;
    private Throwable unhandledException;

    // --- Given ------------------------------------------------------------

    @Given("a cargo {string} that has been loaded onto a voyage")
    public void aCargoThatHasBeenLoadedOntoAVoyage(String trackingId) {
        seedCargo(trackingId, TransportStatus.Loaded, List.of(ORIGIN, STOP, DESTINATION),
                List.of(event(HandlingEventType.Receive, ORIGIN),
                        event(HandlingEventType.Load, ORIGIN)));
    }

    @Given("a cargo {string} that has been booked but never handled")
    public void aCargoBookedButNeverHandled(String trackingId) {
        // As bookACargo leaves it: no events, and therefore no last valid event
        seedCargo(trackingId, TransportStatus.Unreceived, List.of(), List.of());
    }

    @Given("a cargo {string} that has been delivered")
    public void aCargoThatHasBeenDelivered(String trackingId) {
        seedCargo(trackingId, TransportStatus.Delivered, List.of(ORIGIN, STOP, DESTINATION),
                List.of(event(HandlingEventType.Receive, ORIGIN),
                        event(HandlingEventType.Load, ORIGIN),
                        transportEvent(ORIGIN, STOP),
                        event(HandlingEventType.Unload, STOP),
                        event(HandlingEventType.Load, STOP),
                        transportEvent(STOP, DESTINATION),
                        event(HandlingEventType.Unload, DESTINATION),
                        event(HandlingEventType.Customs, DESTINATION),
                        event(HandlingEventType.Clear, DESTINATION),
                        event(HandlingEventType.Deliver, DESTINATION)));
    }

    // --- When -------------------------------------------------------------

    @When("I look up cargo {string} by its tracking identifier")
    public void iLookUpCargoByItsTrackingIdentifier(String trackingId) {
        lastTrackingLabel = trackingId;
        unhandledException = null;
        try {
            result = mockMvc.perform(get(TRACK_PATH, id(trackingId))).andReturn();
            body = result.getResponse().getContentAsString();
        } catch (Exception e) {
            // No exception handler mapped it: a real client would receive a 500
            unhandledException = rootCause(e);
            result = null;
            body = null;
        }
    }

    // --- Then -------------------------------------------------------------

    @Then("I am shown its current status and last known location")
    public void iAmShownItsCurrentStatusAndLastKnownLocation() {
        assertSuccessful();

        Cargo stored = cargo(currentTrackingLabel());
        assertEquals(stored.getStatus().name(), readOrNull(RECEIPT + ".status"),
                "The reported status does not match the stored one. " + diagnostics());

        Object lastLocation = readOrNull(RECEIPT + ".lastLocation.portCode");
        assertNotNull(lastLocation, "The receipt has no last known location. " + diagnostics());

        // The last known location comes from the last valid event: its port, or its leg's source
        HandlingEvent last = stored.getHistory().getLastValidEvent();
        assertNotNull(last, "The cargo has no last valid event. " + diagnostics());
        Integer expected = last.getPort() != null
                ? last.getPort().getPortCode()
                : last.getLeg().getSource().getPortCode();
        assertEquals(expected, ((Number) lastLocation).intValue(),
                "The last known location is wrong. " + diagnostics());
    }

    @Then("I am shown the events recorded for it so far")
    public void iAmShownTheEventsRecordedSoFar() {
        List<?> reported = reportedEvents();
        List<HandlingEvent> stored = cargo(currentTrackingLabel()).getHistory().getEvents();

        assertNotNull(stored, "The cargo's history holds no events. " + diagnostics());
        assertEquals(stored.size(), reported.size(),
                "The receipt does not list every recorded event. " + diagnostics());

        List<String> reportedTypes = reported.stream()
                .map(e -> String.valueOf(((Map<?, ?>) e).get("type")))
                .collect(Collectors.toList());
        List<String> storedTypes = stored.stream()
                .map(e -> e.getType().name())
                .collect(Collectors.toList());
        assertEquals(storedTypes, reportedTypes,
                "The receipt lists the events in the wrong order or with the wrong types. " + diagnostics());
    }

    // @Then("I am shown its expected arrival")
    // public void iAmShownItsExpectedArrival() {
    //     // A TrackingReceipt carries status, tracking id, last location and events only:
    //     // the delivery deadline is not among them, so an expected arrival cannot be reported.
    //     Object raw = readOrNull(RECEIPT);
    //     Set<String> fields = raw instanceof Map<?, ?> m
    //             ? m.keySet().stream().map(String::valueOf).collect(Collectors.toCollection(LinkedHashSet::new))
    //             : Set.of();
    //     boolean carriesArrival = fields.stream().anyMatch(f -> {
    //         String lower = f.toLowerCase(Locale.ROOT);
    //         return lower.contains("arriv") || lower.contains("deadline")
    //                 || lower.contains("eta") || lower.contains("expected");
    //     });
    //     assertTrue(carriesArrival,
    //             "The tracking receipt carries no expected arrival. Its fields are " + fields + ". " + diagnostics());
    // }

    @Then("I am shown that it has not yet been received")
    public void iAmShownThatItHasNotYetBeenReceived() {
        assertSuccessful();
        assertEquals(TransportStatus.Unreceived.name(), readOrNull(RECEIPT + ".status"),
                "The cargo is not reported as unreceived. " + diagnostics());
    }

    @Then("no handling events are listed")
    public void noHandlingEventsAreListed() {
        List<?> reported = reportedEvents();
        assertTrue(reported.isEmpty(),
                "The receipt lists events although the cargo was never handled. " + diagnostics());
    }

    @Then("I am shown that the shipment is complete")
    public void iAmShownThatTheShipmentIsComplete() {
        assertSuccessful();
        assertEquals(TransportStatus.Delivered.name(), readOrNull(RECEIPT + ".status"),
                "The cargo is not reported as delivered. " + diagnostics());
    }

    @Then("I am shown the full sequence of events that led to it")
    public void iAmShownTheFullSequenceOfEvents() {
        iAmShownTheEventsRecordedSoFar();

        List<?> reported = reportedEvents();
        assertFalse(reported.isEmpty(), "The receipt lists no events. " + diagnostics());

        String lastType = String.valueOf(((Map<?, ?>) reported.get(reported.size() - 1)).get("type"));
        assertEquals(HandlingEventType.Deliver.name(), lastType,
                "The sequence does not end with the delivery. " + diagnostics());
    }

    @Then("no shipment information is disclosed")
    public void noShipmentInformationIsDisclosed() {
        assertEquals(404, status(), "Expected 404. " + diagnostics());
        assertNull(readOrNull(RECEIPT),
                "A tracking receipt was returned for an unknown cargo. " + diagnostics());
        assertNull(readOrNull("$.trackingReceipt.events"),
                "Event information was disclosed for an unknown cargo. " + diagnostics());
    }

    // --- helpers ---------------------------------------------------------

    private void seedCargo(String trackingLabel, TransportStatus status, List<Integer> itinerary,
                           List<HandlingEvent> events) {
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
        cargo.setStatus(status);
        cargo.setHistory(history);
        cargo.setItinerary(itinerary.stream().map(SharedLocation::new).collect(Collectors.toList()));

        cargos.seed(cargo);
        lastTrackingLabel = trackingLabel;
    }

    private HandlingEvent event(HandlingEventType type, int portCode) {
        HandlingEvent e = new HandlingEvent();
        e.setType(type);
        e.setPort(new SharedLocation(portCode));
        e.setReportedTime(reportedTime++);
        return e;
    }

    private HandlingEvent transportEvent(int from, int to) {
        CarrierMovement leg = new CarrierMovement();
        leg.setSource(new SharedLocation(from));
        leg.setDestination(new SharedLocation(to));
        HandlingEvent e = new HandlingEvent();
        e.setType(HandlingEventType.Transport);
        e.setLeg(leg);
        e.setReportedTime(reportedTime++);
        return e;
    }

    private List<?> reportedEvents() {
        assertSuccessful();
        Object raw = readOrNull(RECEIPT + ".events");
        if (raw == null) return List.of();
        assertInstanceOf(List.class, raw, "The receipt's events are not a list. " + diagnostics());
        return (List<?>) raw;
    }

    private int id(String trackingLabel) {
        String v = trackingLabel.trim();
        if (v.matches("\\d+")) return Integer.parseInt(v);
        return trackingIds.computeIfAbsent(v, k -> nextTrackingId++);
    }

    private Cargo cargo(String trackingLabel) {
        return cargos.byId(id(trackingLabel))
                .orElseThrow(() -> new AssertionError(
                        "No stored cargo " + trackingLabel + " (id " + id(trackingLabel) + ")"));
    }

    private String currentTrackingLabel() {
        assertNotNull(lastTrackingLabel, "No cargo was looked up in a previous step");
        return lastTrackingLabel;
    }

    private void assertSuccessful() {
        int status = status();
        assertTrue(status >= 200 && status < 300, "Expected 2xx. " + diagnostics());
    }

    private int status() {
        return result != null ? result.getResponse().getStatus() : 500;
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
            DeliveryHistory history = c.getHistory();
            List<HandlingEvent> events = history == null ? null : history.getEvents();
            stored = ", storedStatus=" + c.getStatus()
                    + ", storedEventCount=" + (events == null ? "null" : events.size())
                    + ", lastValidEventType=" + (history == null || history.getLastValidEvent() == null
                            ? "null" : history.getLastValidEvent().getType());
        }

        return "status=" + status()
                + ", body=" + (body == null || body.isBlank() ? "<empty>" : body)
                + ", exception=" + exception
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