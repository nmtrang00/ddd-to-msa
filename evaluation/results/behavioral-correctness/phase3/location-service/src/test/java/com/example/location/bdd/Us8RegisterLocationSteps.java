package com.example.location.bdd;

import com.example.location.domain.Location;
import com.example.location.repository.LocationRepository;
import com.jayway.jsonpath.JsonPath;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/** US8 - Register a location. 1 scenario. */
public class Us8RegisterLocationSteps {

    private static final String REGISTER_PATH = "/location";
    private static final String ID_FIELD = "portCode";   // Java field name of the @Id
    private static final String LOCATION_JSON = "$.location";

    @Autowired private MockMvc mockMvc;
    @Autowired private LocationRepository locationRepository; // the @MockitoBean from the configuration

    private final AtomicLong idSequence = new AtomicLong(1);

    private MvcResult result;
    private String responseBody;
    private Location savedEntity;

    @Before
    public void stubRepository() {
        reset(locationRepository);
        // Simulate the database: assign a generated identifier on save
        when(locationRepository.save(any(Location.class))).thenAnswer(invocation -> {
            Location location = invocation.getArgument(0);
            ReflectionTestUtils.setField(location, ID_FIELD, idSequence.getAndIncrement());
            return location;
        });
    }

    // --- US8-S1: A new location is registered -----------------------------

    @When("I register a location with name {string}")
    public void iRegisterALocationWithName(String name) throws Exception {
        String json = "{\"name\":\"" + name.replace("\\", "\\\\").replace("\"", "\\\"") + "\"}";

        result = mockMvc.perform(post(REGISTER_PATH)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andReturn();
        responseBody = result.getResponse().getContentAsString();
    }

    @Then("a location record is created")
    public void aLocationRecordIsCreated() {
        int status = result.getResponse().getStatus();
        assertTrue(status >= 200 && status < 300, "Expected 2xx but got " + status + ": " + responseBody);

        // The service must have persisted exactly one location
        ArgumentCaptor<Location> captor = ArgumentCaptor.forClass(Location.class);
        verify(locationRepository, times(1)).save(captor.capture());
        savedEntity = captor.getValue();

        assertNotNull(JsonPath.read(responseBody, LOCATION_JSON), "Response did not contain a location: " + responseBody);
    }

    @Then("it has the name {string}")
    public void itHasTheName(String name) {
        String returnedName = JsonPath.read(responseBody, LOCATION_JSON + ".name");
        assertEquals(name, returnedName, "Name in response is wrong");

        assertEquals(name, ReflectionTestUtils.getField(savedEntity, "name"), "Name sent to the repository is wrong");
    }

    @Then("it is assigned an immutable identifier")
    public void itIsAssignedAnImmutableIdentifier() {
        Object rawId = JsonPath.read(responseBody, LOCATION_JSON + "." + ID_FIELD);
        assertNotNull(rawId, "Response location has no identifier: " + responseBody);
        long returnedId = ((Number) rawId).longValue();
        assertTrue(returnedId > 0, "Identifier should be a generated positive value");

        // The identifier in the response is the one generated on save
        assertEquals(returnedId, ((Number) ReflectionTestUtils.getField(savedEntity, ID_FIELD)).longValue(),
                "Returned identifier does not match the persisted one");

        // Registration saved once; the entity was not re-saved under a different id
        verify(locationRepository, times(1)).save(any(Location.class));
    }
}