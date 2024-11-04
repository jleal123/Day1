package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    WebDriver driver;
    public LoginPage loginPage;
    public HomePage homePage;
    public BikeLightPage bikeLightPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage(){
        loginPage = new LoginPage(driver);
        return loginPage;
    }

    public HomePage getHomePage(){
        homePage = new HomePage(driver);
        return homePage;
    }

    public BikeLightPage getBikeLightPage(){
        bikeLightPage = new BikeLightPage(driver);
        return bikeLightPage;
    }




}
