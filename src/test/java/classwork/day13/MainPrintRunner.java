package classwork.day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MainPrintRunner {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");


        //System.setProperty("webdriver.chrome.driver","/Users/dmitryavdeenko/Desktop/chromedriver");
        //ChromeDriver driver = new ChromeDriver();
        //driver.get("https://www.google.com");
    }
}
