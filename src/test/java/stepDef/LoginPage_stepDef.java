package stepDef;

import pageObjects.LoginPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage_stepDef {
   public TestContextSetup testContextSetup;
   public PageObjectManager pageObjectManager;

   public LoginPage_stepDef(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @Given("User is on Login Page")
    public void user_is_on_Login_Page()  {
        //testContextSetup.driver.get("https://www.saucedemo.com/");
        testContextSetup.testBase.WebDriverManager();

        }

    @When("User enters username {string} and password {string}")
    public void user_Enters_Username_And_Password(String username, String password) {
       pageObjectManager = new PageObjectManager(testContextSetup.driver);
        LoginPage loginPage = testContextSetup.pageObjectManager.getLoginPage() ;
        loginPage.enterUsernameAndPassword(username, password);
        testContextSetup.testBase.quitDriver();
    }



}
