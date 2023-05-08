package homework.at_project.tests.testng;

import homework.at_project.driver.Driver;
import homework.at_project.objects.demoqa_objects.SelectMenuItems;
import homework.at_project.pages.demoqa_pages.SelectMenu;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DemoQATestNGTests {

    SelectMenu selectMenu = new SelectMenu();
    SelectMenuItems selectMenuItems = new SelectMenuItems();

    @BeforeTest
    public void beforeTests() {
        Driver.getWebDriver();
    }

    @AfterTest
    public void afterTests() {
        Driver.closeDriver();
    }

    @Test
    public void selectTest() {
        selectMenu.getUrlToSelectMenu();
        selectMenu.clickSelectValueDropdown();
        selectMenuItems.selectGroup1Option1OfSelectValue();
        selectMenu.clickSelectOneDropdown();
        selectMenuItems.selectDrOfSelectOne();
        selectMenuItems.selectBlueOfOldStyleSelectMenu();
        selectMenu.clickMultiSelectDropdown();
        selectMenuItems.selectGreenOfMultiSelectDropdown();
        selectMenuItems.selectAudiOfStandardMultiSelect();
    }

}
