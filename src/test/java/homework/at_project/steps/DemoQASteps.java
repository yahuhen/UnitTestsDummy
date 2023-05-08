package homework.at_project.steps;

import homework.at_project.driver.Driver;
import homework.at_project.objects.demoqa_objects.SelectMenuItems;
import homework.at_project.pages.demoqa_pages.SelectMenu;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoQASteps {

    SelectMenu selectMenu = new SelectMenu();
    SelectMenuItems selectMenuItems = new SelectMenuItems();

    @Before
    public void beforeTests() {
        Driver.getWebDriver();
    }

    @After
    public void afterTests() {
        Driver.closeDriver();
    }

    @Given("I open \"demoQA.com\"")
    public void openDemoQA() {
        selectMenu.getUrlToSelectMenu();
    }

    @When("I click on the Select Value Dropdown")
    public void clickSelectValueDropdown() {
        selectMenu.clickSelectValueDropdown();
    }

    @When("I select Group1 Option1")
    public void selectGroup1Option1OfSelectValue() {
        selectMenuItems.selectGroup1Option1OfSelectValue();
    }

    @When("I click on the Select One Dropdown")
    public void clickSelectOneDropdown() {
        selectMenu.clickSelectOneDropdown();
    }

    @When("I select Dr")
    public void selectDrOfSelectOne() {
        selectMenuItems.selectDrOfSelectOne();
    }

    @When("I select Blue Of Old Style Select Menu")
    public void selectBlueOfOldStyleSelectMenu() {
        selectMenuItems.selectBlueOfOldStyleSelectMenu();
    }

    @When("I click on the Multi Select Dropdown")
    public void clickMultiSelectDropdown() {
        selectMenu.clickMultiSelectDropdown();
    }

    @When("I select Green")
    public void selectGreenOfMultiSelectDropdown() {
        selectMenuItems.selectGreenOfMultiSelectDropdown();
    }

    @When("I select Audi in the Standard Multi Select")
    public void selectAudiOfStandardMultiSelect() {
        selectMenuItems.selectAudiOfStandardMultiSelect();
    }

    @Then("I check that all fields are selected")
    public void checkAllFields() {

    }

}
