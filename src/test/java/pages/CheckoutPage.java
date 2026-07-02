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

    public boolean isCheckoutTitleDisplayed()
    {
        return driver.findElement(checkoutTitleField).isDisplayed();
    }

}
