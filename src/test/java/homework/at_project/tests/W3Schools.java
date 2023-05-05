package homework.at_project.tests;


import homework.at_project.driver.Driver;
import homework.at_project.objects.actions.MyActions;
import homework.at_project.pages.google.com.MainPage;
import homework.at_project.pages.www_w3schools_com.Java;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class W3Schools {

    Java w3schools = new Java();
    MyActions actions = new MyActions();
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
