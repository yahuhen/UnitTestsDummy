package homework.at_project.tests.junit4;


import homework.at_project.driver.Driver;
import homework.at_project.pages.google_pages.MainPage;
import homework.at_project.pages.www_w3schools_pages.Java;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import homework.at_project.utils.ActionsUtil;

public class W3SchoolsTests {

    Java w3schools = new Java();
    ActionsUtil actions = new ActionsUtil();
    MainPage google = new MainPage();


    @Before
    public void beforeTests(){
        Driver.getWebDriver();
    }

    @After
    public void afterTests(){
        Driver.closeDriver();
    }
    @Test
    public void tutorialTest() {
        w3schools.getJavaUrl();
        actions.selectingCopyElement(w3schools.findTutorial());
        google.getUrl();
        actions.selectingPasteElement(google.findSearchField());
        Assert.assertEquals("Some links don't contain the 'Tutorial' word", google.displayedResultsCount().size(),
                google.displayedResultsCountContainsTutorial());
    }

}
