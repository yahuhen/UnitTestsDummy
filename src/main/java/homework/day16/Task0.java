package homework.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task0 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("погода минск");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-wob-di='1']")).click();
        Thread.sleep(1000);
        String temperature = driver.findElement(By.xpath("//div[@id='wob_gs']/*/*[contains(@aria-label,'12:00')][1]")).getAttribute("aria-label");
        String[] temperatureArray = temperature.split("°");
        System.out.println(temperatureArray[0]);
    }
}
