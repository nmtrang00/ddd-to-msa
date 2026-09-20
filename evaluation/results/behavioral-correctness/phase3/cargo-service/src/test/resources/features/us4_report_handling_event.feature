Feature: US4 - Report a handling event
  Every reported event is recorded in the cargo's delivery history, so that the history
  is a complete trace of what was reported. An event that matches no transition of the
  cargo's current state marks the cargo as MISHANDLED and does not become its last valid event.

  # --- The normal progression, one transition per scenario ---------------

  @US4-S1
  Scenario: A receipt is reported
    Given a cargo "ABC123" in state UNRECEIVED with itinerary "10,15,20"
    When I report a "Receive" event for cargo "ABC123" at port "10"
    Then the report is accepted
    And the event is recorded in the history of cargo "ABC123"
    And the event becomes the last valid event of cargo "ABC123"
    And cargo "ABC123" is in state RECEIVED

  @US4-S2
  Scenario: A ready cargo is loaded
    Given a cargo "ABC123" in state READY with itinerary "10,15,20"
    When I report a "Load" event for cargo "ABC123" at port "10"
    Then the report is accepted
    And the event is recorded in the history of cargo "ABC123"
    And the event becomes the last valid event of cargo "ABC123"
    And cargo "ABC123" is in state LOADED

  @US4-S3
  Scenario: A loaded cargo departs
    Given a cargo "ABC123" in state LOADED with itinerary "10,15,20"
    When I report a "Transport" event for cargo "ABC123" from port "10" to port "15"
    Then the report is accepted
    And the event is recorded in the history of cargo "ABC123"
    And the event becomes the last valid event of cargo "ABC123"
    And cargo "ABC123" is in state ON_PATH

  @US4-S4
  Scenario: A cargo in transit cannot be transported again without unloading
    Given a cargo "ABC123" in state ON_PATH with itinerary "10,15,20"
    When I report a "Transport" event for cargo "ABC123" from port "15" to port "20"
    Then the event is recorded in the history of cargo "ABC123"
    And the event does not become the last valid event of cargo "ABC123"
    And cargo "ABC123" is in state MISHANDLED

  @US4-S5
  Scenario: An intermediate unloading is reported
    Given a cargo "ABC123" in state ON_PATH with itinerary "10,15,20"
    When I report a "Unload" event for cargo "ABC123" at port "15"
    Then the report is accepted
    And the event is recorded in the history of cargo "ABC123"
    And the event becomes the last valid event of cargo "ABC123"
    And cargo "ABC123" is in state UNLOADED

  @US4-S6
  Scenario: An unloaded cargo continues its itinerary
    Given a cargo "ABC123" in state UNLOADED with itinerary "10,15,20"
    When I report a "Load" event for cargo "ABC123" at port "15"
    Then the report is accepted
    And the event is recorded in the history of cargo "ABC123"
    And the event becomes the last valid event of cargo "ABC123"
    And cargo "ABC123" is in state LOADED

  @US4-S7
  Scenario: An unloading at the destination is reported
    Given a cargo "ABC123" in state ON_PATH with itinerary "10,15,20"
    When I report a "Unload" event for cargo "ABC123" at port "20"
    Then the report is accepted
    And the event is recorded in the history of cargo "ABC123"
    And the event becomes the last valid event of cargo "ABC123"
    And cargo "ABC123" is in state UNLOADED

  @US4-S8
  Scenario: A cargo at the destination enters customs
    Given a cargo "ABC123" in state UNLOADED with itinerary "10,15,20"
    When I report a "Customs" event for cargo "ABC123" at port "20"
    Then the report is accepted
    And the event is recorded in the history of cargo "ABC123"
    And the event becomes the last valid event of cargo "ABC123"
    And cargo "ABC123" is in state IN_CUSTOMS

  @US4-S9
  Scenario: A cargo is cleared by customs
    Given a cargo "ABC123" in state IN_CUSTOMS with itinerary "10,15,20"
    When I report a "Clear" event for cargo "ABC123" at port "20"
    Then the report is accepted
    And the event is recorded in the history of cargo "ABC123"
    And the event becomes the last valid event of cargo "ABC123"
    And cargo "ABC123" is in state CLEARED

  @US4-S10
  Scenario: A delivery completes the shipment
    Given a cargo "ABC123" in state CLEARED with itinerary "10,15,20"
    When I report a "Deliver" event for cargo "ABC123" at port "20"
    Then the report is accepted
    And the event is recorded in the history of cargo "ABC123"
    And the event becomes the last valid event of cargo "ABC123"
    And cargo "ABC123" is in state DELIVERED

  # --- Events that no transition allows: recorded, but mishandling -------

  @US4-S11
  Scenario: An unrouted cargo cannot be loaded
    Given a cargo "ABC123" in state RECEIVED with no itinerary
    When I report a "Load" event for cargo "ABC123" at port "10"
    Then the event is recorded in the history of cargo "ABC123"
    And the event does not become the last valid event of cargo "ABC123"
    And cargo "ABC123" is in state MISHANDLED

  @US4-S12
  Scenario: A cargo cannot be loaded before it is received
    Given a cargo "ABC123" in state UNRECEIVED with itinerary "10,15,20"
    When I report a "Load" event for cargo "ABC123" at port "10"
    Then the event is recorded in the history of cargo "ABC123"
    And the event does not become the last valid event of cargo "ABC123"
    And cargo "ABC123" is in state MISHANDLED

  @US4-S13
  Scenario: A cargo cannot be unloaded outside its itinerary
    Given a cargo "ABC123" in state ON_PATH with itinerary "10,15,20"
    When I report a "Unload" event for cargo "ABC123" at port "99"
    Then the event is recorded in the history of cargo "ABC123"
    And the event does not become the last valid event of cargo "ABC123"
    And cargo "ABC123" is in state MISHANDLED

  @US4-S14
  Scenario: A cargo cannot be loaded again at its destination
    Given a cargo "ABC123" in state UNLOADED with itinerary "10,15,20"
    When I report a "Load" event for cargo "ABC123" at port "20"
    Then the event is recorded in the history of cargo "ABC123"
    And the event does not become the last valid event of cargo "ABC123"
    And cargo "ABC123" is in state MISHANDLED

  @US4-S15
  Scenario: A delivered cargo accepts no further event
    Given a cargo "ABC123" in state DELIVERED with itinerary "10,15,20"
    When I report a "Load" event for cargo "ABC123" at port "20"
    Then the event is recorded in the history of cargo "ABC123"
    And the event does not become the last valid event of cargo "ABC123"
    And cargo "ABC123" is in state MISHANDLED

  @US4-S16
  Scenario: A mishandled cargo stays mishandled
    Given a cargo "ABC123" in state MISHANDLED with itinerary "10,15,20"
    When I report a "Receive" event for cargo "ABC123" at port "10"
    Then the event is recorded in the history of cargo "ABC123"
    And the event does not become the last valid event of cargo "ABC123"
    And cargo "ABC123" is in state MISHANDLED

  # --- Reports that cannot be recorded at all ----------------------------

  @US4-S17
  Scenario: An event for an unknown cargo is rejected
    Given no cargo exists for tracking identifier "ZZZ999"
    When I report a "Receive" event for cargo "ZZZ999" at port "10"
    Then I am informed that the cargo does not exist