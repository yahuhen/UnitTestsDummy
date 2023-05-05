package homework.at_project.tests;

import homework.at_project.driver.Driver;
import homework.at_project.objects.demoqa_com.SelectMenuItems;
import homework.at_project.pages.demoqa_com.SelectMenu;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DemoQA {

    SelectMenu selectMenu = new SelectMenu();
    SelectMenuItems selectMenuItems = new SelectMenuItems();

    @Before
    public void beforeTests(){
        Driver.getWebDriver();
    }

    @After
    public void afterTests(){
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
