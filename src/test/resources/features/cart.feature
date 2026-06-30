Feature: Cart

  Background:
    Given user is on the saucedemo login page
    When user logs in with username "standard_user" and password "secret_sauce"

  Scenario: Add BackPack to Cart
    When user adds "Sauce Labs Backpack" to cart
    And user navigates to cart
    Then "Sauce Labs Backpack" should be visible in cart

  Scenario: Add BikeLight to Cart
    When user adds "Sauce Labs Bike Light" to cart
    And user navigates to cart
    Then "Sauce Labs Bike Light" should be visible in cart