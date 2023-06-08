Feature: Login
  As a user I want to login so that i can manage membership

  @Login
  Scenario: Login with valid data
    Given user is on Login page endpoint
    When user requests the Login endpoint
    Then user success Login status code response 200 ok
