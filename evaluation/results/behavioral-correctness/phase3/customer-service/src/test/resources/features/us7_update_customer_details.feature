@US7 @customer
Feature: US7 - Update a customer's details
  As a Logistics Officer
  I want to correct or update a customer's name and contact details
  So that shipping documents are correct and notifications reach the right recipient

  @US7-S1
  Scenario: Updating a known customer is persisted
    Given a customer exists with identifier 1
    When I change the details of customer 1 to name "Trading Holding BV" and email "ops@trading123.com"
    Then the customer record is updated
    And customer 1 has name "Trading Holding BV" and email "ops@trading123.com"

  @US7-S2
  Scenario: Updating an unknown customer is rejected
    Given no customer exists with identifier 99
    When I change the details of customer 99 to name "Trading Holding BV" and email "ops@trading123.com"
    Then nothing is changed
    And I am informed that the customer does not exist
