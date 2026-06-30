package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage
{
    private final WebDriver driver;
    public ProductsPage(WebDriver driver)
    {
        this.driver = driver;
    }
    private static final String ADD_TO_CART_BUTTON = "//div[text()='%s']/ancestor::div[@class='inventory_item_description']//button";
    private final By productTitleField = By.xpath("//span[@class = 'title']");
    private final By shoppingCartField = By.id("shopping_cart_container");
    public boolean isProductTitleDisplayed()
    {
        return  driver.findElement(productTitleField).isDisplayed();
    }
    public void addProductToCart(String productName)
    {
        By addToCartButton = By.xpath(String.format(ADD_TO_CART_BUTTON, productName));
        driver.findElement(addToCartButton).click();
    }
    public CartPage clickShoppingCart()
    {
        driver.findElement(shoppingCartField).click();
        return new CartPage(driver);
    }
}
