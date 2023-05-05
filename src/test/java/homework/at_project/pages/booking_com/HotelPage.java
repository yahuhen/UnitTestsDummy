package homework.at_project.pages.booking_com;

import homework.at_project.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelPage {

    WebDriver driver = Driver.getWebDriver();

    public int getNumberOfHotelRating() {
        return Integer.valueOf(driver.findElement(By.xpath("//*[@data-testid='review-score-right-component']/div[1]")).getText().replaceAll("[^0-9]", ""));
    }

}
