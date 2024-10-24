package firstAutomation.SwagLabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Items Title and Add To Cart Button
    By backpackTitle = By.xpath("//div[text()='Sauce Labs Backpack']");
    By bikeLightTitle = By.xpath("//div[text()='Sauce Labs Bike Light']");
    By shirtTitle = By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']");
    By fleeceJacketTitle = By.xpath("//div[text()='Sauce Labs Fleece Jacket']");
    By onesieTitle = By.xpath("//div[text()='Sauce Labs Onesie']");
    By redShirtTitle = By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']");
    By addToCart = By.xpath("//button[text()='Add to cart']");
    By sortDropdown = By.className("product_sort_container");
    By cartButton = By.className("shopping_cart_link");

    public void clickBackpackTitle() {
        driver.findElement(backpackTitle).click();
    }
    public void clickBikeLightTitle() {
        driver.findElement(bikeLightTitle).click();
    }
    public void clickShirtTitle() {
        driver.findElement(shirtTitle).click();
    }
    public void clickFleeceJacketTitle() {
        driver.findElement(fleeceJacketTitle).click();
    }
    public void clickOnesieTitle() {
        driver.findElement(onesieTitle).click();
    }
    public void clickRedShirtTitle() {
        driver.findElement(redShirtTitle).click();
    }
    public void clickRandomAddToCartButton(){
        List<WebElement> buttons = driver.findElements(addToCart);

        if (buttons.size()>0){
            Random random = new Random();
            int randomIndex = random.nextInt(buttons.size());
            buttons.get(randomIndex).click();
        }else{
            System.out.println("No 'Add To Cart' buttons found!");
        }
    }

    public void randomDropdown(){
        WebElement dropdownElement = driver.findElement(sortDropdown);
        Select select = new Select(dropdownElement);
        List<WebElement> options = select.getOptions();

        int startIndex = 0;
        Random random = new Random();
        int randomIndex = startIndex + random.nextInt(options.size() - startIndex);

        select.selectByIndex(randomIndex);
    }

    public void clickCartButton(){
        driver.findElement(cartButton).click();
    }

    public void verifyHomePage(){
        String ActualTitle = driver.findElement(By.xpath("//span[text()='Products']")).getText();
        String ExpectedTitle = driver.findElement(By.xpath("//span[text()='Products']")).getText();
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        System.out.println("Expected Title: " + ExpectedTitle);
        System.out.println("Actual Title: " + ActualTitle);





    }



}
