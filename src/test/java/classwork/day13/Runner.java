package classwork.day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://google.com");
        System.out.println(webDriver.getTitle());
        System.out.println(webDriver.getCurrentUrl());
        webDriver.quit();

        webDriver.get("http://google.com");
        webDriver.get("http://ya.ru");
        webDriver.navigate().back();
        webDriver.navigate().refresh();

    }
}
