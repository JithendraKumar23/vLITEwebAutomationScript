package Pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class EditProfilePage extends BasePage {

	
	public EditProfilePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(id = "upload")
	private WebElement clickOnUploadButtonOnEditProfilePage;
	
	@FindBy(xpath = "(//input[@class='prof-input prof-input-normal'])[1]")
	private WebElement nameFieldOnEditPage;
	
	@FindBy(xpath = "//*[@id='main']/div[3]/div[1]/div[2]/div[3]/input[2]")
	private WebElement emailFieldOnEditPage;

	@FindBy(xpath = "//input[@name='date']")
	private WebElement clickOnDOBField;
	
	@FindBy(xpath = "//a[@class='mx-current-month']")
	private WebElement clickOnTheMonthSelectionField;
	
	@FindBy(xpath = "//span[text()='Oct']")
	private WebElement selectTheOCTMonth;
	
	@FindBy(xpath = "//a[@class='mx-current-year']")
	private WebElement clickOnTheYearSelectionField;
	
	@FindBy(xpath = "//span[text()='1995']")
	private WebElement selectTheYear1995;
	
	@FindBy(xpath = "(//td[text()='30'])[2]")
	private WebElement selectTheDate;
	
	@FindBy(xpath = "(//label[@class='radio-label'])[2]")
	private WebElement selecttheFemaleRadioButton;

	@FindBy(xpath = "//button[@class='btn-login']")
	private WebElement clickOnSAVEButtonOnEditProfilePage;
	
	
	public void editPrifile() throws InterruptedException, IOException 
	{
		waitTillTheElementVisible(clickOnUploadButtonOnEditProfilePage);
		Thread.sleep(1500);
		clickOnUploadButtonOnEditProfilePage.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("D:\\Automation AutoITPath\\Jeethu.exe");
		waitTillTheElementVisible(nameFieldOnEditPage);
		Thread.sleep(3000);
		nameFieldOnEditPage.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "Jeethu Gowda");

		waitTillTheElementVisible(emailFieldOnEditPage);
		Thread.sleep(2000);
		
		Thread.sleep(500);
		clickOnDOBField.click();
		clickOnTheYearSelectionField.click();
		waitTillTheElementVisible(selectTheYear1995);
		selectTheYear1995.click();
		waitTillTheElementVisible(selectTheOCTMonth);
		selectTheOCTMonth.click();
		waitTillTheElementVisible(selectTheDate);
		selectTheDate.click();
		waitTillTheElementVisible(selecttheFemaleRadioButton);
		selecttheFemaleRadioButton.click();
		clickOnSAVEButtonOnEditProfilePage.click();
	}


}
