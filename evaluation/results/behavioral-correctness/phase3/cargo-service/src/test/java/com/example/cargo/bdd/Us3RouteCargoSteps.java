package com.example.cargo.bdd;

import com.example.cargo.domain.*;
import com.example.cargo.outboundAdapter.RoutePlanningOutboundAdapter;
import com.example.cargo.payload.Itinerary;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.PathNotFoundException;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/** US3 - Route a cargo. 5 scenarios. */
public class Us3RouteCargoSteps {

    // Adjust these two to match CargoController if the scenarios come back 404.
    private static final String ROUTE_PATH = "/cargo/{trackingId}";
    private static final String CANDIDATES_PATH = "/cargo/requestRouteCandidates/{trackingId}";
    
    private static final int ORIGIN = 10;
    private static final int DESTINATION = 20;
    private static final int INTERMEDIATE = 15;
    private static final int ALTERNATIVE_INTERMEDIATE = 16;
    private static final int DEADLINE = 1796083200; // 2026-12-01, unix seconds

    @Autowired private MockMvc mockMvc;
    @Autowired private CargoRepositoryFake cargos;
    @Autowired private RoutePlanningOutboundAdapter routePlanningAdapter;

    // Feature-file tracking labels mapped to the model's Integer identifiers
    private final Map<String, Integer> trackingIds = new LinkedHashMap<>();
    private int nextTrackingId = 1;

    private List<List<Integer>> offeredCandidates = List.of();
    private List<Integer> returnedCandidateFirst;
    private List<Integer> pendingItinerary;
    private List<Integer> assignedItinerary;
    private List<SharedLocation> itineraryBefore;

    private String requestJson;
    private MvcResult result;
    private String body;
    private Throwable unhandledException;

    @Before
    public void resetRoutePlanningAdapter() {
        reset(routePlanningAdapter);
        when(routePlanningAdapter.getRouteCandidates(any(), any())).thenReturn(List.of());
    }

    // --- Given ------------------------------------------------------------

    @Given("a booked cargo {string} that is UNROUTED")
    public void aBookedCargoThatIsUnrouted(String trackingId) {
        seedCargo(trackingId, null, TransportStatus.Unreceived);
    }

    @Given("a cargo {string} that is already ROUTED")
    public void aCargoThatIsAlreadyRouted(String trackingId) {
        seedCargo(trackingId, List.of(ORIGIN, INTERMEDIATE, DESTINATION), TransportStatus.Ready);
    }

    @Given("a set of candidate itineraries has been obtained for cargo {string}")
    public void aSetOfCandidateItinerariesHasBeenObtained(String trackingId) {
        offeredCandidates = List.of(
                List.of(ORIGIN, INTERMEDIATE, DESTINATION),
                List.of(ORIGIN, ALTERNATIVE_INTERMEDIATE, DESTINATION));
        stubCandidates(offeredCandidates);

        iRequestThePossibleRoutesForCargo(trackingId);

        List<List<Integer>> returned = returnedCandidates();
        assertFalse(returned.isEmpty(), "Precondition failed: no candidates were returned. " + diagnostics());
        returnedCandidateFirst = returned.get(0);
    }

    @Given("an itinerary obtained outside the candidate set")
    public void anItineraryObtainedOutsideTheCandidateSet() {
        pendingItinerary = List.of(77, 88);
        assertFalse(offeredCandidates.contains(pendingItinerary), "This itinerary is in the candidate set");
    }

    @Given("that itinerary does not satisfy the route specification of cargo {string}")
    public void thatItineraryDoesNotSatisfyTheRouteSpecification(String trackingId) {
        assertNotNull(pendingItinerary, "No itinerary was obtained in a previous step");
        Cargo cargo = cargo(trackingId);
        CarrierMovement delivery = cargo.getGoal().getDelivery();
        assertFalse(pendingItinerary.get(0).equals(delivery.getSource().getPortCode())
                        && pendingItinerary.get(pendingItinerary.size() - 1).equals(delivery.getDestination().getPortCode()),
                "Precondition failed: the itinerary does satisfy the route specification");
    }

