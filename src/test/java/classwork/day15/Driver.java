package classwork.day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver webDriver;

    public static void setConfig(Config config) {
        config = null == config ? Config.valueOf(System.getProperty("CONFIG")) : config;
        //Driver.config = config;
    }

    private static Config config;

    /* public static void setConfig(Config theConfig){
         Driver.config;
         if(null = theConfig){
             Driver.setConfig();
         }
         Driver.config = config;
     }*/
    // ;


    public static WebDriver WebDriver() {
        if (webDriver == null) {
            webDriver = DriverManager.getDriver(Config.CHROME);
            setTimeouts(3);
        }
        return webDriver;
    }
    public static void setTimeouts(int sec) {
    }


}
