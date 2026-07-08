package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage
{
    private final WebDriver driver;
    public CheckoutPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private final By checkoutTitleField = By.xpath("//span[text()='Checkout: Your Information']");
    private final By firstNameField = By.id("first-name");
    private final By lastNameField = By.id("last-name");
    private final By postalCodeField = By.id("postal-code");
    private final By continueToCheckout2Field = By.id("continue");
    private final By backToCartField = By.id("cancel");




    public boolean isCheckoutTitleDisplayed()
    {
        return driver.findElement(checkoutTitleField).isDisplayed();
    }



}