    @Given("no itinerary satisfying the route specification of cargo {string} exists")
    public void noItinerarySatisfyingTheRouteSpecificationExists(String trackingId) {
        offeredCandidates = List.of();
        stubCandidates(offeredCandidates);
    }

    // --- When -------------------------------------------------------------

    @When("I request the possible routes for cargo {string}")
    public void iRequestThePossibleRoutesForCargo(String trackingId) {
        requestJson = "<no body>";
        perform(() -> mockMvc.perform(get(CANDIDATES_PATH, id(trackingId))).andReturn());
    }

    @When("I assign the first candidate itinerary to cargo {string}")
    public void iAssignTheFirstCandidateItineraryToCargo(String trackingId) {
        assertNotNull(returnedCandidateFirst, "No candidates were obtained in a previous step");
        assignItinerary(trackingId, returnedCandidateFirst);
    }

    @When("I assign that itinerary to cargo {string}")
    public void iAssignThatItineraryToCargo(String trackingId) {
        assertNotNull(pendingItinerary, "No itinerary was obtained in a previous step");
        assignItinerary(trackingId, pendingItinerary);
    }

    @When("I assign a different itinerary to cargo {string}")
    public void iAssignADifferentItineraryToCargo(String trackingId) {
        assignItinerary(trackingId, List.of(ORIGIN, ALTERNATIVE_INTERMEDIATE, DESTINATION));
    }

    // --- US3-S1: Route candidates are requested ---------------------------

    @Then("the route specification of cargo {string} is passed to the pathfinder service")
    public void theRouteSpecificationIsPassedToThePathfinder(String trackingId) {
        assertSuccessful();
        CarrierMovement delivery = cargo(trackingId).getGoal().getDelivery();

        ArgumentCaptor<SharedLocation> destinationArg = ArgumentCaptor.forClass(SharedLocation.class);
        ArgumentCaptor<SharedLocation> sourceArg = ArgumentCaptor.forClass(SharedLocation.class);
        verify(routePlanningAdapter, times(1)).getRouteCandidates(destinationArg.capture(), sourceArg.capture());

        assertEquals(delivery.getSource().getPortCode(), sourceArg.getValue().getPortCode(),
                "The origin sent to the pathfinder is wrong (origin and destination may be swapped). " + diagnostics());
        assertEquals(delivery.getDestination().getPortCode(), destinationArg.getValue().getPortCode(),
                "The destination sent to the pathfinder is wrong (origin and destination may be swapped). " + diagnostics());
    }

    @Then("every returned candidate starts at the origin of cargo {string}")
    public void everyReturnedCandidateStartsAtTheOrigin(String trackingId) {
        Integer origin = cargo(trackingId).getGoal().getDelivery().getSource().getPortCode();
        List<List<Integer>> candidates = returnedCandidates();
        // assertFalse(candidates.isEmpty(), "No candidates were returned. " + diagnostics());
        for (List<Integer> candidate : candidates) {
            assertFalse(candidate.isEmpty(), "A candidate has no ports. " + diagnostics());
            assertEquals(origin, candidate.get(0), "Candidate " + candidate + " does not start at the origin");
        }
    }

    @Then("every returned candidate ends at the destination of cargo {string}")
    public void everyReturnedCandidateEndsAtTheDestination(String trackingId) {
        Integer destination = cargo(trackingId).getGoal().getDelivery().getDestination().getPortCode();
        for (List<Integer> candidate : returnedCandidates()) {
            assertFalse(candidate.isEmpty(), "A candidate has no ports. " + diagnostics());
            assertEquals(destination, candidate.get(candidate.size() - 1),
                    "Candidate " + candidate + " does not end at the destination");
        }
    }

