package com.example.cargo.bdd;

import com.example.cargo.domain.*;
import com.example.cargo.exception.CargoNotFound;
import com.example.cargo.outboundAdapter.LocationOutboundAdapter;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.PathNotFoundException;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/** US4 - Report a handling event. Covers every TransportStatus transition and mishandling. */
public class Us4HandlingEventSteps {

    private static final String EVENT_PATH = "/cargo/reportHandlingEvent/{trackingId}";
    private static final int FIRST_REPORTED_TIME = 1796000000;
    private static final int DEADLINE = 1796083200; // 2026-12-01, unix seconds

    /** Feature-file state names mapped onto the model's enum. */
    private static final Map<String, TransportStatus> STATES = Map.of(
            "UNRECEIVED", TransportStatus.Unreceived,
            "RECEIVED", TransportStatus.Received,
            "READY", TransportStatus.Ready,
            "LOADED", TransportStatus.Loaded,
            "ON_PATH", TransportStatus.OnPath,
            "UNLOADED", TransportStatus.Unloaded,
            "IN_CUSTOMS", TransportStatus.InCustoms,
            "CLEARED", TransportStatus.Cleared,
            "DELIVERED", TransportStatus.Delivered,
            "MISHANDLED", TransportStatus.Mishandled);

    @Autowired private MockMvc mockMvc;
    @Autowired private CargoRepositoryFake cargos;
    @Autowired private LocationOutboundAdapter locationAdapter;

    // Feature-file tracking labels mapped to the model's Integer identifiers
    private final Map<String, Integer> trackingIds = new LinkedHashMap<>();
    private int nextTrackingId = 1;
    private int reportedTime = FIRST_REPORTED_TIME;

    private String lastTrackingLabel;
    private int eventCountBefore;
    private HandlingEvent lastValidEventBefore;
    private List<SharedLocation> itineraryBefore;

    private String requestJson;
    private MvcResult result;
    private String body;
    private Throwable unhandledException;

    @Before
    public void stubLocations() {
        reset(locationAdapter);
        // Every port named in this feature is registered in the location service,
        // so a rejection can only come from the cargo's own rules
        when(locationAdapter.checkLocation(anyInt())).thenReturn(true);
    }

    // --- Given ------------------------------------------------------------

    @Given("a cargo {string} in state {word} with itinerary {string}")
    public void aCargoInStateWithItinerary(String trackingId, String state, String itinerary) {
        List<Integer> ports = Arrays.stream(itinerary.split(","))
                .map(String::trim)
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        seedCargo(trackingId, state, ports);
    }

    @Given("a cargo {string} in state {word} with no itinerary")
    public void aCargoInStateWithNoItinerary(String trackingId, String state) {
        seedCargo(trackingId, state, List.of());
    }

    // --- When -------------------------------------------------------------

    @When("I report a {string} event for cargo {string} at port {string}")
    public void iReportAnEventAtPort(String eventType, String trackingId, String port) {
        report(trackingId, eventJson(eventType, Integer.valueOf(port.trim()), null));
    }

    @When("I report a {string} event for cargo {string} from port {string} to port {string}")
    public void iReportAnEventForLeg(String eventType, String trackingId, String from, String to) {
        int source = Integer.parseInt(from.trim());
        int destination = Integer.parseInt(to.trim());
        report(trackingId, eventJson(eventType, source, new int[]{source, destination}));
    }

    // --- Then -------------------------------------------------------------

    @Then("the report is accepted")
    public void theReportIsAccepted() {
        int status = status();
        assertTrue(status >= 200 && status < 300, "Expected 2xx. " + diagnostics());
        assertNotNull(readOrNull("$.event"), "The response contains no handling event. " + diagnostics());
    }

    @Then("the event is recorded in the history of cargo {string}")
    public void theEventIsRecordedInTheHistory(String trackingId) {
        // A recorded event implies the cargo was saved: a rejected save records nothing
        int status = status();
        assertTrue(status >= 200 && status < 300,
                "The report was rejected, so no event was recorded. " + diagnostics());

        List<HandlingEvent> events = cargo(trackingId).getHistory().getEvents();
        assertNotNull(events, "The cargo's history holds no events. " + diagnostics());
        assertEquals(eventCountBefore + 1, events.size(),
                "The event should be recorded for tracing, valid or not. " + diagnostics());
    }

    @Then("the event becomes the last valid event of cargo {string}")
    public void theEventBecomesTheLastValidEvent(String trackingId) {
        DeliveryHistory history = cargo(trackingId).getHistory();
        List<HandlingEvent> events = history.getEvents();
        assertFalse(events.isEmpty(), "No event was recorded. " + diagnostics());
        assertSame(events.get(events.size() - 1), history.getLastValidEvent(),
                "The reported event did not become the last valid event. " + diagnostics());
    }

    @Then("the event does not become the last valid event of cargo {string}")
    public void theEventDoesNotBecomeTheLastValidEvent(String trackingId) {
        Cargo cargo = cargo(trackingId);
        DeliveryHistory history = cargo.getHistory();
        List<HandlingEvent> events = history.getEvents();

        assertFalse(events.isEmpty(), "No event was recorded. " + diagnostics());
        assertNotSame(events.get(events.size() - 1), history.getLastValidEvent(),
                "An invalid event must not become the last valid event. " + diagnostics());
        assertSame(lastValidEventBefore, history.getLastValidEvent(),
                "The last valid event changed. " + diagnostics());

        // A mishandling must not disturb the route the cargo was given
        assertEquals(portCodes(itineraryBefore), portCodes(cargo.getItinerary()),
                "The itinerary changed. " + diagnostics());
    }

