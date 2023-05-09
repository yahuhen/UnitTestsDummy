package homework.at_project.driver;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Driver {

    private static WebDriver webDriver;

    public static homework.at_project.driver.Config config;

    public static final Logger LOGGER = Logger.getLogger(Driver.class.getName());

    public static void setConfig(Config theConfig) {
        config = null == theConfig ? homework.at_project.driver.Config.valueOf(System.getProperty("CONFIG")) : theConfig;
    }

    public static WebDriver getWebDriver() {
        if (webDriver == null) {
            webDriver = DriverManager.getDriver(config);
        }
        setTimeOuts(10, 10, 10);
        return webDriver;
    }

    public static void closeDriver() {
        webDriver.quit();
        webDriver = null;
        LOGGER.trace("Kill ChromeDriver");
    }

    public static void setTimeOuts(int scriptTimeout, int pageLoadTimeout, int implicitlyWait) {
        webDriver.manage().timeouts().scriptTimeout(Duration.ofSeconds(scriptTimeout));
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTimeout));
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
        LOGGER.trace("Set timeouts " + scriptTimeout + ", " + pageLoadTimeout + ", " + implicitlyWait + "");
    }

}
