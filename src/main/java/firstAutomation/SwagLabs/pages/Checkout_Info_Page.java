package firstAutomation.SwagLabs.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout_Info_Page {

    WebDriver driver;

    public Checkout_Info_Page(WebDriver driver) {
        this.driver = driver;
    }

    Faker faker = new Faker();

    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By zipCode = By.id("postal-code");
    By continueButton = By.id("continue");

    public void enterFirstName(){
        driver.findElement(firstName).sendKeys(faker.dragonBall().character());
    }

    public void enterLastName(){
        driver.findElement(lastName).sendKeys(faker.name().lastName());
    }

    public void enterZipCode(){
        driver.findElement(zipCode).sendKeys(faker.address().zipCode());
    }

    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }

//        Faker faker = new Faker();
//        WebElement firstNameField = driver.findElement(By.id("first-name"));
//        firstNameField.click();
//        firstNameField.sendKeys(faker.dragonBall().character());
//        Thread.sleep(1000);
//        WebElement lastNameField = driver.findElement(By.id("last-name"));
//        lastNameField.click();
//        lastNameField.sendKeys(faker.name().lastName());
//        Thread.sleep(1000);
//        WebElement zipCodeField = driver.findElement(By.id("postal-code"));
//        zipCodeField.click();
//        zipCodeField.sendKeys(faker.address().zipCode());
//        Thread.sleep(1000);
//        WebElement continueButton = driver.findElement(By.id("continue"));
//        continueButton.click();
//        Thread.sleep(1000);



}
