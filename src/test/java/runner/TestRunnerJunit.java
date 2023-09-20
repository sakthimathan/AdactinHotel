package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(features = "C:\\Users\\Lenovo\\eclipse-workspace\\AdactinHotel\\src\\test\\resources\\Feature",
dryRun =!true,glue = "stepDefinition",plugin = {"pretty","html:target/cucumber-Junireports.html"}

		
		
		)
public class TestRunnerJunit {
	

}
