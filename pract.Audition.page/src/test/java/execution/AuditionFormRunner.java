package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\execution"},
		glue = {"execution"},
	//	plugin = {"pretty", "rerun:target/failedrun.txt"}
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)

public class AuditionFormRunner extends AbstractTestNGCucumberTests {
	
	
}
