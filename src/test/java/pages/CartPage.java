package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage
{
    private final WebDriver driver;
    public CartPage(WebDriver driver)
    {
        this.driver = driver;
    }
    private final By cartPageTitleField = By.xpath("//span[text() = 'Your Cart']");
    private final By addedItemToCartField = By.xpath("//div[text() = 'Sauce Labs Backpack']");
    public boolean cartPageTitleDisplayed()
    {
        return driver.findElement(cartPageTitleField).isDisplayed();
    }
    public boolean isItemVisibleInCart()
    {
        return driver.findElement(addedItemToCartField).isDisplayed();
    }

}
