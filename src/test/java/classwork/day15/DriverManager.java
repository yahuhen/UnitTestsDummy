package classwork.day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
    public static WebDriver getDriver(Config config) {
        if (config == null) {
            return getChromeDriver();
        } else {
            return switch (config) {
                //return switch (config != null? config : Config.CHROME) более универсальный способ
                case CHROME -> getChromeDriver();
                case FF -> getFirefoxDriver();
                case EDGE -> getEdgeDriver();
            };
        }
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions caps = new ChromeOptions();
        caps.addArguments("start-maximised");
        return new ChromeDriver(caps);
    }

    private static WebDriver getEdgeDriver() {
        return null;
    }

    private static WebDriver getFirefoxDriver() {
        return null;
    }
}
