package homework.day14;

import classwork.day15.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BookingTest0 {
    private WebDriver driver;

    @Before
    public void setUp() {
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = Driver.WebDriver();
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/");
    }

    @Test
    public void testMoscowHotels() {
        WebElement searchField = driver.findElement(By.xpath("//input[@type='search']"));
        searchField.sendKeys("Гданьск");

        // Выбираем опции для проживания
        WebElement guestsField = driver.findElement(By.xpath("//label[@for='xp__guests__toggle']"));
        guestsField.click();

        WebElement roomsField = driver.findElement(By.xpath("//button[@aria-label='Уменьшить количество комнат']"));
        roomsField.click();

        WebElement adultsField = driver.findElement(By.xpath("//button[@aria-label='Увеличить количество взрослых']"));
        adultsField.click();
        adultsField.click();

        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();

        // Проверяем, что на странице отображаются результаты поиска
        /*WebDriverWait wait = new WebDriverWait(driver, 10); // ошибку исправить!!!!!!!!!!!
        WebElement searchResults = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_results_table")));
        List<WebElement> hotels = searchResults.findElements(By.xpath("//div[contains(@class, 'sr_item_no_dates')]"));

        Assert.assertTrue(hotels.size() > 0);*/
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
