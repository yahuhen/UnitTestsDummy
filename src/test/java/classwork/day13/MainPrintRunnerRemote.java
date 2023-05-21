package classwork.day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class MainPrintRunnerRemote {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:9515"), new ChromeOptions());
        driver.get("https://www.selenium.dev/");

        //запустить через терминал
        // Добавить в Homebrew системную переменную bin, например, в терминале установить chromedriver, он установит и добавит куда нужно, потом запустить
        // brew install chromedriver
        // start chrome driver


        //System.setProperty("webdriver.chrome.driver","/Users/dmitryavdeenko/Desktop/chromedriver");
        //ChromeDriver driver = new ChromeDriver();
        //driver.get("https://www.google.com");
    }

}
