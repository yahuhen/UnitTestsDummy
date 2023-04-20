package day15042023;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class TaskOneTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.get("https://www.booking.com/");
        driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();

        // Ввод данных для поиска отелей в Париже
        WebElement cityField = driver.findElement(By.name("ss"));
        cityField.sendKeys("Париж");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        // Открываем календарь
        WebElement dates = driver.findElement(By.xpath("//*[@id=\"indexsearch\"]//button[@data-testid=\"date-display-field-start\"]"));
        dates.click();

        //Выбираем даты
        LocalDate checkinDate = LocalDate.now().plusDays(3);
        LocalDate checkoutDate = checkinDate.plusDays(7);

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        WebElement checkinDateField = driver.findElement(By.xpath(String.format("//span[@data-date='%s']", checkinDate.format(dateFormat))));
        checkinDateField.click();

        WebElement checkoutDateField = driver.findElement(By.xpath(String.format("//span[@data-date='%s']", checkoutDate.format(dateFormat))));
        checkoutDateField.click();


        //номера + люди
        WebElement optionsButton = driver.findElement(By.xpath("//*[@data-testid='occupancy-config']"));
        optionsButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement clickElement = driver.findElement(By.xpath("//*[@id='group_adults']/following-sibling::div/button[2]"));
        clickElement.click();
        clickElement.click();
        driver.findElement(By.xpath("//*[@id='no_rooms']/following-sibling::div/button[2]")).click();

        //сабмит
        driver.findElement(By.xpath("//*[@type='submit']")).click();
    }
}