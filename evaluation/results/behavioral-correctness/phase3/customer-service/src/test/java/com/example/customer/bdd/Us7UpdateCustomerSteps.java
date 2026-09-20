package com.example.customer.bdd;

import com.example.customer.domain.Customer;
import com.example.customer.exception.UnknownCustomer;
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

/** US7 - Update a customer's details. 2 scenarios. */
public class Us7UpdateCustomerSteps {

    private static final String UPDATE_PATH = "/customer/{customerId}";

    @Autowired private MockMvc mockMvc;
    @Autowired private CustomerRepositoryFake customers;

    private long targetId;
    private String requestedName;
    private String requestedEmail;
    private List<Customer> before;
    private MvcResult result;
    private String responseBody;

    // --- US7-S1: Updating a known customer is persisted -------------------

    @Given("a customer exists with identifier {int}")
    public void aCustomerExistsWithIdentifier(int customerId) {
        customers.seed((long) customerId, "Original Name", "original." + customerId + "@example.com");
    }

    @When("I change the details of customer {int} to name {string} and email {string}")
    public void iChangeTheDetailsOfCustomer(int customerId, String name, String email) throws Exception {
        targetId = customerId;
        requestedName = name;
        requestedEmail = email;
        before = customers.snapshot();

        result = mockMvc.perform(post(UPDATE_PATH, customerId)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"newName\":" + json(name) + ",\"newEmail\":" + json(email) + "}"))
                .andReturn();
        responseBody = result.getResponse().getContentAsString();
    }

    @Then("the customer record is updated")
    public void theCustomerRecordIsUpdated() {
        int status = result.getResponse().getStatus();
        assertTrue(status >= 200 && status < 300, "Expected 2xx but got " + status + ": " + responseBody);

        assertEquals(before.size(), customers.count(), "Updating must not create or remove customer records");

        Customer stored = customers.byId(targetId)
                .orElseThrow(() -> new AssertionError("Customer " + targetId + " disappeared after update"));
        assertEquals(requestedName, stored.getName(), "Name change was not persisted");
        assertEquals(requestedEmail, stored.getEmail(), "Email change was not persisted");

        Object rawId = JsonPath.read(responseBody, "$.customer.customerId");
        assertNotNull(rawId, "Response customer has no identifier: " + responseBody);
        assertEquals(targetId, ((Number) rawId).longValue(), "Response refers to a different customer");
    }

    @Then("customer {int} has name {string} and email {string}")
    public void customerHasNameAndEmail(int customerId, String name, String email) {
        Customer stored = customers.byId(customerId)
                .orElseThrow(() -> new AssertionError("Customer " + customerId + " does not exist"));
        assertEquals(name, stored.getName(), "Stored name is wrong");
        assertEquals(email, stored.getEmail(), "Stored email is wrong");

        assertEquals(name, JsonPath.read(responseBody, "$.customer.name"), "Name in response is wrong");
        assertEquals(email, JsonPath.read(responseBody, "$.customer.email"), "Email in response is wrong");
    }

    // --- US7-S2: Updating an unknown customer is rejected -----------------

    @Given("no customer exists with identifier {int}")
    public void noCustomerExistsWithIdentifier(int customerId) {
        assertTrue(customers.byId(customerId).isEmpty(), "Precondition failed: customer " + customerId + " exists");
    }

    @Then("nothing is changed")
    public void nothingIsChanged() {
        assertEquals(before, customers.snapshot(), "Customer records changed after a rejected update");
    }

    @Then("I am informed that the customer does not exist")
    public void iAmInformedThatTheCustomerDoesNotExist() {
        assertEquals(400, result.getResponse().getStatus(), "Expected 400 but got: " + responseBody);
        assertEquals(Boolean.FALSE, JsonPath.read(responseBody, "$.success"), "Response should not be successful");
        assertEquals(new UnknownCustomer().getMessage(), JsonPath.read(responseBody, "$.error"), "Wrong error message");
    }

    // --- helpers ---------------------------------------------------------

    private static String json(String value) {
        return "\"" + value.replace("\\", "\\\\").replace("\"", "\\\"") + "\"";
    }
}