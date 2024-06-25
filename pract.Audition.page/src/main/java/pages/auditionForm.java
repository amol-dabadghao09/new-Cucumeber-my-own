package pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility.utilityClassAudi;

public class auditionForm extends utilityClassAudi{
	
	@FindBy (xpath = "//input[@id='input_1']")
	private WebElement teamName;
	
	@FindBy (xpath = "//input[@id='input_4']")
	private WebElement school;
	
	@FindBy (xpath = "//select[@id='input_5']")
	private WebElement dropDownCat;
	
	@FindBy (xpath = "//input[@id='input_6']")
	private WebElement otherInfo;
	
	@FindBy (xpath = "//input[@id='input_7']")
	private WebElement actLength;
	
	@FindBy (xpath = "//*[@id='input_8']")
	private WebElement songSelect;
	
	@FindBy (xpath = "//*[@id='first_9']")
	private WebElement fname;
	
	@FindBy (xpath = "//*[@id='last_9']")
	private WebElement lname;
	
	@FindBy (xpath = "//*[@id='input_10_full']")
	private WebElement phNum;
	
	@FindBy (xpath = "//*[@id='input_11']")
	private WebElement emailId;
	
	@FindBy (xpath = "//*[@id='lite_mode_17']")
	private WebElement audiDate;
	
	@FindBy (xpath = "//*[@id='input_17_timeInput']")
	private WebElement audiTime;
	
	@FindBy (xpath = "//*[@id='input_14']")
	private WebElement comment;
	
	@FindBy (xpath = "//*[@id='input_15']")
	private WebElement submitt;
	
	private WebDriver driver;
	
	public auditionForm(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void giveTeamName() throws EncryptedDocumentException, IOException
	{
		System.out.println(utilityClassAudi.getExcelData("auditionForm", 1, 0));
		teamName.sendKeys(utilityClassAudi.getExcelData("auditionForm", 1, 0));
	}
	
	public void giveSchoolName() throws EncryptedDocumentException, IOException
	{
		school.sendKeys(utilityClassAudi.getExcelData("auditionForm", 1, 1));
	}
	
	public void selectCategory()
	{
		Select sel = new Select(dropDownCat);
		sel.selectByVisibleText("Comedy");
	}
	
	public void giveActLength() throws EncryptedDocumentException, IOException
	{
		actLength.sendKeys(utilityClassAudi.getExcelData("auditionForm", 1, 3));
	}
	
	public void giveSongName() throws EncryptedDocumentException, IOException
	{
		songSelect.sendKeys(utilityClassAudi.getExcelData("auditionForm", 1, 4));
	}
	
	public void giveContactInfo() throws EncryptedDocumentException, IOException
	{
		fname.sendKeys(utilityClassAudi.getExcelData("auditionForm", 1, 5));
		lname.sendKeys(utilityClassAudi.getExcelData("auditionForm", 1, 6));
		phNum.sendKeys(utilityClassAudi.getExcelData("auditionForm", 1, 7));
		emailId.sendKeys(utilityClassAudi.getExcelData("auditionForm", 1, 8));
	}
	
	public void auditionDateAndTime() throws EncryptedDocumentException, IOException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", audiDate);
		
		audiDate.click();
		audiDate.sendKeys(Keys.CONTROL + "a");
		audiDate.sendKeys(utilityClassAudi.getExcelData("auditionForm", 1, 9));
		audiTime.click();
		audiTime.sendKeys(Keys.CONTROL + "a");
		audiTime.sendKeys(utilityClassAudi.getExcelData("auditionForm", 1, 10));
	}
	
	public void giveComment() throws EncryptedDocumentException, IOException
	{
		comment.sendKeys(utilityClassAudi.getExcelData("auditionForm", 1, 11));
	}
	
	public void clickSubmittButton()
	{
		submitt.click();
	}

}
