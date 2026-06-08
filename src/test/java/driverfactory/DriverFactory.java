package driverfactory;

import config.LoadConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory
{
    private WebDriver driver;


    public void initializeDriver()        // Sets the driver
    {
        String browser = LoadConfiguration.getProperty("browser");
        if (browser == null)
            throw new IllegalStateException("Browser Property not found");
        else if (browser.equalsIgnoreCase("edge"))
            driver = new EdgeDriver();
        else if (browser.equalsIgnoreCase("chrome"))
            driver = new ChromeDriver();
        else
            throw new IllegalStateException("Unsupported Browser : " + browser);
    }

    public WebDriver getDriver()
    {
        if (driver == null)
            throw new IllegalStateException("No webdriver session is active");
        else
            return driver;
    }

    public void tearDown()
    {
        if (driver != null) {
            driver.quit();
            driver=null;
        }
    }

}
