package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	
	static WebDriver driver;
	public WebDriver initBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amol\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver-win32_124\\chromedriver-win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		return driver;
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
}