    @Then("cargo {string} is in state {word}")
    public void cargoIsInState(String trackingId, String state) {
        assertEquals(toStatus(state), cargo(trackingId).getStatus(),
                "The cargo is in the wrong state. " + diagnostics());
    }

    @Then("cargo {string} remains in state {word}")
    public void cargoRemainsInState(String trackingId, String state) {
        cargoIsInState(trackingId, state);
    }

    @Then("I am informed that the cargo does not exist")
    public void iAmInformedThatTheCargoDoesNotExist() {
        assertEquals(404, status(), "Expected 404. " + diagnostics());
        assertEquals(new CargoNotFound().getMessage(), readOrNull("$.error"),
                "Wrong error message. " + diagnostics());
    }

    // --- helpers ---------------------------------------------------------

    private void seedCargo(String trackingLabel, String state, List<Integer> itinerary) {
        int origin = itinerary.isEmpty() ? 10 : itinerary.get(0);
        int destination = itinerary.isEmpty() ? 20 : itinerary.get(itinerary.size() - 1);

        CarrierMovement delivery = new CarrierMovement();
        delivery.setSource(new SharedLocation(origin));
        delivery.setDestination(new SharedLocation(destination));

        DeliverySpecification goal = new DeliverySpecification();
        goal.setDelivery(delivery);
        goal.setDeadline(DEADLINE);

        SharedCustomer role = new SharedCustomer();
        role.setCustomerId(1);

        // One prior event, so "last valid event" has a value to keep or replace
        HandlingEvent prior = new HandlingEvent();
        prior.setType(HandlingEventType.Receive);
        prior.setPort(new SharedLocation(origin));
        prior.setReportedTime(reportedTime++);

        DeliveryHistory history = new DeliveryHistory();
        history.setEvents(new ArrayList<>(List.of(prior)));
        history.setLastValidEvent(prior);

        Cargo cargo = new Cargo();
        cargo.setTrackingId(id(trackingLabel));
        cargo.setRole(role);
        cargo.setGoal(goal);
        cargo.setStatus(toStatus(state));
        cargo.setHistory(history);
        cargo.setItinerary(itinerary.stream().map(SharedLocation::new).collect(Collectors.toList()));

        cargos.seed(cargo);
        lastTrackingLabel = trackingLabel;
    }

    /**
     * Builds the report payload. A port is always required; a carrier movement is sent
     * only when the step names a leg, which is the case for TRANSPORT events.
     */
    private String eventJson(String eventType, Integer portCode, int[] leg) {
        String carrierMovement = leg == null
                ? "null"
                : "{\"source\":{\"portCode\":" + leg[0] + "},\"destination\":{\"portCode\":" + leg[1] + "}}";
        return "{\"port\":{\"portCode\":" + portCode + "}"
                + ",\"eventType\":\"" + eventType + "\""
                + ",\"carrierMovement\":" + carrierMovement
                + ",\"reportedTime\":" + reportedTime++ + "}";
    }

    private void report(String trackingLabel, String json) {
        lastTrackingLabel = trackingLabel;
        requestJson = json;

        Cargo before = cargos.byId(id(trackingLabel)).orElse(null);
        DeliveryHistory history = before == null ? null : before.getHistory();
        List<HandlingEvent> events = history == null ? null : history.getEvents();
        eventCountBefore = events == null ? 0 : events.size();
        lastValidEventBefore = history == null ? null : history.getLastValidEvent();
        itineraryBefore = before == null || before.getItinerary() == null
                ? null
                : new ArrayList<>(before.getItinerary());

        unhandledException = null;
        try {
            result = mockMvc.perform(post(EVENT_PATH, id(trackingLabel))
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(json))
                    .andReturn();
            body = result.getResponse().getContentAsString();
        } catch (Exception e) {
            // No exception handler mapped it: a real client would receive a 500
            unhandledException = rootCause(e);
            result = null;
            body = null;
        }
    }

    private static TransportStatus toStatus(String state) {
        TransportStatus status = STATES.get(state.trim().toUpperCase(Locale.ROOT));
        assertNotNull(status, "The model's TransportStatus enum has no value for state '" + state + "'");
        return status;
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

    private static List<Integer> portCodes(List<SharedLocation> locations) {
        return locations == null
                ? null
                : locations.stream().map(SharedLocation::getPortCode).collect(Collectors.toList());
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
                    + ", storedItinerary=" + portCodes(c.getItinerary())
                    + ", storedEventCount=" + (events == null ? "null" : events.size())
                    + ", lastValidEventType=" + (history == null || history.getLastValidEvent() == null
                            ? "null" : history.getLastValidEvent().getType());
        }

        return "status=" + status()
                + ", body=" + (body == null || body.isBlank() ? "<empty>" : body)
                + ", exception=" + exception
                + ", request=" + requestJson
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