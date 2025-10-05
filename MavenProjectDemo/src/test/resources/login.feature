Feature: Login functionality

  Scenario: Successful login
    Given the user is on the login page
    When the user enters valid username and password
    Then they should be redirected to the dashboard

  Scenario: Failed login due to incorrect password
    Given the user is on the login page
    When the user enters a valid username and an incorrect password
    Then they should see an error message
