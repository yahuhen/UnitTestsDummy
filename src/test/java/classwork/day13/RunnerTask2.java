package classwork.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;

public class RunnerTask2 {
    public static void main(String[] args) {
        task1();


    }

    public static void task1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gdansk.pl/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
        WebElement webElement = driver.findElement(By.xpath("/html/body/div[2]/section/section[1]/div[2]"));
        webElement.click();
        System.out.println(webElement.isDisplayed());
        System.out.println(webElement.isEnabled());
        System.out.println(webElement.isSelected());
        System.out.println(webElement.getText());
        webElement.getAttribute("");
        webElement.getCssValue("ok");
        System.out.println(webElement.getLocation());
        System.out.println(webElement.getRect());
        System.out.println(webElement.getSize());
        System.out.println(webElement.getTagName());

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        //System.out.println(driver.getwindowHandle());
        System.out.println(driver.getWindowHandles()); //переключение между окнами

        driver.switchTo().window("windowName");
        driver.switchTo().frame("frameName");
        driver.switchTo().defaultContent();
        driver.switchTo().alert(); //это блокирующее окошко, где нужно нажать ОК

        driver.close();
        driver.quit();
    }

    public static void task2() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gdansk.pl/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
        WebElement webElement = driver.findElement(By.xpath("/html/body/div[2]/section/section[1]/div[2]"));
        webElement.click();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.get("https://google.com");
        /*driver.get("https://ya.ru");
        driver.navigate().to("https://google.com");*/
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();
        driver.quit();


    }
}
