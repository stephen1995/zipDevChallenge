package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\main\\java\\features",
        glue = "stepDefinitions",
        tags = "@Ra",
        monochrome = true,
        dryRun = true)
public class TestNGRunner extends AbstractTestNGCucumberTests {



}
