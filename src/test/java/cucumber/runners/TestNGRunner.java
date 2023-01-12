package cucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//java//cucumber" , glue = "cucumber.stepDefinitions", monochrome = true , plugin = {"html:reports//cucumberReports//cucumberReport.html" })
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
