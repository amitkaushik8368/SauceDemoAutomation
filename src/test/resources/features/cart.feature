Feature: Cart

  Background:
    Given user is on the saucedemo login page
    When user logs in with username "standard_user" and password "secret_sauce"

  Scenario: Add BackPack to Cart
    When user adds "Sauce Labs Backpack" to cart
    And user navigates to cart
    Then "Sauce Labs Backpack" should be visible in cart

  Scenario: Add Sauce Labs Bike Light to Cart
    When user adds "Sauce Labs Bike Light" to cart
    And user navigates to cart
    Then "Sauce Labs Bike Light" should be visible in cart

  Scenario: Add Sauce Labs Bolt T-Shirt to Cart
    When user adds "Sauce Labs Bolt T-Shirt" to cart
    And user navigates to cart
    Then "Sauce Labs Bolt T-Shirt" should be visible in cart

  Scenario: Add Sauce Labs Fleece Jacket to Cart
    When user adds "Sauce Labs Fleece Jacket" to cart
    And user navigates to cart
    Then "Sauce Labs Fleece Jacket" should be visible in cart

  Scenario: Add Sauce Labs Onesie to Cart
    When user adds "Sauce Labs Onesie" to cart
    And user navigates to cart
    Then "Sauce Labs Onesie" should be visible in cart

  Scenario: Add Test.allTheThings() T-Shirt (Red) to Cart
    When user adds "Test.allTheThings() T-Shirt (Red)" to cart
    And user navigates to cart
    Then "Test.allTheThings() T-Shirt (Red)" should be visible in cart