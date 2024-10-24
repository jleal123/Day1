package CucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features",
glue = "Login_StepDef")

public class TestNG_TestRunner extends AbstractTestNGCucumberTests {

}
