package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDef", monochrome = true)

public class testNGTestRunner extends AbstractTestNGCucumberTests {

}
