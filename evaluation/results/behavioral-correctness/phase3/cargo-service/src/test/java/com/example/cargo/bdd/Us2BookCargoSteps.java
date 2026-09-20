package com.example.cargo.bdd;

import com.example.cargo.domain.Cargo;
import com.example.cargo.exception.CustomerNotFound;
import com.example.cargo.outboundAdapter.CustomerOutboundAdapter;
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

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/** US2 - Book a cargo. 5 scenarios. */
public class Us2BookCargoSteps {

    private static final String BOOK_PATH = "/cargo";
    private static final String CARGO = "$.newCargo";

    /** First identifier handed out for ports that are NOT in the location registry. */
    private static final int UNREGISTERED_CODE_START = 9001;

    @Autowired private MockMvc mockMvc;
    @Autowired private CargoRepositoryFake cargos;
    @Autowired private CustomerOutboundAdapter customerAdapter;
    @Autowired private LocationOutboundAdapter locationAdapter;

    // --- Location registry for this scenario (Cucumber creates a new instance per scenario) ---
    private final Map<String, Integer> registeredPorts = new LinkedHashMap<>();
    private final Map<String, Integer> unregisteredPorts = new LinkedHashMap<>();
    private int nextRegisteredCode = 1;
    private int nextUnregisteredCode = UNREGISTERED_CODE_START;

    // --- Request / response state ---
    private Set<Integer> idsBefore;
    private int countBefore;
    private String requestJson;
    private MvcResult result;
    private String body;
    private Throwable unhandledException;

    @Before
    public void resetOutboundAdapters() {
        reset(customerAdapter, locationAdapter);
        // Nothing exists unless a Given says so
        when(customerAdapter.checkCustomerExists(anyInt())).thenReturn(false);
        when(locationAdapter.checkLocation(anyInt())).thenReturn(false);
    }

    // --- Given ------------------------------------------------------------

    @Given("a customer is registered with identifier {int}")
    public void aCustomerIsRegisteredWithIdentifier(int customerId) {
        when(customerAdapter.checkCustomerExists(customerId)).thenReturn(true);
    }

    @Given("no customer is registered with identifier {int}")
    public void noCustomerIsRegisteredWithIdentifier(int customerId) {
        when(customerAdapter.checkCustomerExists(customerId)).thenReturn(false);
    }

    @Given("the port {string} is known to the location registry")
    public void thePortIsKnownToTheLocationRegistry(String portName) {
        unregisteredPorts.remove(portName);
        int code = registeredPorts.computeIfAbsent(portName, n -> nextRegisteredCode++);
        when(locationAdapter.checkLocation(code)).thenReturn(true);
    }

    @Given("the port {string} is not held in the location registry")
    public void thePortIsNotHeldInTheLocationRegistry(String portName) {
        registeredPorts.remove(portName);
        int code = unregisteredPorts.computeIfAbsent(portName, n -> nextUnregisteredCode++);
        when(locationAdapter.checkLocation(code)).thenReturn(false);
    }

    // --- When -------------------------------------------------------------

    @When("I book a cargo for customer {int} from {string} to {string} with deadline {string}")
    public void iBookACargo(int customerId, String origin, String destination, String deadline) {
        idsBefore = cargos.ids();
        countBefore = cargos.count();

        Integer unixDeadline = toUnixSeconds(deadline);
        requestJson = "{\"customerId\":" + customerId
                + ",\"srcPort\":" + portCode(origin)
                + ",\"destPort\":" + portCode(destination)
                // An unparseable deadline is sent as-is, so the framework rejection stays visible
                + ",\"deadline\":" + (unixDeadline != null ? unixDeadline.toString() : jsonString(deadline)) + "}";

        try {
            result = mockMvc.perform(post(BOOK_PATH)
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(requestJson))
                    .andReturn();
            body = result.getResponse().getContentAsString();
        } catch (Exception e) {
            // No exception handler mapped it: a real client would receive a 500
            unhandledException = rootCause(e);
            result = null;
            body = null;
        }
    }

    // --- US2-S1: A cargo is booked ---------------------------------------

