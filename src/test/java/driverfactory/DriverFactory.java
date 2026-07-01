package driverfactory;

import config.LoadConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory
{
    private static WebDriver driver;


    public static void initializeDriver()        // Sets the driver
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

    public static WebDriver getDriver()
    {
        if (driver == null)
            throw new IllegalStateException("No webdriver session is active");
        else
            return driver;
    }

    public static void tearDown() throws InterruptedException {
        if (driver != null) {
            Thread.sleep(2000);
            driver.quit();
            driver=null;
        }
    }

}
