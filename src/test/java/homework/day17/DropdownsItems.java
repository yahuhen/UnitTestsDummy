package homework.day17;

import homework.at_project.driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropdownsItems {

    WebDriver driver = Driver.getWebDriver();


    @Before
    public void beforeTests() {
        Driver.setTimeOuts(10,10,10);
    }

    @After
    public void afterTests() {
        driver.quit();
    }

    @Test
    public void selectTest() {
        driver.get("https://demoqa.com/select-menu");
        driver.findElement(By.id("withOptGroup")).click();
        driver.findElement(By.id("react-select-2-option-0-0")).click();
        driver.findElement(By.id("selectOne")).click();
        driver.findElement(By.id("react-select-3-option-0-0")).click();
        new Select(driver.findElement(By.id("oldSelectMenu"))).selectByValue("1");
        driver.findElement(By.xpath("//*[@id='react-select-4-input']/../../..")).click();
        driver.findElement(By.id("react-select-4-option-0")).click();
        new Select(driver.findElement(By.id("cars"))).selectByValue("audi");
    }

}
