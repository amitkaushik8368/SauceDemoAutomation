package stepdefinitions;

import context.ScenarioContext;
import driverfactory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.CheckoutPage;

public class CheckoutStepDefinition
{
    private final ScenarioContext scenarioContext;

    public CheckoutStepDefinition(ScenarioContext scenarioContext)
    {
        this.scenarioContext = scenarioContext;
    }

    @When("user navigates to checkout page")
    public void user_navigates_to_checkout_page() {
        scenarioContext.setCheckoutPage(new CheckoutPage(DriverFactory.getDriver()));
        Assertions.assertTrue(scenarioContext.getCheckoutPage().isCheckoutTitleDisplayed(), "Checkout Page not loaded");
    }

    @When("user enters first name {string} and last name {string} and postal code {string}")
    public void user_enters_first_name_and_last_name_and_postal_code(String firstname, String lastname, String postalCode) {
        scenarioContext.getCheckoutPage().enterFirstName(firstname);
        scenarioContext.getCheckoutPage().enterLastName(lastname);
        scenarioContext.getCheckoutPage().enterPostalCode(postalCode);
    }

    @Then("user should be navigated to checkout overview")

    public void user_should_be_navigated_to_checkout_overview() {
        scenarioContext.setCheckoutOverviewPage(scenarioContext.getCheckoutPage().continueToCheckoutOverview());;
        Assertions.assertTrue(scenarioContext.getCheckoutOverviewPage().isCheckoutOverviewTitleDisplayed(), "Checkout Overview Page is not loaded");
    }

}
