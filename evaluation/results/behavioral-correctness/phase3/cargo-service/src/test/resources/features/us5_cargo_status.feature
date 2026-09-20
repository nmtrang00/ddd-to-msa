@US5 @status
Feature: US5 - Keep cargo status current
  As a Logistics Officer
  I want a cargo's status to be updated automatically whenever it is handled
  So that the company always knows where the shipment stands, without anyone having to ask

  # Scope note: the notification side of US5 is deliberately omitted because the
  # asynchronous messaging to the Notification subdomain is not implemented yet.
  # Omitted: US5-S2 (customer is notified of a change), US5-S3 (no notification
  # without a change), the notification step of US5-S6, and the step "the update
  # takes place separately from the handling event reporting transaction".

  @US5-S1
  Scenario: Status is updated after handling
    Given a routed cargo "ABC123" whose handling follows its itinerary
    When a handling event is published for cargo "ABC123"
    Then cargo "ABC123" derives its new status from the recorded events
    And the new status is stored on cargo "ABC123"

  @US5-S4
  Scenario: A cargo received before it is routed
    Given a cargo "ABC123" that is UNROUTED
    When a receipt is reported for cargo "ABC123"
    Then the status of cargo "ABC123" becomes RECEIVED
    And cargo "ABC123" does not become READY

  @US5-S5
  Scenario: A cargo routed after it is received
    Given a cargo "ABC123" that is RECEIVED but UNROUTED
    When an itinerary is assigned to cargo "ABC123"
    Then cargo "ABC123" becomes ROUTED
    And the status of cargo "ABC123" becomes READY

  @US5-S6
  Scenario: A delivery completes the shipment
    Given a cargo "ABC123" that has been cleared through customs
    When delivery to the receiver is reported for cargo "ABC123"
    Then the status of cargo "ABC123" becomes DELIVERED
