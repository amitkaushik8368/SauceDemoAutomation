package stepdefinitions;

import driverfactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;
import pages.ProductsPage;

public class LoginStepsDefinition
{
    private LoginPage loginPage;
    private ProductsPage productsPage;
    @Given("user is on the saucedemo login page")
    public void loginPageLoad()
    {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        loginPage = new LoginPage(DriverFactory.getDriver());
        Assertions.assertTrue(loginPage.isLoginPageDisplayed(), "Login Page is not Loaded");
    }

    @When("user logs in with username {string} and password {string}")
    public void userLogsIn(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        productsPage = loginPage.login(username, password);
    }

    @Then("user should be navigated to Products page")
    public void productsPageLoad() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        Assertions.assertTrue(productsPage.isProductTitleDisplayed());
    }

    @Then("login error message should be displayed")
    public void invalidLoginError()
    {
        Assertions.assertTrue(loginPage.isErrorMessageDisplayed(), "Products page is not displayed");
    }
}
