package stepdefinitions;

import driverfactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;

public class LoginStepsDefinition
{

    private final ScenarioContext scenarioContext;
    public LoginStepsDefinition(ScenarioContext scenarioContext)
    {
        this.scenarioContext = scenarioContext;
    }
    @Given("user is on the saucedemo login page")
    public void loginPageLoad()
    {
        scenarioContext.setLoginPage(new LoginPage(DriverFactory.getDriver()));
        Assertions.assertTrue(scenarioContext.getLoginPage().isLoginPageDisplayed(), "Login Page is not Loaded");
    }

    @When("user logs in with username {string} and password {string}")
    public void userLogsIn(String username, String password) {
        scenarioContext.setProductsPage(scenarioContext.getLoginPage().login(username, password));
    }

    @Then("user should be navigated to Products page")
    public void productsPageLoad() {
        Assertions.assertTrue(scenarioContext.getProductsPage().isProductTitleDisplayed());
    }

    @Then("login error message should be displayed")
    public void invalidLoginError()
    {
        Assertions.assertTrue(scenarioContext.getLoginPage().isErrorMessageDisplayed(), "Products page is not displayed");
    }
}
