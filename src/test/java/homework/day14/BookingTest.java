package homework.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BookingTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://booking.com");

        // 2. Навести мышь на индикатор валюты и проверить значение подсказки
        WebElement currencyIndicator = driver.findElement(By.xpath("//button[@data-tooltip-text='Выберите вашу валюту']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(currencyIndicator).perform();
        String currencyTooltip = currencyIndicator.getAttribute("data-tooltip-text");
        System.out.println("Значение подсказки для индикатора валюты: " + currencyTooltip);

        // 4. Навести мышь на индикатор языка и проверить значение подсказки
        WebElement languageIndicator = driver.findElement(By.xpath("//span[@class='xpb__link__text']"));
        actions.moveToElement(languageIndicator).perform();
        String languageTooltip = languageIndicator.getAttribute("data-tooltip-text");
        System.out.println("Значение подсказки для индикатора языка: " + languageTooltip);

        driver.quit();
    }
}
