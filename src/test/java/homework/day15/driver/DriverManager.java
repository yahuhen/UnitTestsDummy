
    package homework.day15.driver;


    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.chrome.ChromeOptions;

    import java.util.Collections;

    public class DriverManager {
        public static WebDriver getDriver(Config config) {
            return switch (config) {
                case FF -> getFFDriver();
                case REMOTE -> getRemoteDriver();
                default -> getChromeDriver();
            };
        }

        private static WebDriver getRemoteDriver() {
            return null;
        }

        private static WebDriver getFFDriver() {
            return null;
        }

        private static WebDriver getChromeDriver() {
            ChromeOptions caps = new ChromeOptions();
            caps.addArguments("start-maximized");
            caps.addArguments("disable-infobars");
            caps.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            return new ChromeDriver(caps);
        }
    }