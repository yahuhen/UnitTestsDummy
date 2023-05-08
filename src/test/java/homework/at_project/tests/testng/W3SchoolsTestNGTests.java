package homework.at_project.tests.testng;

import homework.at_project.driver.Driver;
import homework.at_project.pages.google_pages.MainPage;
import homework.at_project.pages.www_w3schools_pages.Java;
import homework.at_project.utils.ActionsUtil;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class W3SchoolsTestNGTests {

    Java w3schools = new Java();
    ActionsUtil actions = new ActionsUtil();
    MainPage google = new MainPage();


    @BeforeTest
    public void beforeTests() {
        Driver.getWebDriver();
    }

    @AfterTest
    public void afterTests() {
        Driver.closeDriver();
    }

    @Test
    public void tutorialTest() {
        w3schools.getJavaUrl();
        actions.selectingCopyElement(w3schools.findTutorial());
        google.getUrl();
        actions.selectingPasteElement(google.findSearchField());
        Assert.assertEquals(google.displayedResultsCountContainsTutorial(), google.displayedResultsCount().size(), "Some links don't contain the 'Tutorial' word");
    }

}
