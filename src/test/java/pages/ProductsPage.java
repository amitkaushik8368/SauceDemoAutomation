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
    public String getProductTitle()
    {
        return  driver.findElement(productTitleField).getText();
    }
}
