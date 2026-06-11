package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage
{
    private final WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By failedLoginMessage = By.xpath("//button[@class = 'error-button']/parent::h3");

    public ProductsPage login(String username, String password)
    {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
        return new ProductsPage(driver);

    }

    private void enterUsername(String username)
    {
        driver.findElement(usernameField).sendKeys(username);
    }
    private void enterPassword(String password)
    {
        driver.findElement(passwordField).sendKeys(password);
    }

    private void clickLoginButton()
    {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage()
    {
        return driver.findElement(failedLoginMessage).getText();
    }


}
