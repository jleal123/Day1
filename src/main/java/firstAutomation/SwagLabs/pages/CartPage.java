package firstAutomation.SwagLabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By checkoutButton = By.id("checkout");
    By removeButton = By.id("remove-sauce-labs-bike-light");
    By continueShoppingButton = By.id("continue-shopping");

    public void clickCheckoutButton(){
        driver.findElement(checkoutButton).click();
    }

    public void clickRemoveButton(){
        driver.findElement(removeButton).click();
    }

    public void clickContinueShoppingButton(){
        driver.findElement(continueShoppingButton);
    }


}
