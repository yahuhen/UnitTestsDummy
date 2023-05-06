package classwork.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverWaitTest {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
        //webDriver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(2));
        webDriver.get("http://booking.com");
        WebElement webElement = webDriver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler'])"));
        webElement.click();
        webElement = webDriver.findElement(By.name("ss"));
        webElement.sendKeys("Париж");
        /*webDriver.findElement(By.xpath("//div[@data-testid='')).


        input[@id='group_adults']/following-sibling::div/button[2]*/



        /*webElement = webElement.findElement(By.name("Search"));
        webElement.click();*/
    }

}
