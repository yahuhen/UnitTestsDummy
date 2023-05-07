package homework.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WeatherTest {
    /*public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://google.com");
        WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        webElement.click();
        webElement = webDriver.findElement(By.name("q"));
        webElement.sendKeys("погода минск");
        webElement = webDriver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();
        webElement.click();*/


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 1);
        Date day = cal.getTime();
        SimpleDateFormat formatDate = new SimpleDateFormat("EEEE", Locale.forLanguageTag("ru"));
        String nextDay = formatDate.format(day);
        driver.get("http://google.com");
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        driver.findElement(By.name("q")).sendKeys("погода Минск");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();
        //String tempElement = driver.findElement(By.xpath("//*[@aria-label='15°Celsius Saturday 12:00']")).getAttribute("aria-label");
        String tempElement = driver.findElement(By.xpath("//*[contains(@aria-label, '°Celsius Sunday 12:00')]")).getAttribute("aria-label");
        String[] texts = tempElement.split("°");
        System.out.print("Температура завтра в 12:00: " + texts[0]);
        driver.quit();
    }
}

