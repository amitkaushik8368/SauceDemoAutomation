package hooks;
import config.LoadConfiguration;
import driverfactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class FrameworkHooks
{
//    public static DriverFactory driverFactory = new DriverFactory();
    @Before
    public void createBrowser()    {
        System.out.println("Inside @Before");
        DriverFactory.initializeDriver();
        DriverFactory.getDriver().manage().window().maximize();
        DriverFactory.getDriver().get(LoadConfiguration.getProperty("url"));

    }
    @After
    public void closeBrowser() throws InterruptedException {
        System.out.println("Inside @After");
        DriverFactory.tearDown();
    }
}
