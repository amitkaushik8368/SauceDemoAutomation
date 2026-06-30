package stepdefinitions;

import context.ScenarioContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CartStepDefinition
{
    private final ScenarioContext scenarioContext;

    public CartStepDefinition(ScenarioContext scenarioContext)
    {
        this.scenarioContext = scenarioContext;
    }

    @When("user adds {string} to cart")
    public void user_adds_to_cart(String productName) {
        Assertions.assertTrue(scenarioContext.getProductsPage().isProductTitleDisplayed(), "Products page not found");
        scenarioContext.getProductsPage().addProductToCart(productName);
    }

    @When("user navigates to cart")
    public void user_navigates_to_cart() {
        scenarioContext.setCartPage(scenarioContext.getProductsPage().clickShoppingCart());
    }

    @Then("product should be visible in cart")
    public void product_should_be_visible_in_cart() {
        Assertions.assertTrue(scenarioContext.getCartPage().cartPageTitleDisplayed(), "Cart Page is not Loaded");
        Assertions.assertTrue(scenarioContext.getCartPage().isItemVisibleInCart(), "SauceLab Back Pack is not added to the cart");
    }
}
