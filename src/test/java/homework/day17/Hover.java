package homework.day17;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Hover {

    WebDriver driver = new ChromeDriver();
    Actions actions = new Actions(driver);

    @Before
    public void beforeTests() {
        driver.manage().window().maximize();
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://booking.com");
        driver.findElement(By.cssSelector("[aria-label='Скрыть меню входа в аккаунт.']")).click();
    }

    @After
    public void afterTests() {
        driver.quit();
    }

    @Test
    public void currencyTest() {
        actions.moveToElement(driver.findElement(By.cssSelector("[data-testid='header-currency-picker-trigger']")));
        actions.perform();
        String tooltip = driver.findElement(By.xpath("//*[@id=':R2cl:']/div")).getText();
        Assert.assertEquals("There is an incorrect tooltip", "Выберите валюту", tooltip);
    }

    @Test
    public void languageTest() {
        actions.moveToElement(driver.findElement(By.cssSelector("[data-testid='header-language-picker-trigger']")));
        actions.perform();
        String tooltip = driver.findElement(By.xpath("//*[@id=':R2kl:']/div")).getText();
        Assert.assertEquals("There is an incorrect tooltip", "Выберите язык", tooltip);
    }

}
