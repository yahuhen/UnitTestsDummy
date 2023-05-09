package homework.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task0 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("погода минск");
        driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();
        driver.findElement(By.xpath("//*[@data-wob-di='1']")).click();
        String temperature = driver.findElement(By.xpath("//div[@id='wob_gs']/*/*[contains(@aria-label,'12:00')][1]")).getAttribute("aria-label");
        String[] temperatureArray = temperature.split("°");
        System.out.println(temperatureArray[0]);
    }
}
