package firstAutomation.SwagLabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout_Overview_Page {

    WebDriver driver;

    public Checkout_Overview_Page(WebDriver driver) {
        this.driver = driver;
    }

    By finishButton = By.id("finish");
    By cancelButton = By.id("cancel");

    public void clickFinishButton(){
        driver.findElement(finishButton).click();
    }

    public void clickCancelButton(){
        driver.findElement(cancelButton).click();
    }





}
