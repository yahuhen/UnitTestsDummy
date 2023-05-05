package homework.at_project.pages.booking_com;

import homework.at_project.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {

    WebDriver driver = Driver.getWebDriver();

    public void enterEmail(String myEmail) {
        driver.findElement(By.id("username")).sendKeys(myEmail);
    }

    public void clickSubmit() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("new_password")).sendKeys(password);
    }

    public void confirmPassword(String password) {
        driver.findElement(By.id("confirmed_password")).sendKeys(password);
    }


}
