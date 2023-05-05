package homework.day17;

import homework.at_project.driver.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import java.util.ArrayList;
import java.util.List;

public class Tutorial {
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
    public void tutorialTest() {
        driver.get("https://www.w3schools.com/java/");
        Actions make = new Actions(driver);
        make
                .doubleClick(driver.findElement(By.xpath("//h1/span[contains(text(),'Tutorial')]")))
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c").clickAndHold()
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();
        driver.get("https://google.com");
        make
                .click(driver.findElement(By.cssSelector("[name='q']")))
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v").clickAndHold()
                .keyUp(Keys.LEFT_CONTROL)
                .keyDown(Keys.ENTER)
                .build()
                .perform();
        int counter = 0;
        List<WebElement> allResults = driver.findElements(By.xpath("//*[@id='rso']/div//descendant:: a[@href]/h3"));
        List<WebElement> displayedResults = new ArrayList<>();
        for (WebElement item : allResults) {
            if (item.isDisplayed()) {
                displayedResults.add(item);
            }
        }
        for (WebElement item : displayedResults) {
            if (item.getText().toLowerCase().contains("tutorial")) {
                counter++;
            }
        }
        Assert.assertEquals("Some links don't contain the 'Tutorial' word", displayedResults.size(), counter);
    }

}