    @Then("a cargo is created with a new tracking identifier")
    public void aCargoIsCreatedWithANewTrackingIdentifier() {
        int status = status();
        assertTrue(status >= 200 && status < 300, "Expected 2xx. " + diagnostics());
        assertEquals(countBefore + 1, cargos.count(), "Exactly one cargo should have been stored. " + diagnostics());

        Integer id = returnedTrackingId();
        assertTrue(id > 0, "Tracking identifier should be a generated positive value. " + diagnostics());
        assertFalse(idsBefore.contains(id), "Tracking identifier " + id + " was already in use");
        assertTrue(cargos.byId(id).isPresent(), "Returned tracking identifier does not match a stored cargo. " + diagnostics());
    }

    @Then("customer {int} is recorded as its shipper")
    public void customerIsRecordedAsItsShipper(int customerId) {
        assertEquals(Integer.valueOf(customerId), intOrNull(CARGO + ".role.customerId"),
                "Shipper in response is wrong. " + diagnostics());

        Cargo stored = storedCargo();
        assertNotNull(stored.getRole(), "Stored cargo has no shipper. Stored: " + stored);
        assertEquals(customerId, stored.getRole().getCustomerId(), "Stored shipper is wrong. Stored: " + stored);
    }

    @Then("the route specification records origin {string}, destination {string} and deadline {string}")
    public void theRouteSpecificationRecords(String origin, String destination, String deadline) {
        Integer expectedOrigin = portCode(origin);
        Integer expectedDestination = portCode(destination);
        Integer expectedDeadline = toUnixSeconds(deadline);
        assertNotNull(expectedDeadline, "Feature file deadline '" + deadline + "' is not a date or unix time");

        Cargo stored = storedCargo();
        assertNotNull(stored.getGoal(), "Stored cargo has no route specification. Stored: " + stored);
        assertNotNull(stored.getGoal().getDelivery(), "Route specification has no origin/destination. Stored: " + stored);
        assertNotNull(stored.getGoal().getDelivery().getSource(), "Route specification has no origin. Stored: " + stored);
        assertNotNull(stored.getGoal().getDelivery().getDestination(), "Route specification has no destination. Stored: " + stored);

        assertEquals(expectedOrigin, stored.getGoal().getDelivery().getSource().getPortCode(),
                "Origin is wrong (" + origin + " = " + expectedOrigin + "). Stored: " + stored);
        assertEquals(expectedDestination, stored.getGoal().getDelivery().getDestination().getPortCode(),
                "Destination is wrong (" + destination + " = " + expectedDestination + "). Stored: " + stored);
        assertEquals(expectedDeadline, stored.getGoal().getDeadline(),
                "Deadline is wrong (" + deadline + " = " + expectedDeadline + " unix seconds). Stored: " + stored);

        assertEquals(expectedOrigin, intOrNull(CARGO + ".goal.delivery.source.portCode"),
                "Origin in response is wrong. " + diagnostics());
        assertEquals(expectedDestination, intOrNull(CARGO + ".goal.delivery.destination.portCode"),
                "Destination in response is wrong. " + diagnostics());
        assertEquals(expectedDeadline, intOrNull(CARGO + ".goal.deadline"),
                "Deadline in response is wrong. " + diagnostics());
    }

    @Then("the cargo has no itinerary")
    public void theCargoHasNoItinerary() {
        List<?> stored = storedCargo().getItinerary();
        assertTrue(stored == null || stored.isEmpty(), "Stored cargo already has an itinerary: " + stored);

        Object returned = readOrNull(CARGO + ".itinerary");
        assertTrue(returned == null || (returned instanceof List<?> l && l.isEmpty()),
                "Response cargo already has an itinerary: " + returned);
    }

    @Then("the cargo is reported as UNRECEIVED")
    public void theCargoIsReportedAsUnrouted() {
        Object status = readOrNull(CARGO + ".status");
        String normalized = String.valueOf(status).replace("_", "").toUpperCase(Locale.ROOT);
        assertEquals("UNRECEIVED", normalized,
                "Cargo status is '" + status + "'. The model's TransportStatus enum has no UNROUTED value. " + diagnostics());
    }

    // --- US2-S2 / S3 / S4 / S5 -------------------------------------------

    @Then("no cargo is created")
    public void noCargoIsCreated() {
        int status = status();
        assertTrue(status >= 400 && status < 500, "Expected a 4xx rejection. " + diagnostics());
        assertEquals(countBefore, cargos.count(), "A cargo was stored although booking should be rejected. " + diagnostics());
    }

