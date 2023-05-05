package homework.at_project.tests;

import homework.at_project.driver.Driver;
import homework.at_project.objects.actions.MyActions;
import homework.at_project.objects.booking_com.MyDates;
import homework.at_project.pages.booking_com.HomePage;
import homework.at_project.pages.booking_com.HotelPage;
import homework.at_project.pages.booking_com.ResultsPage;
import homework.at_project.pages.booking_com.SignInPage;
import homework.at_project.pages.tempmail_org.MainPage;
import org.junit.*;


public class Booking {

    MyDates date = new MyDates();
    HomePage bookingHomePage = new HomePage();
    ResultsPage bookingResultsPage = new ResultsPage();
    HotelPage bookingHotelPage = new HotelPage();
    MyActions actions = new MyActions();
    MainPage tempmail = new MainPage();
    SignInPage bookingSignInPage = new SignInPage();

    @Before
    public void beforeTests() {
        Driver.getWebDriver();
    }

    @After
    public void afterTests() {
        Driver.closeDriver();
    }

    @Test
    public void pricePerNightTest() {
        bookingHomePage.getUrl();
        bookingHomePage.skipSignInOffer();
        bookingHomePage.selectingPlace("Париж");
        bookingHomePage.selectingDate(date.thirdDay());
        bookingHomePage.selectingDate(date.tenthDay());
        bookingHomePage.clickOnOccupancyDropdown();
        bookingHomePage.clickOnTheAdults();
        bookingHomePage.clickOnTheAdults();
        bookingHomePage.clickOnTheApartments();
        bookingHomePage.clickOnTheSubmit();
        bookingResultsPage.clickOnTheMaxPricePerNight();
        bookingResultsPage.waitingSpinner();
        bookingResultsPage.clickOnTheSort();
        bookingResultsPage.clickOnThePriceSorting();
        bookingResultsPage.assertPricePerNight();
    }

    @Test
    public void colorsTest() {
        bookingHomePage.getUrl();
        bookingHomePage.skipSignInOffer();
        bookingHomePage.selectingPlace("Париж");
        bookingHomePage.selectingDate(date.thirdDay());
        bookingHomePage.selectingDate(date.tenthDay());
        bookingHomePage.clickOnTheSubmit();
        bookingResultsPage.scrollToElement(bookingResultsPage.findTenthHotel());
        bookingResultsPage.changeElementBackground(bookingResultsPage.findTenthHotel());
        bookingResultsPage.changeElementTextColor(bookingResultsPage.findTenthHotelTitle());
        Assert.assertEquals("The text color isn't red", "color: red;", bookingResultsPage.findTenthHotelTitle().getAttribute("style"));
    }

    @Test
    public void hotelAvailabilityTest() {
        bookingHomePage.getUrl();
        bookingHomePage.skipSignInOffer();
        bookingHomePage.selectingPlace("Париж");
        bookingHomePage.selectingDate(date.thirdDay());
        bookingHomePage.selectingDate(date.tenthDay());
        bookingHomePage.clickOnTheSubmit();
        Assert.assertTrue("There are no hotels", bookingResultsPage.findHotels().size() > 0);
    }

    @Test
    public void hotelRatingTest() {
        bookingHomePage.getUrl();
        bookingHomePage.skipSignInOffer();
        bookingHomePage.selectingPlace("Париж");
        bookingHomePage.selectingDate(date.thirdDay());
        bookingHomePage.selectingDate(date.tenthDay());
        bookingHomePage.clickOnTheSubmit();
        bookingResultsPage.clickOnTheMaxRating();
        bookingResultsPage.waitingSpinner();
        int rating = bookingResultsPage.getNumberOfMaxRating();
        bookingResultsPage.openFirstHotelUrl();
        Assert.assertTrue("The hotel rating is less than 9",
                bookingHotelPage.getNumberOfHotelRating() >= rating
        );
    }

    @Test
    public void currencyTest() {
        bookingHomePage.getUrl();
        bookingHomePage.skipSignInOffer();
        actions.hoverElement(bookingHomePage.findCurrency());
        String tooltip = bookingHomePage.getCurrencyTooltip();
        Assert.assertEquals("There is an incorrect tooltip", "Выберите валюту", tooltip);
    }

    @Test
    public void languageTest() {
        bookingHomePage.getUrl();
        bookingHomePage.skipSignInOffer();
        actions.hoverElement(bookingHomePage.findLanguage());
        String tooltip = bookingHomePage.getLanguageTooltip();
        Assert.assertEquals("There is an incorrect tooltip", "Выберите язык", tooltip);
    }

/*    @Test
    public void registerTest() {
        tempmail.getUrl();
        tempmail.getEmail();
        actions.openNewTab();
        bookingHomePage.getUrl();
        bookingHomePage.skipSignInOffer();
        bookingHomePage.clickRegister();
        bookingSignInPage.enterEmail("lala@la.la");
        bookingSignInPage.clickSubmit();
        bookingSignInPage.enterPassword("lalala");
        bookingSignInPage.confirmPassword("lalala");
    }*/

}
