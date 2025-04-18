Feature: Session Timeout due to Inactivity

  Scenario: Validate session expiration after inactivity
    Given the user logs in with correct credentials
    When the user remains inactive for 15 minutes
    Then the system logs the user out and redirects to the login page