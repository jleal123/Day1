package firstAutomation.SwagLabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BikeLightPage {

    WebDriver driver;

    public BikeLightPage(WebDriver driver) {
        this.driver = driver;
    }

    By addToCartBikeLight = By.id("add-to-cart");
    By cartButton = By.className("shopping_cart_link");

    public void clickBikeLightAddToCart(){
        driver.findElement(addToCartBikeLight).click();
    }

    public void clickCartButtonBikeLight(){
        driver.findElement(cartButton).click();
    }

}
