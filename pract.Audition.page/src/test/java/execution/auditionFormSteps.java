package execution;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import browser.DriverFactory;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.auditionDataSet1;
import pages.auditionForm;

public class auditionFormSteps {
	
	auditionForm auditionform = new auditionForm(DriverFactory.getDriver());
	auditionDataSet1 auditiondataset1 = new auditionDataSet1(DriverFactory.getDriver());
	WebDriver driver;
	
	@Given("User is at audition form")
	public void user_is_at_audition_form() {
		
		driver = DriverFactory.getDriver();
		driver.get("https://form.jotform.com/232461629053151");
	}

	@When("User fill all the information from excel sheet")
	public void user_fill_all_the_information_from_excel_sheet() throws EncryptedDocumentException, IOException, InterruptedException {
		
		auditionform.giveTeamName();
		Thread.sleep(1000);
		auditionform.giveSchoolName();
		Thread.sleep(1000);
		auditionform.selectCategory();
		Thread.sleep(1000);
		auditionform.giveActLength();
		Thread.sleep(1000);
		auditionform.giveSongName();
		Thread.sleep(1000);
		auditionform.giveContactInfo();
		Thread.sleep(1000);
		auditionform.auditionDateAndTime();
		Thread.sleep(1000);
		auditionform.giveComment();
	}
	
	@When("User fill all the information from excel sheet set1")
	public void user_fill_all_the_information_from_excel_sheet_set1() throws EncryptedDocumentException, IOException, InterruptedException {
		
		auditiondataset1.giveTeamName();
		Thread.sleep(1000);
		auditiondataset1.giveSchoolName();
		Thread.sleep(1000);
		auditiondataset1.selectCategory();
		Thread.sleep(1000);
		auditiondataset1.giveActLength();
		Thread.sleep(1000);
		auditiondataset1.giveSongName();
		Thread.sleep(1000);
		auditiondataset1.giveContactInfo();
		Thread.sleep(1000);
		auditiondataset1.auditionDateAndTime();
		Thread.sleep(1000);
		auditiondataset1.giveComment();
	}

	@When("User click on Submitt button")
	public void user_click_on_submitt_button() {
	    
		auditionform.clickSubmittButton();
	}

	@Then("Verify page title {string}")
	public void verify_page_title(String string) {
	    
		String title = driver.getTitle();
		org.testng.Assert.assertEquals(title, string);
	}

}