    @Then("I am informed that the customer does not exist")
    public void iAmInformedThatTheCustomerDoesNotExist() {
        assertRejectedWith(new CustomerNotFound().getMessage());
    }

    @Then("I am informed that the location does not exist")
    public void iAmInformedThatTheLocationDoesNotExist() {
        assertRejectedWith(null);
        String error = String.valueOf(readOrNull("$.error")).toLowerCase(Locale.ROOT);
        assertTrue(error.contains("location") || error.contains("port"),
                "Error does not mention the location. " + diagnostics());
    }

    @Then("the route specification is rejected as invalid")
    public void theRouteSpecificationIsRejectedAsInvalid() {
        assertRejectedWith(null);
    }

    // --- helpers ---------------------------------------------------------

    /**
     * Resolves a port name to the model's Integer portCode, i.e. its Location identifier.
     * Registered ports get their registry identifier; any other port gets an identifier the registry does not hold.
     */
    private Integer portCode(String portName) {
        String name = portName.trim();
        if (name.matches("\\d+")) return Integer.valueOf(name); // already a code
        Integer registered = registeredPorts.get(name);
        if (registered != null) return registered;
        return unregisteredPorts.computeIfAbsent(name, n -> nextUnregisteredCode++);
    }

    /** HTTP status the client sees; an exception no handler mapped counts as 500. */
    private int status() {
        return result != null ? result.getResponse().getStatus() : 500;
    }

    private void assertRejectedWith(String expectedError) {
        assertEquals(400, status(), "Expected 400. " + diagnostics());
        assertEquals(Boolean.FALSE, readOrNull("$.success"),
                "Rejected by the framework, not by the service's business rules. " + diagnostics());
        if (expectedError != null) {
            assertEquals(expectedError, readOrNull("$.error"), "Wrong error message. " + diagnostics());
        }
    }

    /** Explains a response: status, body, exception, request, and the port-code mapping used. */
    private String diagnostics() {
        String exception;
        if (unhandledException != null) {
            exception = "UNHANDLED " + unhandledException.getClass().getSimpleName() + ": " + unhandledException.getMessage();
        } else {
            Exception resolved = result.getResolvedException();
            exception = resolved == null ? "none" : resolved.getClass().getSimpleName() + ": " + resolved.getMessage();
        }
        return "status=" + status()
                + ", body=" + (body == null || body.isBlank() ? "<empty>" : body)
                + ", exception=" + exception
                + ", request=" + requestJson
                + ", registeredPorts=" + registeredPorts
                + ", unregisteredPorts=" + unregisteredPorts;
    }

    private Integer returnedTrackingId() {
        Object raw = readOrNull(CARGO + ".trackingId");
        assertNotNull(raw, "Response cargo has no tracking identifier. " + diagnostics());
        return ((Number) raw).intValue();
    }

    private Cargo storedCargo() {
        Integer id = returnedTrackingId();
        return cargos.byId(id).orElseThrow(() -> new AssertionError("No stored cargo with tracking id " + id));
    }

    private Integer intOrNull(String path) {
        Object value = readOrNull(path);
        return value instanceof Number n ? n.intValue() : null;
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

    /**
     * Converts a feature-file deadline to the model's encoding: unix time in seconds.
     * Accepts raw seconds ("1796083200"), a date ("2026-12-01", start of day UTC) or an instant ("2026-12-01T00:00:00Z").
     * Returns null if the value can't be parsed.
     */
    private static Integer toUnixSeconds(String raw) {
        String v = raw.trim();
        if (v.matches("-?\\d+")) return Integer.valueOf(v);

        Long seconds;
        try {
            seconds = LocalDate.parse(v).atStartOfDay(ZoneOffset.UTC).toEpochSecond();
        } catch (DateTimeParseException notADate) {
            try {
                seconds = Instant.parse(v).getEpochSecond();
            } catch (DateTimeParseException notAnInstant) {
                return null;
            }
        }
        return Math.toIntExact(seconds); // Integer holds unix seconds only up to 2038-01-19
    }

    private static String jsonString(String value) {
        return "\"" + value.replace("\\", "\\\\").replace("\"", "\\\"") + "\"";
    }
}