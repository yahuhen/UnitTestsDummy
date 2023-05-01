package homework.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingTest2 {
    public static void main(String[] args) {
        // 1. Открыть сайт https://booking.com
        WebDriver driver = new ChromeDriver();
        driver.get("https://booking.com");

        // 2. Ввести в поиск "Москва", выбрать для проживания 2 гостей и 1 номер
        WebElement searchBox = driver.findElement(By.name("ss"));
        searchBox.sendKeys("Москва");

        WebElement guestSelection = driver.findElement(By.xpath("//div[@class='xp__input-group xp__guests']"));
        guestSelection.click();

        WebElement roomsSelection = driver.findElement(By.xpath("//div[@class='sb-group__field sb-group__field-rooms']"));
        roomsSelection.click();

        WebElement roomDecreaseButton = driver.findElement(By.xpath("//button[@aria-label='Уменьшить количество номеров']"));
        roomDecreaseButton.click();

        WebElement guestsDecreaseButton = driver.findElement(By.xpath("//button[@aria-label='Уменьшить количество гостей']"));
        guestsDecreaseButton.click();

        WebElement applyButton = driver.findElement(By.xpath("//button[@type='submit']"));
        applyButton.click();

        // 3. Проверить, что в Москве есть отели на введенные даты
        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();

        WebElement searchResults = driver.findElement(By.id("search_results_table"));
        if (searchResults.isDisplayed()) {
            System.out.println("Отели найдены");
        } else {
            System.out.println("Отелей не найдено");
        }

        // Закрыть браузер
        driver.quit();
    }
}
