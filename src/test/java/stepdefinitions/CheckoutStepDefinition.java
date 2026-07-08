package stepdefinitions;

import context.ScenarioContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CheckoutStepDefinition
{
    ScenarioContext scenarioContext;
    @When("user navigates to checkout page")
    public void user_navigates_to_checkout_page() {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertTrue(scenarioContext.getCheckoutPage().isCheckoutTitleDisplayed(), "Checkout Page not loaded");
    }

    @When("user enters first name {string} and last name {string} and postal code {string}")
    public void user_enters_first_name_and_last_name_and_postal_code(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should see all the details in checkout overview")
    public void user_should_see_all_the_details_in_checkout_overview() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
