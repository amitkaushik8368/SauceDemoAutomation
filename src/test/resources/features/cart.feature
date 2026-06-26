Feature: Cart

  Background:
    Given user is on the saucedemo login page
    When user logs in with username "standard_user" and password "secret_sauce"

  Scenario: Add products to Cart
    When user adds "SauceLabs BackPack" to cart
    And user navigates to cart
    Then product should be visible in cart