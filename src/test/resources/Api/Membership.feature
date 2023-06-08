Feature: Membership Management
  As a system user
  I want to be able to manage membership
  So I can create, view, update, and delete membership

  @GetAllMembership
  Scenario: Get all membership with valid data
    Given user is on the membership list page endpoint
    When user requests the membership list endpoint
    And i receive that the response code is 200 OK
    Then user should receive a list of products

  Scenario: Create New Membership
    Given user is on the membership POST page endpoint
    When a user makes a request with the POST method on the endpoint with post data
    And the post add new membership that was just created
    Then the system responds with the status code 201

  Scenario: Add point Membership
    Given user is on the membership POST page endpoint
    When a user makes a request with the POST method for add point membership
    And the post add point membership that was just created
    Then the system responds with the status code 201 ok

  Scenario: Delete Product
    Given user wants to delete membership with valid ID
    When a user makes a request with the DELETE method on the endpoint
    And post data with ID 12 has been deleted
    Then the system give a response with status code 200

