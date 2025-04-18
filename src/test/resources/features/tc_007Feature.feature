Feature: Validate the response of the interface on mobile devices

  Scenario: Interface adapts correctly on mobile
    Given I access the application from a mobile device
    Then the interface should adapt correctly to the screen size

  Scenario: Basic navigation on mobile
    When I perform basic navigation actions
    Then all elements should display correctly and be interactive