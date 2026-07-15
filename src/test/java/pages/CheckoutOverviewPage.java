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
    private final By finishButtonField = By.xpath("//button[@id='finish']");
    String genericXpath = "//div[text()='%s']";  //Sauce Labs Backpack

    public void clickFinishButton()
    {
        driver.findElement(finishButtonField).click();
    }
    public boolean isProductVisible(String product)
    {
        By dynamicLocator = By.xpath(String.format(genericXpath, product));
        return driver.findElement(dynamicLocator).isDisplayed();
    }

    public boolean isCheckoutOverviewTitleDisplayed()
    {
        return driver.findElement(checkOutOverviewTitleField).isDisplayed();
    }
}
