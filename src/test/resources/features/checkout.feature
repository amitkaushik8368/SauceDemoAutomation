Feature: Checkout

  Background:
    Given user is on the saucedemo login page
    When user logs in with username "standard_user" and password "secret_sauce"
    And user adds "Sauce Labs Backpack" to cart
    And user navigates to cart
    And user clicks on checkout

    Scenario: Validate user can remove products from Cart
      When

    Scenario: Validate user is able to navigate  to checkout page
      When user navigates to checkout page
      And user enters first name "Amit" and last name "Sharma" and postal code "121004"
      Then user should be navigated to checkout overview