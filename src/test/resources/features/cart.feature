Feature: Cart

  Scenario: Add products to Cart
    Given user is on the products page
    When user adds "SauceLabs BackPack" to cart
    And user navigates to cart
    Then product should be visible in cart