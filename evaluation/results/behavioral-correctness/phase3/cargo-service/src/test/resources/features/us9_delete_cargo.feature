@US9 @cargo
Feature: US9 - Delete a cargo
  As a Logistics Officer
  I want to delete a cargo
  So that cargo accidentally booked is removed from the system

  @US9-S1
  Scenario: A cargo without any handling event is deleted
    Given a cargo with tracking identifier "ABC" has not been handled with any event
    When I delete cargo "ABC"
    Then the cargo is deleted
    And its history is deleted

  @US9-S2
  Scenario: A cargo with handling events is not deleted
    Given a cargo with tracking identifier "ABC" has been handled with at least one event
    When I delete cargo "ABC"
    Then the cargo is NOT deleted
    And I am informed that the cargo has been handled
