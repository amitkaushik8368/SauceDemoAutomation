package stepdefinitions;

import driverfactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefinition
{
    @Given("user is on the saucedemo login page")
    public void loginPageLoad()
    {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println(DriverFactory.getDriver().getTitle());
    }

    @When("user logs in with username {string} and password {string}")
    public void userLogsIn(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should be navigated to Products page")
    public void productsPageLoad() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
