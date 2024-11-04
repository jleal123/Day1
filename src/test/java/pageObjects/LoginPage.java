package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By usernameBox = By.id("user-name");
    By passwordBox = By.id("password");
    By loginButton = By.id("login-button");

    public void enterUsernameAndPassword(String username, String password){
        driver.findElement(usernameBox).sendKeys(username);
        driver.findElement(passwordBox).sendKeys(password);
        driver.findElement(loginButton).click();


    }


}
