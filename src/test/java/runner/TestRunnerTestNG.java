package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "C:\\Users\\Lenovo\\eclipse-workspace\\AdactinHotel\\src\\test\\resources\\Feature",
dryRun =!true,glue = "stepDefinition",plugin = {"pretty","html:target/cucumber-testNGreports.html"}

		
		
		)
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {
	
	

}
