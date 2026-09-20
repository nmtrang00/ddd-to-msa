package com.example.customer.bdd;

import com.example.customer.domain.Customer;
import com.example.customer.exception.DuplicateCustomer;
import com.jayway.jsonpath.JsonPath;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/** US1 - Register a customer. 2 scenarios. */
public class Us1RegisterCustomerSteps {

    private static final String REGISTER_PATH = "/customer";

    @Autowired private MockMvc mockMvc;
    @Autowired private CustomerRepositoryFake customers;

    private String requestedEmail;
    private String requestedName;
    private int countBefore;
    private MvcResult result;
    private String responseBody;

    // --- US1-S1: A new customer is registered -----------------------------

    @Given("no customer is registered under the email {string}")
    public void noCustomerIsRegisteredUnderTheEmail(String email) {
        assertTrue(customers.byEmail(email).isEmpty(), "Precondition failed: a customer with " + email + " already exists");
    }

    @When("I register a customer with email {string} and name {string}")
    public void iRegisterACustomerWithEmailAndName(String email, String name) throws Exception {
        register(email, name);
    }

    @Then("a customer record is created")
    public void aCustomerRecordIsCreated() {
        assertSuccessful();
        assertEquals(countBefore + 1, customers.count(), "Exactly one customer record should have been created");

        List<Customer> stored = customers.byEmail(requestedEmail);
        assertEquals(1, stored.size(),
                "Expected one stored customer with email " + requestedEmail + " but stored records are: " + customers.snapshot());
        assertEquals(1, stored.size(), "Expected one stored customer with email " + requestedEmail);
        assertEquals(requestedName, stored.get(0).getName(), "Stored name is wrong");

        assertEquals(requestedEmail, JsonPath.read(responseBody, "$.customer.email"), "Email in response is wrong");
        assertEquals(requestedName, JsonPath.read(responseBody, "$.customer.name"), "Name in response is wrong");
    }

    @Then("it is assigned an immutable identifier")
    public void itIsAssignedAnImmutableIdentifier() {
        Object rawId = JsonPath.read(responseBody, "$.customer.customerId");
        assertNotNull(rawId, "Response customer has no identifier: " + responseBody);
        long id = ((Number) rawId).longValue();
        assertTrue(id > 0, "Identifier should be a generated positive value");

        Customer stored = customers.byId(id)
                .orElseThrow(() -> new AssertionError("Returned identifier " + id + " does not match a stored customer"));
        assertEquals(requestedEmail, stored.getEmail(), "Identifier points to a different customer");
    }

    // --- US1-S2: A duplicate customer is rejected -------------------------

    @Given("a customer with email {string} is already registered")
    public void aCustomerWithEmailIsAlreadyRegistered(String email) {
        customers.seed(null, "Existing Customer", email);
    }

    @When("I register another customer with email {string} and name {string}")
    public void iRegisterAnotherCustomerWithEmailAndName(String email, String name) throws Exception {
        register(email, name);
    }

    @Then("no new customer record is created")
    public void noNewCustomerRecordIsCreated() {
        assertEquals(countBefore, customers.count(), "A customer record was created for a duplicate email");
        assertEquals(1, customers.byEmail(requestedEmail).size(), "Duplicate email stored more than once");
    }

    @Then("I am informed that the customer already exists")
    public void iAmInformedThatTheCustomerAlreadyExists() {
        assertEquals(400, result.getResponse().getStatus(), "Expected 400 but got: " + responseBody);
        assertEquals(Boolean.FALSE, JsonPath.read(responseBody, "$.success"), "Response should not be successful");
        assertEquals(new DuplicateCustomer().getMessage(), JsonPath.read(responseBody, "$.error"), "Wrong error message");
    }

    // --- helpers ---------------------------------------------------------

    private void register(String email, String name) throws Exception {
        requestedEmail = email;
        requestedName = name;
        countBefore = customers.count();

        result = mockMvc.perform(post(REGISTER_PATH)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\":" + json(name) + ",\"email\":" + json(email) + "}"))
                .andReturn();
        responseBody = result.getResponse().getContentAsString();
    }

    private void assertSuccessful() {
        int status = result.getResponse().getStatus();
        assertTrue(status >= 200 && status < 300, "Expected 2xx but got " + status + ": " + responseBody);
    }

    private static String json(String value) {
        return "\"" + value.replace("\\", "\\\\").replace("\"", "\\\"") + "\"";
    }
}