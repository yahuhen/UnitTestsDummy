package homework.day14;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static junit.framework.TestCase.assertTrue;

public class W3schoolsTest {
    private static WebDriver driver;

    public static void main(String[] args) {
        setup();
        testSearch();
        testDown();
    }

    @Before
    public static void setup() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/java/");
        driver.findElement(By.xpath("//*[@id='accept-choices']")).click();
    }

    @Test
    public static void testSearch() {

        WebElement webElement = driver.findElement(By.linkText("Tutorial"));
        webElement.click();

        Actions make = new Actions(driver);
        make
                .doubleClick()
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c")
                .keyUp(Keys.LEFT_CONTROL)
                .build().perform();


        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys((CharSequence) webElement);
        searchBox.submit();

        // Проверяем, что каждый из результатов поиска содержит слово "Tutorial"
        WebElement results = driver.findElement(By.id("search"));
        assertTrue(results.getText().contains("Tutorial"));
    }

    @After
    public static void testDown() {
        driver.close();
        driver.quit();
    }
}

