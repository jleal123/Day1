package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {

    public WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHomePage(){
        String actual = driver.findElement(By.className("title")).getText();
        String expected = "Products";
        Assert.assertEquals(actual, expected, "Unsuccessful login");
        System.out.println("Successful login! You are now on the Home Page");
    }

    By bikeLightTitle = By.xpath("//div[text()='Sauce Labs Bike Light']");

    public void clickBikeLight(){
        driver.findElement(bikeLightTitle).click();
    }


}
