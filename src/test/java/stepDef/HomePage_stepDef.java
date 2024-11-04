package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class HomePage_stepDef {

    public TestContextSetup testContextSetup;

    public HomePage_stepDef(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @Given("Home Page is populated")
    public void home_page_is_populated(){
//        HomePage homePage = new HomePage(testContextSetup.driver);
//        homePage.verifyHomePage();
        testContextSetup.testBase.WebDriverManager();
        testContextSetup.pageObjectManager.getLoginPage().enterUsernameAndPassword("standard_user",
                "secret_sauce");
        testContextSetup.pageObjectManager.getHomePage().verifyHomePage();




    }

    @When("User clicks on Bike Light item")
    public void user_clicks_on_bike_light_item() {
//        HomePage homePage = new HomePage(testContextSetup.driver);
//        homePage.clickBikeLight();
        testContextSetup.pageObjectManager.getHomePage().clickBikeLight();

    }

    @Then("Bike Light Page populates")
    public void bike_light_page_populates() {
//        BikeLightPage bikeLightPage = new BikeLightPage(testContextSetup.driver);
//        bikeLightPage.verifyBikeLightPage();

        testContextSetup.pageObjectManager.getBikeLightPage().verifyBikeLightPage();
        testContextSetup.testBase.quitDriver();


    }


}
