@US2 @cargo @booking
Feature: US2 - Book a cargo
  As a Logistics Officer
  I want to register a cargo for a customer with an origin, a destination and an arrival deadline
  So that the shipment information is visible in the system
    and the customer immediately receives a tracking identifier

  @US2-S1
  Scenario: A cargo is booked
    Given a customer is registered with identifier 1
    And the port "NLRTM" is known to the location registry
    And the port "USNYC" is known to the location registry
    When I book a cargo for customer 1 from "NLRTM" to "USNYC" with deadline "2026-12-01"
    Then a cargo is created with a new tracking identifier
    And customer 1 is recorded as its shipper
    And the route specification records origin "NLRTM", destination "USNYC" and deadline "2026-12-01"
    And the cargo has no itinerary
    And the cargo is reported as UNRECEIVED

  @US2-S2
  Scenario: Booking for an unknown customer is rejected
    Given no customer is registered with identifier 99
    And the port "NLRTM" is known to the location registry
    And the port "USNYC" is known to the location registry
    When I book a cargo for customer 99 from "NLRTM" to "USNYC" with deadline "2026-12-01"
    Then no cargo is created
    And I am informed that the customer does not exist

  @US2-S3
  Scenario: Booking from an unknown origin is rejected
    Given a customer is registered with identifier 1
    And the port "XXXXX" is not held in the location registry
    And the port "USNYC" is known to the location registry
    When I book a cargo for customer 1 from "XXXXX" to "USNYC" with deadline "2026-12-01"
    Then no cargo is created
    And I am informed that the location does not exist

  @US2-S4
  Scenario: Booking to an unknown destination is rejected
    Given a customer is registered with identifier 1
    And the port "NLRTM" is known to the location registry
    And the port "YYYYY" is not held in the location registry
    When I book a cargo for customer 1 from "NLRTM" to "YYYYY" with deadline "2026-12-01"
    Then no cargo is created
    And I am informed that the location does not exist

  @US2-S5
  Scenario: A meaningless delivery goal is rejected
    Given a customer is registered with identifier 1
    And the port "NLRTM" is known to the location registry
    When I book a cargo for customer 1 from "NLRTM" to "NLRTM" with deadline "2026-12-01"
    Then the route specification is rejected as invalid
    And no cargo is created
