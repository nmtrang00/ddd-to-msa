package com.example.cargo.bdd;

import com.example.cargo.domain.*;
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

/**
 * US5 - Keep cargo status current. 4 scenarios.
 * The notification scenarios (US5-S2, US5-S3) are out of scope until
 * asynchronous messaging exists, so no steps for them appear here.
 */
public class Us5CargoStatusSteps {

    private static final String EVENT_PATH = "/cargo/reportHandlingEvent/{trackingId}";
    private static final String ROUTE_PATH = "/cargo/{trackingId}";

    private static final int ORIGIN = 10;
    private static final int STOP = 15;
    private static final int DESTINATION = 20;
    private static final int DEADLINE = 1796083200; // 2026-12-01, unix seconds

    @Autowired private MockMvc mockMvc;
    @Autowired private CargoRepositoryFake cargos;
    @Autowired private LocationOutboundAdapter locationAdapter;

    private final Map<String, Integer> trackingIds = new LinkedHashMap<>();
    private int nextTrackingId = 1;
    private int reportedTime = 1796000000;

    private String lastTrackingLabel;
    private TransportStatus statusBefore;
    private int eventCountBefore;
    private HandlingEvent lastValidEventBefore;

    private String requestJson;
    private MvcResult result;
    private String body;
    private Throwable unhandledException;

    @Before
    public void stubLocations() {
        reset(locationAdapter);
        // Every port used here is registered, so status is the only thing under test
        when(locationAdapter.checkLocation(anyInt())).thenReturn(true);
    }

    // --- Given ------------------------------------------------------------

    @Given("a routed cargo {string} whose handling follows its itinerary")
    public void aRoutedCargoWhoseHandlingFollowsItsItinerary(String trackingId) {
        seedCargo(trackingId, TransportStatus.Ready, List.of(ORIGIN, STOP, DESTINATION));
    }

    @Given("a cargo {string} that is UNROUTED")
    public void aCargoThatIsUnrouted(String trackingId) {
        seedCargo(trackingId, TransportStatus.Unreceived, List.of());
    }

    @Given("a cargo {string} that is RECEIVED but UNROUTED")
    public void aCargoThatIsReceivedButUnrouted(String trackingId) {
        seedCargo(trackingId, TransportStatus.Received, List.of());
    }

    @Given("a cargo {string} that has been cleared through customs")
    public void aCargoThatHasBeenClearedThroughCustoms(String trackingId) {
        seedCargo(trackingId, TransportStatus.Cleared, List.of(ORIGIN, STOP, DESTINATION));
    }

    // --- When -------------------------------------------------------------

    @When("a handling event is published for cargo {string}")
    public void aHandlingEventIsPublishedForCargo(String trackingId) {
        // A READY cargo accepts a LOAD at the origin of its itinerary
        report(trackingId, eventJson(HandlingEventType.Load, ORIGIN, null));
    }

    @When("a receipt is reported for cargo {string}")
    public void aReceiptIsReportedForCargo(String trackingId) {
        report(trackingId, eventJson(HandlingEventType.Receive, ORIGIN, null));
    }

