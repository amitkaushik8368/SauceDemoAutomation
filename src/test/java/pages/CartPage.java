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
    private static final String ITEM_VISIBLE_IN_CART = "//div[@class = 'cart_list']/descendant::div[text() = '%s']";
    private final By checkoutField = By.id("checkout");
    public boolean cartPageTitleDisplayed()
    {
        return driver.findElement(cartPageTitleField).isDisplayed();
    }
    public boolean isItemVisibleInCart(String productName)
    {
        By dynamicProductLocatorInCart = By.xpath(String.format(ITEM_VISIBLE_IN_CART, productName));
        return driver.findElement(dynamicProductLocatorInCart).isDisplayed();
    }

}
