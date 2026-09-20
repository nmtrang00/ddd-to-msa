@US1 @customer
Feature: US1 - Register a customer
  As a Logistics Officer
  I want to register a new customer
  So that cargo can be booked on their behalf

  @US1-S1
  Scenario: A new customer is registered
    Given no customer is registered under the email "trading123@gmail.com"
    When I register a customer with email "trading123@gmail.com" and name "Trading BV"
    Then a customer record is created
    And it is assigned an immutable identifier

  @US1-S2
  Scenario: A duplicate customer is rejected
    Given a customer with email "trading123@gmail.com" is already registered
    When I register a customer with email "trading123@gmail.com" and name "Trading BV"
    Then no new customer record is created
    And I am informed that the customer already exists
