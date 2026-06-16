Feature: Login

  Scenario: Successful Login
    Given user is on the saucedemo login page
    When user logs in with username "standard_user" and password "secret_sauce"
    Then user should be navigated to Products page