    @Then("each candidate is an ordered sequence of legs")
    public void eachCandidateIsAnOrderedSequenceOfLegs() {
        for (List<Integer> candidate : returnedCandidates()) {
            assertTrue(candidate.size() >= 2,
                    "Candidate " + candidate + " has fewer than two ports, so it forms no leg. " + diagnostics());
            for (int i = 1; i < candidate.size(); i++) {
                assertNotEquals(candidate.get(i - 1), candidate.get(i),
                        "Candidate " + candidate + " repeats a port at position " + i);
            }
        }
    }

    // --- US3-S2: An itinerary is assigned ---------------------------------

    @Then("the itinerary is attached to cargo {string}")
    public void theItineraryIsAttachedToCargo(String trackingId) {
        assertSuccessful();
        assertNotNull(assignedItinerary, "No itinerary was assigned in a previous step");

        List<Integer> stored = portCodes(cargo(trackingId).getItinerary());
        assertEquals(assignedItinerary, stored, "The stored itinerary differs from the assigned one. " + diagnostics());

        assertEquals(assignedItinerary, itineraryFromResponse("$.updatedCargo.itinerary"),
                "The itinerary in the response is wrong. " + diagnostics());
    }

    @Then("the itinerary records the ports at which the cargo is unloaded")
    public void theItineraryRecordsTheUnloadPorts() {
        List<Integer> stored = portCodes(cargo(currentTrackingLabel()).getItinerary());
        assertNotNull(stored, "The cargo has no itinerary. " + diagnostics());
        assertTrue(stored.size() >= 2,
                "The itinerary " + stored + " does not record a sequence of ports. " + diagnostics());
        assertEquals(assignedItinerary, stored, "The itinerary does not record the assigned ports. " + diagnostics());
    }

    // --- US3-S3 / S4 / S5 -------------------------------------------------

    @Then("the assignment is refused")
    public void theAssignmentIsRefused() {
        assertEquals(400, status(), "Expected 400. " + diagnostics());
        assertEquals(Boolean.FALSE, readOrNull("$.success"),
                "Rejected by the framework, not by the service's business rules. " + diagnostics());
    }

    @Then("cargo {string} remains UNROUTED")
    public void cargoRemainsUnrouted(String trackingId) {
        List<SharedLocation> stored = cargo(trackingId).getItinerary();
        assertTrue(stored == null || stored.isEmpty(),
                "The cargo was routed although the assignment should be refused: " + stored + ". " + diagnostics());
    }

    @Then("an empty set of candidates is returned")
    public void anEmptySetOfCandidatesIsReturned() {
        assertSuccessful();
        assertTrue(returnedCandidates().isEmpty(), "Candidates were returned. " + diagnostics());
    }

    @Then("the original itinerary is retained")
    public void theOriginalItineraryIsRetained() {
        assertNotNull(itineraryBefore, "No cargo was routed in a previous step");
        List<Integer> before = portCodes(itineraryBefore);
        List<Integer> now = portCodes(cargo(currentTrackingLabel()).getItinerary());
        assertEquals(before, now, "The itinerary was replaced. " + diagnostics());
    }

    // --- helpers ---------------------------------------------------------
    private void seedCargo(String trackingLabel, List<Integer> itinerary, TransportStatus status) {
        CarrierMovement delivery = new CarrierMovement();
        delivery.setSource(new SharedLocation(ORIGIN));
        delivery.setDestination(new SharedLocation(DESTINATION));

        DeliverySpecification goal = new DeliverySpecification();
        goal.setDelivery(delivery);
        goal.setDeadline(DEADLINE);

        SharedCustomer role = new SharedCustomer();
        role.setCustomerId(1);

        Cargo cargo = new Cargo();
        cargo.setTrackingId(id(trackingLabel));
        cargo.setRole(role);
        cargo.setGoal(goal);
        cargo.setStatus(status);
        cargo.setHistory(new DeliveryHistory());
        if (itinerary != null) {
            cargo.setItinerary(itinerary.stream().map(SharedLocation::new).collect(Collectors.toList()));
        }
        cargos.seed(cargo);
        itineraryBefore = cargo.getItinerary() == null ? null : new ArrayList<>(cargo.getItinerary());
    }

