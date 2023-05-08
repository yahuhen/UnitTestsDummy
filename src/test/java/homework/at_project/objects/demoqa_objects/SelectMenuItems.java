package homework.at_project.objects.demoqa_objects;

import homework.at_project.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMenuItems {

    WebDriver driver = Driver.getWebDriver();

    public void selectGroup1Option1OfSelectValue() {
        driver.findElement(By.id("react-select-2-option-0-0")).click();
    }

    public void selectDrOfSelectOne() {
        driver.findElement(By.id("react-select-3-option-0-0")).click();
    }

    public void selectBlueOfOldStyleSelectMenu() {
        new Select(driver.findElement(By.id("oldSelectMenu"))).selectByValue("1");
    }

    public void selectGreenOfMultiSelectDropdown() {
        driver.findElement(By.id("react-select-4-option-0")).click();
    }

    public void selectAudiOfStandardMultiSelect() {
        new Select(driver.findElement(By.id("cars"))).selectByValue("audi");
    }

}
