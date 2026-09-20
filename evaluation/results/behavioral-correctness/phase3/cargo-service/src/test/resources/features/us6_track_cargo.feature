@US6 @tracking
Feature: US6 - Track a cargo
  As a Customer
  I want to look up my shipment using its tracking identifier
  So that I know where it is and whether it will arrive on time

  @US6-S1
  Scenario: A cargo in transit is tracked
    Given a cargo "ABC123" that has been loaded onto a voyage
    When I look up cargo "ABC123" by its tracking identifier
    Then I am shown its current status and last known location
    And I am shown the events recorded for it so far

  @US6-S2
  Scenario: A cargo not yet received is tracked
    Given a cargo "ABC123" that has been booked but never handled
    When I look up cargo "ABC123" by its tracking identifier
    Then I am shown that it has not yet been received
    And no handling events are listed

  @US6-S3
  Scenario: A delivered cargo is tracked
    Given a cargo "ABC123" that has been delivered
    When I look up cargo "ABC123" by its tracking identifier
    Then I am shown that the shipment is complete
    And I am shown the full sequence of events that led to it

  @US6-S4
  Scenario: An unknown tracking identifier reveals nothing
    Given no cargo exists for tracking identifier "ZZZ999"
    When I look up cargo "ZZZ999" by its tracking identifier
    Then no shipment information is disclosed
