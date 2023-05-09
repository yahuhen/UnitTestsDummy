package homework.at_project.driver;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

    public static final Logger LOGGER = Logger.getLogger(DriverManager.class.getName());

    private static WebDriver getChromeDriver() {
        ChromeOptions caps = new ChromeOptions();
        caps.addArguments("start-maximized");
        LOGGER.trace("Run ChromeDriver");
        return new ChromeDriver(caps);
    }

    private static WebDriver getFirefoxDriver() {
        LOGGER.trace("Run FirefoxDriver");
        return null;
    }

    private static WebDriver getEdgeDriver() {
        LOGGER.trace("Run EdgeDriver");
        return null;
    }

    public static WebDriver getDriver(homework.at_project.driver.Config config) {
        return switch (config != null ? config : Config.CHROME) {
            case CHROME -> getChromeDriver();
            case FF -> getFirefoxDriver();
            case EDGE -> getEdgeDriver();
        };
    }

}
