Feature: User should be able to login using correct credentials

  Scenario: Positive login scenario
    Given  User is on the login page of Crmly app
    When User enters username and password and click login button
    Then User see the CRM logo on the main page