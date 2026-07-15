Feature: Checkout

  Background:
    Given user is on the saucedemo login page
    When user logs in with username "standard_user" and password "secret_sauce"
    And user adds "Sauce Labs Backpack" to cart
    And user navigates to cart
    And user clicks on checkout


    Scenario: Validate user is able to navigate  to checkout page
      When user navigates to checkout page
      And user enters first name "Amit" and last name "Sharma" and postal code "121004"
      Then user should be navigated to checkout overview

    Scenario: Validate  products are visible in Checkout Overview
      When user navigates to checkout page
      And user enters first name "Amit" and last name "Sharma" and postal code "121004"
      Then "Sauce Labs Backpack" should be visible in checkout overview

    Scenario: Validate user is able to complete the checkout
      When user navigates to checkout page
      And user enters first name "Amit" and last name "Sharma" and postal code "121004"
      And user navigates to Checkout complete
      Then user should see the message "Thank you for your order!"