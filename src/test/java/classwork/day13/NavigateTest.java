package classwork.day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
        webDriver.get("https://ya.ru");
        webDriver.navigate().back();
        webDriver.navigate().refresh();
    }
}
