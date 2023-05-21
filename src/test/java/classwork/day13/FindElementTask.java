package classwork.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementTask {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://google.com");
        WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        webElement.click();
        webElement = webDriver.findElement(By.name("q"));
        webElement.sendKeys("погода минск");
        webElement.click();
        webElement = webDriver.findElement(By.xpath("//ul[@role='listbox']/li[1]"));
        webElement.click();
    }
}
