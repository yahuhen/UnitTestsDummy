package homework.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMenuTest {
    public static void main(String[] args) {
        // 1. Открыть страницу https://demoqa.com/select-menu
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");

        // 2. Выбрать любое значение в каждом из выпадающих списков
        WebElement categorySelect = driver.findElement(By.id("oldSelectMenu"));
        Select selectCategory = new Select(categorySelect);
        selectCategory.selectByValue("4");

        WebElement valueSelect = driver.findElement(By.id("cars"));
        Select selectValue = new Select(valueSelect);
        selectValue.selectByVisibleText("Audi");

        WebElement multiSelect = driver.findElement(By.id("multi-select"));
        Select selectMulti = new Select(multiSelect);
        selectMulti.selectByIndex(1);
        selectMulti.selectByIndex(2);

        // Закрыть браузер
        driver.quit();
    }
}
