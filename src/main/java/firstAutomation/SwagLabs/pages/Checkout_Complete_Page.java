package firstAutomation.SwagLabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout_Complete_Page{

   WebDriver driver;

    public Checkout_Complete_Page(WebDriver driver) {
        this.driver = driver;
    }

    By backHomeButton = By.id("back-to-products");

    public void clickBackHomeButton(){
        driver.findElement(backHomeButton).click();
    }










}
