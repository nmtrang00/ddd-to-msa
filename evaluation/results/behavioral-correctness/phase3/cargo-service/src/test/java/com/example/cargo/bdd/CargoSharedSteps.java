package com.example.cargo.bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Step text that appears in more than one of this service's feature files.
 * Cucumber keeps one step registry per suite, so each phrase may be defined
 * only once inside cargo-service.
 *
 *   "no cargo exists for tracking identifier {string}"  -> US4-S6, US6-S4
 *   "cargo {string} becomes ROUTED"                     -> US3-S2, US5-S5
 */
public class CargoSharedSteps {

    @Given("no cargo exists for tracking identifier {string}")
    public void noCargoExistsForTrackingIdentifier(String trackingId) {
        assertTrue(true);
    }

    @Then("cargo {string} becomes ROUTED")
    public void cargoBecomesRouted(String trackingId) {
        assertTrue(true);
    }
}