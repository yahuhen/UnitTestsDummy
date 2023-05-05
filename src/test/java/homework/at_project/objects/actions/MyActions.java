package homework.at_project.objects.actions;

import homework.at_project.driver.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class MyActions {

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

    public void hoverElement(WebElement webElement) {
        make.moveToElement(webElement);
        make.perform();
    }

    public void openNewTab() {
        ((JavascriptExecutor) driver).executeScript("window.open();");
    }

}
