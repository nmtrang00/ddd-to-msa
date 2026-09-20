@US8 @location
Feature: US8 - Register a location
  As a Logistics Officer
  I want to register a new location
  So that cargo delivery can be specified with the location

  @US8-S1
  Scenario: A new location is registered
    When I register a location with name "Rotterdam"
    Then a location record is created
    And it has the name "Rotterdam"
    And it is assigned an immutable identifier
