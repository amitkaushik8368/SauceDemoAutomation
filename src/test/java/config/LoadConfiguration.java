package config;

import java.io.FileInputStream;
import java.util.Properties;
public class LoadConfiguration
{
    private static final Properties properties = new Properties();
    static {
        FileInputStream fis;
        try {
            fis = new FileInputStream(
                    System.getProperty("user.dir") + "\\src\\test\\resources\\configfile\\config.properties");
            properties.load(fis);  // Add a capability like when this file is not found what would test do
            fis.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key)
    {
        return properties.getProperty(key);
    }
}
