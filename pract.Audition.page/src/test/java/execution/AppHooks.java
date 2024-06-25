package execution;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

// import com.aventstack.extentreports.gherkin.model.Scenario;

import browser.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {
	
	WebDriver driver;
	
	@Before
	public void lauchBrowser()
	{
		DriverFactory df = new DriverFactory();
		driver = df.initBrowser(); 
		driver.manage().window().maximize();
	}
	
	@After(order = 1)
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@After(order = 2)
	public void tearDownScreenshot(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			String scenarioName = scenario.getName();
			String sceName = scenarioName.replaceAll(" ", "_");
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenShot = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenShot, "image/png", sceName);
		}
	}

}
