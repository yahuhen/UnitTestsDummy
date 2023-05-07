package classwork.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
        WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"L2AGLb\"]"));
        webElement.click();
        System.out.println(webDriver.getTitle());
        System.out.println(webDriver.getCurrentUrl());
        webDriver.close();
        webDriver.quit();
    }
}
