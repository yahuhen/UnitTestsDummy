package classwork.day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    public static WebDriver getDriver(Config config ){
        switch (config){
            case CHROME:
                return getChromeDriver();
            case FF:
                return getFirefoxDriver();
            case EDGE:
                return getEdgeDriver();
            default:throw null;
        }
    }

    private static WebDriver getEdgeDriver() {
        return null;
    }

private static WebDriver getFirefoxDriver() {
        return null;
    }

    private static ChromeDriver chromeDriver;
    private static WebDriver getChromeDriver() {
        //return new ChromeDriver() getChromeDriver();
    }


}
