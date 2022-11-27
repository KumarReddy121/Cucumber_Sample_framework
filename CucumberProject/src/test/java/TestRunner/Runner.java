package TestRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions
		(
		features=".//Features/login.feature",
		glue="StepDefination",
		dryRun=false,
		monochrome = false,
		plugin= {"pretty", "html:test-output"}
		 
		)

public class Runner {

}
