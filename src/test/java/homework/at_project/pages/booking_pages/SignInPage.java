package homework.at_project.pages.booking_pages;

import homework.at_project.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

    WebDriver driver = Driver.getWebDriver();

    public void enterEmail(String myEmail) {
        driver.findElement(By.id("username")).sendKeys(myEmail);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public void clickSubmit() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("new_password")).sendKeys(password);
        driver.findElement(By.id("confirmed_password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public WebElement getCaptcha() {
        return driver.findElement(By.xpath("//div[@aria-label='Нажать и удерживать']"));
    }


}
