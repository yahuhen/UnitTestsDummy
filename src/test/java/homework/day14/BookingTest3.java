package homework.day14;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BookingTest3 {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Указываем путь к драйверу для браузера Chrome
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        // Создаем экземпляр браузера Chrome
        driver = new ChromeDriver();
        // Открываем сайт booking.com
        driver.get("https://booking.com");
        // Максимизируем окно браузера
        driver.manage().window().maximize();
    }

    @Test
    public void testBooking() {
        // Вводим в поиск "Москва"
        WebElement searchInput = driver.findElement(By.name("ss"));
        searchInput.sendKeys("Москва");
        // Выбираем для проживания 2 гостей и 1 номер
        WebElement guestsButton = driver.findElement(By.xpath("//label[@id='xp__guests__toggle']"));
        guestsButton.click();
        WebElement roomsInput = driver.findElement(By.id("no_rooms"));
        Select roomsSelect = new Select(roomsInput);
        roomsSelect.selectByValue("1");
        WebElement adultsInput = driver.findElement(By.id("group_adults"));
        Select adultsSelect = new Select(adultsInput);
        adultsSelect.selectByValue("2");
        WebElement searchButton = driver.findElement(By.xpath("//button[@data-sb-id='main']"));
        searchButton.click();
        // Фильтруем отели с максимальным рейтингом
        WebElement sortDropdown = driver.findElement(By.xpath("//a[contains(@class, 'sort_price')]"));
        sortDropdown.click();
        WebElement ratingFilter = driver.findElement(By.xpath("//a[contains(@data-id, 'class')]"));
        ratingFilter.click();
        /*// Ждем, пока страница перезагрузится с отфильтрованными отелями
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement filteredHotels = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hotellist_inner")));
        // Открываем страницу с первым отфильтрованным отелем
        List<WebElement> hotelLinks = filteredHotels.findElements(By.xpath(".//a[contains(@class, 'hotel_name_link')]"));
        hotelLinks.get(0).click();
        // Проверяем, что рейтинг отеля >= 9
        WebElement ratingScore = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'bui-review-score__badge')]")));
        double rating = Double.parseDouble(ratingScore.getText());
        Assert.assertTrue("Рейтинг отеля меньше 9", rating >= 9);*/
    }

    @After
    public void tearDown() {
        // Закрываем браузер
        driver.quit();
    }
}
