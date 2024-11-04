package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BikeLightPage {

    WebDriver driver;
    public BikeLightPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyBikeLightPage(){
        String actual = driver.findElement(By.className("inventory_details_price")).getText();
        String expected = "$9.99";
        Assert.assertEquals(actual, expected, "Bike Light Page Match Unsuccessful");
        System.out.println("You were on the Home Page and now you're on the Bike Light Page.");
    }
}
