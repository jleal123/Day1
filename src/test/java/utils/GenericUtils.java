package utils;

import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;

public class GenericUtils {

    public WebDriver driver;
    public LoginPage loginPage;
    public TestBase testBase;

    public GenericUtils(WebDriver driver) {
        this.driver = driver;
        testBase = new TestBase();
        loginPage = new LoginPage(testBase.WebDriverManager());
    }


}
