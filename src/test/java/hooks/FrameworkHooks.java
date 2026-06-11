package hooks;

import config.LoadConfiguration;
import driverfactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class FrameworkHooks
{
//    public static DriverFactory driverFactory = new DriverFactory();
    @Before
    void createBrowser()
    {
        DriverFactory.initializeDriver();

        DriverFactory.getDriver().manage().window().maximize();
        DriverFactory.getDriver().get(LoadConfiguration.getProperty("url"));
    }

    @After
    void closeBrowser()
    {
        DriverFactory.tearDown();
    }
}
