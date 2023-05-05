package homework.at_project.pages.demoqa_com;

import homework.at_project.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMenu {

    WebDriver driver = Driver.getWebDriver();

    public void getUrlToSelectMenu() {
        driver.get("https://demoqa.com/select-menu");
    }

    public void clickSelectValueDropdown() {
        driver.findElement(By.id("withOptGroup")).click();
    }

    public void clickSelectOneDropdown() {
        driver.findElement(By.id("selectOne")).click();
    }

    public void clickMultiSelectDropdown() {
        driver.findElement(By.xpath("//*[@id='react-select-4-input']/../../..")).click();
    }

}