    @When("an itinerary is assigned to cargo {string}")
    public void anItineraryIsAssignedToCargo(String trackingId) {
        List<Integer> itinerary = List.of(ORIGIN, STOP, DESTINATION);
        captureState(trackingId);
        requestJson = "{\"selectedItinerary\":["
                + itinerary.stream().map(p -> "{\"portCode\":" + p + "}").collect(Collectors.joining(","))
                + "]}";

        perform(trackingId, post(ROUTE_PATH, id(trackingId))
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestJson));
    }

    @When("delivery to the receiver is reported for cargo {string}")
    public void deliveryToTheReceiverIsReportedForCargo(String trackingId) {
        report(trackingId, eventJson(HandlingEventType.Deliver, DESTINATION, null));
    }

    // --- Then -------------------------------------------------------------

    @Then("cargo {string} derives its new status from the recorded events")
    public void cargoDerivesItsNewStatusFromTheRecordedEvents(String trackingId) {
        assertSuccessful();

        Cargo cargo = cargo(trackingId);
        DeliveryHistory history = cargo.getHistory();
        List<HandlingEvent> events = history.getEvents();

        assertNotNull(events, "The cargo's history holds no events. " + diagnostics());
        assertEquals(eventCountBefore + 1, events.size(),
                "The reported event was not recorded. " + diagnostics());

        HandlingEvent recorded = events.get(events.size() - 1);
        assertNotEquals(statusBefore, cargo.getStatus(),
                "The status was not derived from the event: it is unchanged. " + diagnostics());
        assertSame(recorded, history.getLastValidEvent(),
                "The event did not become the last valid event, so it was not treated as valid. " + diagnostics());
    }

    @Then("the new status is stored on cargo {string}")
    public void theNewStatusIsStoredOnCargo(String trackingId) {
        // The response and the stored record must agree: the status was persisted, not only computed
        Object returned = readOrNull("$.event");
        assertNotNull(returned, "The response contains no event. " + diagnostics());

        Cargo stored = cargo(trackingId);
        assertNotNull(stored.getStatus(), "The stored cargo has no status. " + diagnostics());
        assertNotEquals(statusBefore, stored.getStatus(),
                "The new status was not stored. " + diagnostics());
    }

    @Then("the status of cargo {string} becomes RECEIVED")
    public void theStatusOfCargoBecomesReceived(String trackingId) {
        assertStatus(trackingId, TransportStatus.Received);
    }

    @Then("the status of cargo {string} becomes READY")
    public void theStatusOfCargoBecomesReady(String trackingId) {
        assertStatus(trackingId, TransportStatus.Ready);
    }

    @Then("the status of cargo {string} becomes DELIVERED")
    public void theStatusOfCargoBecomesDelivered(String trackingId) {
        assertStatus(trackingId, TransportStatus.Delivered);
    }

    @Then("cargo {string} does not become READY")
    public void cargoDoesNotBecomeReady(String trackingId) {
        Cargo cargo = cargo(trackingId);
        assertNotEquals(TransportStatus.Ready, cargo.getStatus(),
                "The cargo became READY although it has no itinerary. " + diagnostics());

        List<SharedLocation> itinerary = cargo.getItinerary();
        assertTrue(itinerary == null || itinerary.isEmpty(),
                "Precondition broken: the cargo acquired an itinerary. " + diagnostics());
    }

    // --- helpers ---------------------------------------------------------

    private void assertStatus(String trackingLabel, TransportStatus expected) {
        assertSuccessful();
        assertEquals(expected, cargo(trackingLabel).getStatus(),
                "The cargo is in the wrong state. " + diagnostics());
    }

    private void seedCargo(String trackingLabel, TransportStatus status, List<Integer> itinerary) {
        CarrierMovement delivery = new CarrierMovement();
        delivery.setSource(new SharedLocation(ORIGIN));
        delivery.setDestination(new SharedLocation(DESTINATION));

        DeliverySpecification goal = new DeliverySpecification();
        goal.setDelivery(delivery);
        goal.setDeadline(DEADLINE);

        SharedCustomer role = new SharedCustomer();
        role.setCustomerId(1);

        // One prior event, so "last valid event" has a value to keep or replace
        HandlingEvent prior = new HandlingEvent();
        prior.setType(HandlingEventType.Receive);
        prior.setPort(new SharedLocation(ORIGIN));
        prior.setReportedTime(reportedTime++);

        DeliveryHistory history = new DeliveryHistory();
        history.setEvents(new ArrayList<>(List.of(prior)));
        history.setLastValidEvent(prior);

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

    /** A carrier movement is sent only for TRANSPORT events; a port is always sent. */
    private String eventJson(HandlingEventType type, Integer portCode, int[] leg) {
        String carrierMovement = leg == null
                ? "null"
                : "{\"source\":{\"portCode\":" + leg[0] + "},\"destination\":{\"portCode\":" + leg[1] + "}}";
        return "{\"port\":{\"portCode\":" + portCode + "}"
                + ",\"eventType\":\"" + type.name() + "\""
                + ",\"carrierMovement\":" + carrierMovement
                + ",\"reportedTime\":" + reportedTime++ + "}";
    }

    private void report(String trackingLabel, String json) {
        captureState(trackingLabel);
        requestJson = json;
        perform(trackingLabel, post(EVENT_PATH, id(trackingLabel))
                .contentType(MediaType.APPLICATION_JSON)
                .content(json));
    }

    private void captureState(String trackingLabel) {
        Cargo before = cargos.byId(id(trackingLabel)).orElse(null);
        DeliveryHistory history = before == null ? null : before.getHistory();
        List<HandlingEvent> events = history == null ? null : history.getEvents();
        statusBefore = before == null ? null : before.getStatus();
        eventCountBefore = events == null ? 0 : events.size();
        lastValidEventBefore = history == null ? null : history.getLastValidEvent();
    }

    private void perform(String trackingLabel,
                         org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder request) {
        lastTrackingLabel = trackingLabel;
        unhandledException = null;
        try {
            result = mockMvc.perform(request).andReturn();
            body = result.getResponse().getContentAsString();
        } catch (Exception e) {
            // No exception handler mapped it: a real client would receive a 500
            unhandledException = rootCause(e);
            result = null;
            body = null;
        }
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
            stored = ", statusBefore=" + statusBefore
                    + ", storedStatus=" + c.getStatus()
                    + ", storedItinerary=" + (c.getItinerary() == null ? "null"
                            : c.getItinerary().stream().map(SharedLocation::getPortCode).toList())
                    + ", storedEventCount=" + (events == null ? "null" : events.size())
                    + ", lastValidEventType=" + (history == null || history.getLastValidEvent() == null
                            ? "null" : history.getLastValidEvent().getType());
        }

        return "status=" + status()
                + ", body=" + (body == null || body.isBlank() ? "<empty>" : body)
                + ", exception=" + exception
                + ", request=" + requestJson
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