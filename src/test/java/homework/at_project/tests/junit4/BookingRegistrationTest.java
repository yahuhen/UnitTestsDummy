package homework.at_project.tests.junit4;

import homework.at_project.driver.Driver;
import homework.at_project.pages.booking_pages.HomePage;
import homework.at_project.pages.booking_pages.SignInPage;
import homework.at_project.pages.tempmail_pages.MainPage;
import homework.at_project.utils.ActionsUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class BookingRegistrationTest {

    HomePage bookingHomePage = new HomePage();
    MainPage tempmail = new MainPage();
    SignInPage bookingSignInPage = new SignInPage();
    ActionsUtil actions = new ActionsUtil();
    WebDriver driver = Driver.getWebDriver();

    @Before
    public void beforeTest() {
        tempmail.getUrl();
        tempmail.getEmail();

    }

    @After
    public void afterTest() {

    }

    @Test
    public void registerTest() {
        actions.openNewTab();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        bookingHomePage.getUrl();
        bookingHomePage.skipSignInOffer();
        bookingHomePage.clickRegister();
        actions.selectingPaste();
        bookingSignInPage.clickSubmit();
        bookingSignInPage.enterPassword("Lalala123456!");
        actions.clickAndHold(bookingSignInPage.getCaptcha());
    }

}
