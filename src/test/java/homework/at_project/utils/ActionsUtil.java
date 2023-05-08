package homework.at_project.utils;

import homework.at_project.driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtil {

    WebDriver driver = Driver.getWebDriver();
    Actions make = new Actions(driver);

    public void selectingCopyElement(WebElement webElement) {

        make
                .doubleClick(webElement)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c").clickAndHold()
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();
    }

    public void selectingPasteElement(WebElement webElement) {
        make
                .click(webElement)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v").clickAndHold()
                .keyUp(Keys.LEFT_CONTROL)
                .keyDown(Keys.ENTER)
                .build()
                .perform();
    }

    public void selectingPaste() {
        make
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v").clickAndHold()
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();
    }

    public void hoverElement(WebElement webElement) {
        make.moveToElement(webElement);
        make.perform();
    }

    public void openNewTab() {
        ((JavascriptExecutor) driver).executeScript("window.open();");
    }

    public void clickAndHold(WebElement webElement) {
        make
                .moveByOffset(674, -525)
                .clickAndHold(webElement)
                .build()
                .perform();
    }

}
