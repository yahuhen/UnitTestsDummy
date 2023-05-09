package homework.at_project.pages.tempmail_pages;

import homework.at_project.driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    WebDriver driver = Driver.getWebDriver();

    public static final Logger LOGGER = Logger.getLogger(MainPage.class.getName());

    public void getUrl() {
        driver.get("https://temp-mail.org/ru/");
        LOGGER.trace("Open the https://temp-mail.org/ru/");
    }

    public void getEmail() {
        WebDriverWait element = new WebDriverWait(driver, Duration.ofSeconds(10));
        element.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='emailbox-input opentip']"))
        );
        driver.findElement(By.xpath("//button[@class='btn-rds icon-btn bg-theme click-to-copy copyIconGreenBtn']")).click();
        LOGGER.trace("Click on the 'Copy email' button, locator = '//button[@class='btn-rds icon-btn bg-theme click-to-copy copyIconGreenBtn']'");
    }

}
