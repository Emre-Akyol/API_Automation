Feature: Customer Data Validation

  Acceptance Criteria  From Requirements

  1.id [int] greater than zero
  2.name [String] can't be longer than 10 alpha characters
  3.last [String] can't be longer than 10 alpha characters
  4.age [int] must be integer and 0 > age < 120
  5.gender [String] must only be F or M
  6.response time must be less than 500ms

  Scenario: Testing Customer Information


    When  User hits API
    Then  User verifies response status codes should be 200
    Then  User verifies customer's id is greater than 0
    Then  User verifies customer's name is less or equal than 10 alpha characters
    Then  User verifies customer's last is less or equal than 10 alpha characters
    Then  User verifies customer's age is between 0 and 120
    Then  User verifies customer's gender is either "F" or "M"
    Then  User verifies response time is less than 500 ms


























