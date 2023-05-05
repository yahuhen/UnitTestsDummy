package homework.at_project.pages.booking_com;

import homework.at_project.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {

    WebDriver driver = Driver.getWebDriver();

    public void getUrl() {
        driver.get("https://booking.com");
    }

    public void skipSignInOffer() {
        driver.findElement(By.xpath("//div[@role='dialog'][@aria-modal='true']//button")).click();
    }

    public void selectingPlace(String placeName) {
        driver.findElement(By.cssSelector("[name='ss']")).sendKeys(placeName);
        driver.findElement(By.xpath("//*[@data-testid='autocomplete-results']/li[1]/descendant:: div[contains(text(),'" + placeName + "')]")).click();
    }

    public void selectingDate(String date) {
        driver.findElement(By.cssSelector("[data-date='" + date + "']")).click();
    }

    public void clickOnOccupancyDropdown() {
        driver.findElement((By.cssSelector("[data-testid='occupancy-config']"))).click();
    }

    public void clickOnTheAdults() {
        driver.findElement(By.xpath("//input[@id='group_adults']/following-sibling::div/button[2]")).click();
    }

    public void clickOnTheApartments() {
        driver.findElement(By.xpath("//input[@id='no_rooms']/following-sibling::div/button[2]")).click();
    }

    public void clickOnTheSubmit() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public WebElement findCurrency() {
        return driver.findElement(By.cssSelector("[data-testid='header-currency-picker-trigger']"));
    }

    public WebElement findLanguage() {
        return driver.findElement(By.cssSelector("[data-testid='header-language-picker-trigger']"));
    }

    public String getCurrencyTooltip() {
        return driver.findElement(By.xpath("//*[@id=':R2cl:']/div")).getText();
    }

    public String getLanguageTooltip() {
        return driver.findElement(By.xpath("//*[@id=':R2kl:']/div")).getText();
    }

    public void clickRegister() {
        driver.findElement(By.xpath("//*[@data-testid='header-sign-up-button']")).click();
    }


}
