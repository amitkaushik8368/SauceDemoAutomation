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
    private final By productTitleField = By.xpath("//span[@class = 'title']");
    private final By addBackpackToCartField = By.xpath("//button[contains(@id, 'backpack')]");
    private final By addBikeLightToCart = By.xpath("//button[contains(@id, 'bike-light')]");
    private final By shoppingCartField = By.id("shopping_cart_container");

    public boolean isProductTitleDisplayed()
    {
        return  driver.findElement(productTitleField).isDisplayed();
    }

    public void addProductToCart(String product)
    {

    }


    public void addBackpackToCart()
    {
        driver.findElement(addBackpackToCartField).click();
    }
    public void addBikeLightToCart()
    {
        driver.findElement(addBikeLightToCart).click();
    }
    public CartPage clickShoppingCart()
    {
        driver.findElement(shoppingCartField).click();
        return new CartPage(driver);
    }


}
