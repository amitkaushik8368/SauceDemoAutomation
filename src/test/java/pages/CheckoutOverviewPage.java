package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage
{
    WebDriver driver;
    public CheckoutOverviewPage(WebDriver driver)
    {
        this.driver = driver;
    }
    private final By checkOutOverviewTitleField = By.xpath("//span[contains(text(), 'Overview')]");

    public boolean isCheckoutOverviewTitleDisplayed()
    {
        return driver.findElement(checkOutOverviewTitleField).isDisplayed();
    }
}
