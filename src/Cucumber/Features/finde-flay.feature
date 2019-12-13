Feature: findeFlay

  Scenario : user can check flay
    Given an open browser with https://tester.codersguru.pl/
    When click flights
    And click round trip
    And put city form
    And put city to
    And put depart date
    And put return date
    Then tear down
