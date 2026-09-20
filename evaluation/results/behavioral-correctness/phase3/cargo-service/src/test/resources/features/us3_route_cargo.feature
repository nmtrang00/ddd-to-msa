@US3 @cargo @routing
Feature: US3 - Route a cargo
  As a Logistics Officer
  I want to obtain the possible routes for a booked cargo and select one
  So that the shipment has a transport plan that meets what was promised
    and may be released for shipping

  @US3-S1
  Scenario: Route candidates are requested
    Given a booked cargo "ABC123" that is UNROUTED
    When I request the possible routes for cargo "ABC123"
    Then the route specification of cargo "ABC123" is passed to the pathfinder service
    And every returned candidate starts at the origin of cargo "ABC123"
    And every returned candidate ends at the destination of cargo "ABC123"
    And each candidate is an ordered sequence of legs

  @US3-S2
  Scenario: An itinerary is assigned
    Given a booked cargo "ABC123" that is UNROUTED
    And a set of candidate itineraries has been obtained for cargo "ABC123"
    When I assign the first candidate itinerary to cargo "ABC123"
    Then the itinerary is attached to cargo "ABC123"
    And cargo "ABC123" becomes ROUTED
    And the itinerary records the ports at which the cargo is unloaded

  @US3-S3
  Scenario: An itinerary that does not satisfy the goal is refused
    Given a booked cargo "ABC123" that is UNROUTED
    And an itinerary obtained outside the candidate set
    And that itinerary does not satisfy the route specification of cargo "ABC123"
    When I assign that itinerary to cargo "ABC123"
    Then the assignment is refused
    And cargo "ABC123" remains UNROUTED

  @US3-S4
  Scenario: No route is available
    Given a booked cargo "ABC123" that is UNROUTED
    And no itinerary satisfying the route specification of cargo "ABC123" exists
    When I request the possible routes for cargo "ABC123"
    Then an empty set of candidates is returned
    And cargo "ABC123" remains UNROUTED

  @US3-S5
  Scenario: An itinerary cannot be replaced
    Given a cargo "ABC123" that is already ROUTED
    When I assign a different itinerary to cargo "ABC123"
    Then the assignment is refused
    And the original itinerary is retained