    private void assignItinerary(String trackingLabel, List<Integer> ports) {
        assignedItinerary = ports;
        lastTrackingLabel = trackingLabel;

        Cargo before = cargos.byId(id(trackingLabel)).orElse(null);
        itineraryBefore = before == null || before.getItinerary() == null ? null : new ArrayList<>(before.getItinerary());

        requestJson = "{\"selectedItinerary\":["
                + ports.stream().map(p -> "{\"portCode\":" + p + "}").collect(Collectors.joining(","))
                + "]}";

        perform(() -> mockMvc.perform(post(ROUTE_PATH, id(trackingLabel))
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestJson))
                .andReturn());
    }

    private void stubCandidates(List<List<Integer>> candidates) {
        List<Itinerary> payloads = candidates.stream()
                .map(ports -> new Itinerary(ports.stream().map(SharedLocation::new).collect(Collectors.toList())))
                .collect(Collectors.toList());
        when(routePlanningAdapter.getRouteCandidates(any(), any())).thenReturn(payloads);
    }

    private interface Call { MvcResult run() throws Exception; }

    private void perform(Call call) {
        unhandledException = null;
        try {
            result = call.run();
            body = result.getResponse().getContentAsString();
        } catch (Exception e) {
            // No exception handler mapped it: a real client would receive a 500
            unhandledException = rootCause(e);
            result = null;
            body = null;
        }
    }

    private String lastTrackingLabel;

    private String currentTrackingLabel() {
        assertNotNull(lastTrackingLabel, "No cargo was addressed in a previous step");
        return lastTrackingLabel;
    }

    private int id(String trackingLabel) {
        String v = trackingLabel.trim();
        if (v.matches("\\d+")) return Integer.parseInt(v);
        return trackingIds.computeIfAbsent(v, k -> nextTrackingId++);
    }

    private Cargo cargo(String trackingLabel) {
        return cargos.byId(id(trackingLabel))
                .orElseThrow(() -> new AssertionError("No stored cargo " + trackingLabel + " (id " + id(trackingLabel) + ")"));
    }

    private static List<Integer> portCodes(List<SharedLocation> locations) {
        return locations == null ? null : locations.stream().map(SharedLocation::getPortCode).collect(Collectors.toList());
    }

    @SuppressWarnings("unchecked")
    private List<List<Integer>> returnedCandidates() {
        Object raw = readOrNull("$.candidates");
        if (raw == null) return List.of();
        List<Map<String, Object>> candidates = (List<Map<String, Object>>) raw;
        List<List<Integer>> out = new ArrayList<>();
        for (Map<String, Object> candidate : candidates) {
            List<Map<String, Object>> ports = (List<Map<String, Object>>) candidate.get("ports");
            List<Integer> codes = new ArrayList<>();
            if (ports != null) {
                for (Map<String, Object> port : ports) codes.add(((Number) port.get("portCode")).intValue());
            }
            out.add(codes);
        }
        return out;
    }

    @SuppressWarnings("unchecked")
    private List<Integer> itineraryFromResponse(String path) {
        Object raw = readOrNull(path);
        if (raw == null) return null;
        List<Map<String, Object>> ports = (List<Map<String, Object>>) raw;
        return ports.stream().map(p -> ((Number) p.get("portCode")).intValue()).collect(Collectors.toList());
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
            exception = "UNHANDLED " + unhandledException.getClass().getSimpleName() + ": " + unhandledException.getMessage();
        } else {
            Exception resolved = result.getResolvedException();
            exception = resolved == null ? "none" : resolved.getClass().getSimpleName() + ": " + resolved.getMessage();
        }
        String hint = status() == 404 ? " [404: check CANDIDATES_PATH / ROUTE_PATH against CargoController]" : "";
        return "status=" + status() + hint
                + ", body=" + (body == null || body.isBlank() ? "<empty>" : body)
                + ", exception=" + exception
                + ", request=" + requestJson
                + ", trackingIds=" + trackingIds;
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