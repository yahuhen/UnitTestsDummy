package homework.at_project.pages.booking_pages;

import homework.at_project.driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelPage {

    WebDriver driver = Driver.getWebDriver();

    public static final Logger LOGGER = Logger.getLogger(HotelPage.class.getName());

    public int getNumberOfHotelRating() {
        LOGGER.trace("Find the hotel rating value, locator = '//*[@data-testid='review-score-right-component']/div[1]'");
        return Integer.valueOf(driver.findElement(By.xpath("//*[@data-testid='review-score-right-component']/div[1]")).getText().replaceAll("[^0-9]", ""));
    }

}
