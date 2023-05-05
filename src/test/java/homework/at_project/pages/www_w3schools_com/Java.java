package homework.at_project.pages.www_w3schools_com;

import homework.at_project.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Java {

    WebDriver driver = Driver.getWebDriver();

    public void getJavaUrl() {
        driver.get("https://www.w3schools.com/java/");
    }

    public WebElement findTutorial() {
        return driver.findElement(By.xpath("//h1/span[contains(text(),'Tutorial')]"));
    }

}
