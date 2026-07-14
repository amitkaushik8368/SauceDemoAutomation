package driverfactory;

import config.LoadConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory
{
    private static WebDriver driver;


    public static void initializeDriver()        // Sets the driver
    {
        //ChromeOptions options;
        String browser = LoadConfiguration.getProperty("browser");
        if (browser == null)
            throw new IllegalStateException("Browser Property not found");
        else if (browser.equalsIgnoreCase("edge"))
            driver = new EdgeDriver();
        else if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
//            Map<String, Object> prefs = new HashMap<>();
//            prefs.put("credentials_enable_service", false);
//            prefs.put("profile.password_manager_enabled", false);
//            options.setExperimentalOption("prefs", prefs);
            options.addArguments("--guest");
            driver = new ChromeDriver(options);
        }
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
