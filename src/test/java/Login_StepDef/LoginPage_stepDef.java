package Login_StepDef;

import firstAutomation.SwagLabs.pages.HomePage;
import firstAutomation.SwagLabs.pages.LoginPage;
import firstAutomation.SwagLabs.utils.WebDriverUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static firstAutomation.SwagLabs.utils.WebDriverUtils.driver;

public class LoginPage_stepDef {

    @Given("^User is on Login Page$")
    public void user_is_on_Login_Page()  {
        WebDriverUtils.setUp();
    }

    @When("^User logs into application with username and password$")
    public void user_logs_into_application_with_username_and_password(){
        LoginPage loginPage = new LoginPage (driver);
        loginPage.enterUsername();
        loginPage.enterPassword();
    }

    @And("^User clicks login button$")
    public void user_clicks_login_button(){
        LoginPage loginPage = new LoginPage (driver);
        loginPage.clickLoginButton();
    }


    @Then("^Home Page is populated$")
    public void home_page_is_populated(){
        HomePage homePage = new HomePage(driver);
        homePage.verifyHomePage();
        WebDriverUtils.quitDriver();


    }

















}
