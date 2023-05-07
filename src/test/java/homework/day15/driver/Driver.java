package homework.day15.driver;

import org.openqa.selenium.WebDriver;

import java.util.Optional;

public class Driver {

    private static WebDriver webDriver;
    protected static Config config =
            Optional.ofNullable(System.getProperty("CONFIG")).isEmpty()? Config.valueOf(System.getProperty("CONFIG")):
    Config.CHROME;

    public static WebDriver getWebDriver() {
        if (null == webDriver) {
            webDriver = DriverManager.getDriver(config);
            setTimeOuts();
        }
        return webDriver;
    }

    public static void closeDriver(){
        webDriver.quit();
        webDriver.close();
    }

    private static void setTimeOuts() {
    }

}
