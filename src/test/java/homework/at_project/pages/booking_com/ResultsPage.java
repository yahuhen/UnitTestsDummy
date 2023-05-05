package homework.at_project.pages.booking_com;

import homework.at_project.driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ResultsPage {

    WebDriver driver = Driver.getWebDriver();

    public void clickOnTheMaxPricePerNight() {
        try {
            driver.findElement(By.xpath("//*[@id='filter_group_pri_:Rcq:']//descendant::div[@data-filters-item='pri:pri=5']//descendant::span[2]")).click();
        } catch (NoSuchElementException e) {
            Actions make = new Actions(driver);
            make
                    .clickAndHold(driver.findElement(By.xpath("//*[@id='filter_group_price_:Rcq:']//descendant::div[@data-testid='filters-group-histogram']//following-sibling::div/div/div[1]")))
                    .moveByOffset(200, -25)
                    .release()
                    .build()
                    .perform();
        }
    }

    public void waitingSpinner() {
        WebDriverWait element = new WebDriverWait(driver, Duration.ofSeconds(10));
        element.until(
                ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[data-testid='overlay-spinner']"))
        );
    }

    public void clickOnTheSort() {
        driver.findElement(By.cssSelector("[data-testid='sorters-dropdown-trigger']")).click();
    }

    public void clickOnThePriceSorting() {
        driver.findElement(By.cssSelector("[data-id='price']")).click();
    }

    public void assertPricePerNight() {
        try {
            Assert.assertTrue("The price per night is more than filter price",
                    Integer.valueOf(driver.findElement(By.xpath("//*[@data-block-id='hotel_list']//descendant::div[@data-testid='property-card'][1]//descendant::span[@data-testid='price-and-discounted-price']")).getText().replaceAll("[^0-9]", "")) / 7 >=
                            Integer.valueOf(driver.findElement(By.xpath("//*[@id='filter_group_pri_:Rcq:']//descendant::div[@data-filters-item='pri:pri=5']//descendant::div[@data-testid='filters-group-label-content']")).getText().replaceAll("[^0-9]", ""))
            );
        } catch (NoSuchElementException e) {
            Assert.assertTrue("The price per night is more than filter price",
                    Integer.valueOf(driver.findElement(By.xpath("//*[@data-block-id='hotel_list']//descendant::div[@data-testid='property-card'][1]//descendant::span[@data-testid='price-and-discounted-price']")).getText().replaceAll("[^0-9]", "")) / 7 >=
                            Integer.valueOf(driver.findElement(By.xpath("//*[@id='filter_group_price_:Rcq:']//descendant::div[@data-testid='filters-group-histogram']//following-sibling::div/div/input[1]")).getAttribute("value"))
            );
        }
    }

    public List<WebElement> findHotels() {
        return driver.findElements(By.xpath("//*[@data-testid='property-card']"));
    }

    public WebElement findTenthHotel() {
        return driver.findElement(By.xpath("//*[@data-testid='property-card'][10]"));
    }

    public WebElement findTenthHotelTitle() {
        return driver.findElement(By.xpath("//*[@data-testid='property-card'][10]//descendant:: div[@data-testid='title']"));
    }

    public void scrollToElement(WebElement webElement) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",
                webElement);
    }

    public void changeElementBackground(WebElement webElement) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor='green'",
                webElement);
    }

    public void changeElementTextColor(WebElement webElement) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color='red'",
                webElement);
    }

    public void clickOnTheMaxRating() {
        driver.findElement(By.xpath("//div[@id='left']//div[@data-filters-group='review_score']/div[@data-filters-item='review_score:review_score=90']/label/span[2]")).click();
    }

    public int getNumberOfMaxRating() {
        return Integer.valueOf(driver.findElement(By.xpath("//div[@id='left']//div[@data-filters-group='review_score']/div[@data-filters-item='review_score:review_score=90']/label//div[@data-testid='filters-group-label-content']")).getText().replaceAll("[^0-9]", ""));
    }

    public void openFirstHotelUrl() {
        driver.get(driver.findElement(By.xpath("//*[@id='search_results_table']//div[@data-testid='property-card'][1]//div[@data-testid='title']/..")).getAttribute("href"));
    }

}
