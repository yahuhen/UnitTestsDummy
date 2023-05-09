package homework.at_project.pages.demoqa_pages;

import homework.at_project.driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectMenu {

    WebDriver driver = Driver.getWebDriver();

    public static final Logger LOGGER = Logger.getLogger(SelectMenu.class.getName());

    public void getUrlToSelectMenu() {
        driver.get("https://demoqa.com/select-menu");
        LOGGER.trace("Open the https://demoqa.com/select-menu");
    }

    public void clickSelectValueDropdown() {
        driver.findElement(By.id("withOptGroup")).click();
        LOGGER.trace("Click on the SelectValue Dropdown, locator(id) = 'withOptGroup'");
    }

    public void clickSelectOneDropdown() {
        driver.findElement(By.id("selectOne")).click();
        LOGGER.trace("Click on the SelectOne Dropdown, locator(id) = 'selectOne'");
    }

    public void clickMultiSelectDropdown() {
        driver.findElement(By.xpath("//*[@id='react-select-4-input']/../../..")).click();
        LOGGER.trace("Click on the MultiSelect Dropdown, locator = '//*[@id='react-select-4-input']/../../..'");
    }

}
