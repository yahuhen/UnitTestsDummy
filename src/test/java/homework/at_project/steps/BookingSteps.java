package homework.at_project.steps;

import homework.at_project.driver.Driver;
import homework.at_project.pages.booking_pages.HomePage;
import homework.at_project.pages.booking_pages.HotelPage;
import homework.at_project.pages.booking_pages.ResultsPage;
import homework.at_project.utils.ActionsUtil;
import homework.at_project.utils.DateUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BookingSteps {

    HomePage bookingHomePage = new HomePage();
    ResultsPage bookingResultsPage = new ResultsPage();
    HotelPage bookingHotelPage = new HotelPage();

    DateUtil date = new DateUtil();
    ActionsUtil actions = new ActionsUtil();
    int rating;
    private String tooltip;

    @Before
    public void beforeTests() {
        Driver.getWebDriver();
    }

    @After
    public void afterTests() {
        Driver.closeDriver();
    }

    @Given("I open the \"booking.com\"")
    public void openBooking() {
        bookingHomePage.getUrl();
    }

    @When("I skip \"Sign In\" offer")
    public void skipSignInOffer() {
        bookingHomePage.skipSignInOffer();
    }

    @When("I select the {string} city")
    public void selectingPlace(String city) {
        bookingHomePage.selectingPlace(city);
    }

    @When("I set dates from {int} to {int}")
    public void selectingDates(int dateFrom, int dateTo) {
        bookingHomePage.selectingDate(date.setDay(dateFrom));
        bookingHomePage.selectingDate(date.setDay(dateTo));
    }

    @When("I click on the Occupancy dropdown")
    public void clickOnOccupancyDropdown() {
        bookingHomePage.clickOnOccupancyDropdown();
    }

    @When("I click on the Adults +")
    public void clickOnTheAdults() {
        bookingHomePage.clickOnTheAdults();
    }

    @When("I click on the Apartments +")
    public void clickOnTheApartments() {
        bookingHomePage.clickOnTheApartments();
    }

    @When("I click on the Submit")
    public void clickOnTheSubmit() {
        bookingHomePage.clickOnTheSubmit();
    }

    @When("I click on the max price per night in the filters")
    public void clickOnTheMaxPricePerNight() {
        bookingResultsPage.clickOnTheMaxPricePerNight();
    }

    @When("I wait when spinner disappears")
    public void waitForSpinner() {
        bookingResultsPage.waitForSpinner();
    }

    @When("I click on the Sorting dropdown")
    public void clickOnTheSortDropdown() {
        bookingResultsPage.clickOnTheSortDropdown();
    }

    @When("I select the Price Sorting")
    public void clickOnThePriceSorting() {
        bookingResultsPage.clickOnThePriceSorting();
    }

    @Then("I check the price per night")
    public void checkPricePerNight() {
        bookingResultsPage.assertPricePerNight();
    }

    @When("I scroll to the {int}th hotel")
    public void scrollToHotel(int hotel) {
        bookingResultsPage.scrollToElement(bookingResultsPage.findHotel(hotel));
    }

    @When("I change the {int}th hotel's background")
    public void changeHotelBackground(int hotel) {
        bookingResultsPage.changeElementBackground(bookingResultsPage.findHotel(hotel));
    }

    @When("I change the {int}th hotel's title color")
    public void changeHotelTextColor(int hotel) {
        bookingResultsPage.changeElementTextColor(bookingResultsPage.findHotelTitle(hotel));
    }

    @Then("I check that colors of the {int}th hotel are changed")
    public void checkColorChanging(int hotel) {
        Assert.assertEquals("The text color isn't red", "color: red;", bookingResultsPage.findHotelTitle(hotel).getAttribute("style"));
    }

    @Then("I check appearance at least one hotel")
    public void checkHotels() {
        Assert.assertTrue("There are no hotels", bookingResultsPage.findHotels().size() > 0);
    }

    @When("I click on the max rating in the filters")
    public void clickOnTheMaxRating() {
        bookingResultsPage.clickOnTheMaxRating();
        rating = bookingResultsPage.getNumberOfMaxRating();
    }

    @When("I open the first hotel")
    public void openFirstHotelUrl() {
        bookingResultsPage.openFirstHotelUrl();
    }

    @Then("I check the hotel rating")
    public void checkHotelRating() {
        Assert.assertTrue("The hotel rating is less than 9",
                bookingHotelPage.getNumberOfHotelRating() >= rating);
    }

    @When("I hover on the currency")
    public void hoverOnTheCurrency() {
        actions.hoverElement(bookingHomePage.findCurrency());
        tooltip = bookingHomePage.getCurrencyTooltip();
    }

    @Then("I check the currency tooltip value")
    public void checkTheCurrencyValue() {
        Assert.assertEquals("There is an incorrect tooltip", "Выберите валюту", tooltip);
    }

    @When("I hover on the language")
    public void hoverOnTheLanguage() {
        actions.hoverElement(bookingHomePage.findLanguage());
        tooltip = bookingHomePage.getLanguageTooltip();
    }

    @Then("I check the language tooltip value")
    public void checkTheLanguageValue() {
        Assert.assertEquals("There is an incorrect tooltip", "Выберите язык", tooltip);
    }

}
