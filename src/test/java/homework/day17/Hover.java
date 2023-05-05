package homework.day17;

import homework.at_project.driver.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;


public class Hover {

    WebDriver driver = Driver.getWebDriver();
    Actions actions = new Actions(driver);

    @Before
    public void beforeTests() {
        Driver.setTimeOuts(10, 10, 10);
        driver.get("https://booking.com");
        driver.findElement(By.xpath("//div[@role='dialog'][@aria-modal='true']//button")).click();
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
