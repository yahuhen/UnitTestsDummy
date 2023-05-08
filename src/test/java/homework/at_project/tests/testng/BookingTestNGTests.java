package homework.at_project.tests.testng;

import homework.at_project.driver.Driver;
import homework.at_project.pages.booking_pages.HomePage;
import homework.at_project.pages.booking_pages.HotelPage;
import homework.at_project.pages.booking_pages.ResultsPage;
import homework.at_project.utils.ActionsUtil;
import homework.at_project.utils.DateUtil;
import org.testng.Assert;
import org.testng.annotations.*;


public class BookingTestNGTests {

    HomePage bookingHomePage = new HomePage();
    ResultsPage bookingResultsPage = new ResultsPage();
    HotelPage bookingHotelPage = new HotelPage();

    DateUtil date = new DateUtil();
    ActionsUtil actions = new ActionsUtil();

    @BeforeMethod
    public void beforeTests() {
        Driver.getWebDriver();
    }
    @AfterMethod
    public void afterTests() {
        Driver.closeDriver();
    }

    @Test
    public void pricePerNightTest() {
        bookingHomePage.getUrl();
        bookingHomePage.skipSignInOffer();
        bookingHomePage.selectingPlace("Париж");
        bookingHomePage.selectingDate(date.setDay(3));
        bookingHomePage.selectingDate(date.setDay(10));
        bookingHomePage.clickOnOccupancyDropdown();
        bookingHomePage.clickOnTheAdults();
        bookingHomePage.clickOnTheAdults();
        bookingHomePage.clickOnTheApartments();
        bookingHomePage.clickOnTheSubmit();
        bookingResultsPage.clickOnTheMaxPricePerNight();
        bookingResultsPage.waitForSpinner();
        bookingResultsPage.clickOnTheSortDropdown();
        bookingResultsPage.clickOnThePriceSorting();
        bookingResultsPage.assertPricePerNightTestNG();
    }

    @Test
    public void colorsTest() {
        bookingHomePage.getUrl();
        bookingHomePage.skipSignInOffer();
        bookingHomePage.selectingPlace("Париж");
        bookingHomePage.selectingDate(date.setDay(3));
        bookingHomePage.selectingDate(date.setDay(10));
        bookingHomePage.clickOnTheSubmit();
        bookingResultsPage.scrollToElement(bookingResultsPage.findHotel(10));
        bookingResultsPage.changeElementBackground(bookingResultsPage.findHotel(10));
        bookingResultsPage.changeElementTextColor(bookingResultsPage.findHotelTitle(10));
        Assert.assertEquals(bookingResultsPage.findHotelTitle(10).getAttribute("style"), "color: red;", "The text color isn't red");
    }

    @Test
    public void hotelAvailabilityTest() {
        bookingHomePage.getUrl();
        bookingHomePage.skipSignInOffer();
        bookingHomePage.selectingPlace("Париж");
        bookingHomePage.selectingDate(date.setDay(3));
        bookingHomePage.selectingDate(date.setDay(10));
        bookingHomePage.clickOnTheSubmit();
        Assert.assertTrue(bookingResultsPage.findHotels().size() > 0, "There are no hotels");
    }

    @Test
    public void hotelRatingTest() {
        bookingHomePage.getUrl();
        bookingHomePage.skipSignInOffer();
        bookingHomePage.selectingPlace("Париж");
        bookingHomePage.selectingDate(date.setDay(3));
        bookingHomePage.selectingDate(date.setDay(10));
        bookingHomePage.clickOnTheSubmit();
        bookingResultsPage.clickOnTheMaxRating();
        bookingResultsPage.waitForSpinner();
        int rating = bookingResultsPage.getNumberOfMaxRating();
        bookingResultsPage.openFirstHotelUrl();
        Assert.assertTrue(bookingHotelPage.getNumberOfHotelRating() >= rating, "The hotel rating is less than 9");
    }

    @Test
    public void currencyTest() {
        bookingHomePage.getUrl();
        bookingHomePage.skipSignInOffer();
        actions.hoverElement(bookingHomePage.findCurrency());
        String tooltip = bookingHomePage.getCurrencyTooltip();
        Assert.assertEquals(tooltip, "Выберите валюту", "There is an incorrect tooltip");
    }

    @Test
    public void languageTest() {
        bookingHomePage.getUrl();
        bookingHomePage.skipSignInOffer();
        actions.hoverElement(bookingHomePage.findLanguage());
        String tooltip = bookingHomePage.getLanguageTooltip();
        Assert.assertEquals(tooltip, "Выберите язык", "There is an incorrect tooltip");
    }

}
