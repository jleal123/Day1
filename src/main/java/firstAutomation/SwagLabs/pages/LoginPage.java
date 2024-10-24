package firstAutomation.SwagLabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    By loginButton = By.id("login-button");

    public void enterUsername() {
        String username = "standard_user";
        driver.findElement(usernameField).sendKeys(username);

    }

    public void enterPassword() {
        String password = "secret_sauce";
        driver.findElement(passwordField).sendKeys(password);

    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();

    }

}