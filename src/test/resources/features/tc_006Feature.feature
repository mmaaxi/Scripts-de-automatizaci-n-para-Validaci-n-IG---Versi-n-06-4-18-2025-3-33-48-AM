Feature: Account Lockout on Multiple Failed Login Attempts

  Scenario: Lock account after consecutive failed login attempts
    Given the user is on the login page
    When the user attempts to login with incorrect password "wrongPass1"
    And attempts to login with incorrect password "wrongPass2"
    And attempts to login with incorrect password "wrongPass3"
    And attempts to login with incorrect password "wrongPass4"
    And attempts to login with incorrect password "wrongPass5"
    Then the system should lock the account due to multiple failed login attempts

  Scenario: Trying to login after account is locked
    Given the account is locked due to multiple failed login attempts
    When the user attempts to login
    Then the system should show an account locked error message