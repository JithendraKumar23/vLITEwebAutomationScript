package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class LoginPage extends BasePage {


	public LoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath="//button[@class='signup']")
	private WebElement signupButton;
	
	@FindBy(id="userEmail")
	private WebElement enterEmailID;
	
	@FindBy(id="password")
	private WebElement enterPassword;
	
	@FindBy(xpath="//button[@class='btn-login']")
	private WebElement clickOnLoginButton;
	
	@FindBy(xpath="//span[text()='Forgot Password?']")
	private WebElement clickingOnForgotPasswordLink;
	
	@FindBy(xpath="//div[@class='form-error']")
	private WebElement errorMessageFortheGuestUserEmailID;
	
	@FindBy(xpath="//p[text()='Please enter Email ID']")
	private WebElement errorMessagewithoutEnteringtheEmailIDandPassword;
	
	@FindBy(xpath="//p[text()='Please enter Password']")
	private WebElement errorMessagewithoutEnteringthePassword;
	
	@FindBy(xpath="//img[@alt='closes']")
	private WebElement toClosetheLoginPopUp;
	
	public void clickOnSignUpButton()
	{
		visibilityOfElement(signupButton);
		signupButton.click();
	}
	
	public void enterEmailID(String emailID) throws InterruptedException
	{
		Thread.sleep(500);
		waitTillTheElementVisible(enterEmailID);
		enterEmailID.sendKeys(emailID);
	}
	
	public void enterPassword(String password) throws InterruptedException
	{
		Thread.sleep(500);
		enterPassword.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		visibilityOfElement(enterEmailID);
		clickOnLoginButton.click();
	}
	
	public void clickOnForgotPasswordLink() throws InterruptedException
	{
		visibilityOfElement(clickingOnForgotPasswordLink);
		Thread.sleep(500);
		clickingOnForgotPasswordLink.click();
	}
	
	public void enterGuestUserEmailIDandPassword() throws InterruptedException
	{
		Thread.sleep(500);
		waitTillTheElementVisible(enterEmailID);
		enterEmailID.click();
		Thread.sleep(500);
		enterEmailID.sendKeys("xyz@xyz.xyz");
		Thread.sleep(500);
		enterPassword.click();
		enterPassword.sendKeys("Test@123");
		Thread.sleep(1000);
		clickOnLoginButton.click();
		
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", errorMessageFortheGuestUserEmailID);
		
		Thread.sleep(1000);
		System.out.println("Printing the Error Message For the Guest User EmailID on Loginpage : " + errorMessageFortheGuestUserEmailID.getText());
		
		Thread.sleep(1000);
		toClosetheLoginPopUp.click();
		
	}
	
	public void loginNegetiveCase_withoutEnteringtheEmailIDandPassword() throws InterruptedException
	{
		
		Thread.sleep(500);
		waitTillTheElementVisible(clickOnLoginButton);
		clickOnLoginButton.click();
		
		Thread.sleep(1000);
		System.out.println("Printing the Error Message For the Guest User EmailID on Loginpage : " + errorMessagewithoutEnteringtheEmailIDandPassword.getText());
		
	}
	
	public void loginNegetiveCase_withoutEnteringthePassword() throws InterruptedException
	{
		Thread.sleep(500);
		waitTillTheElementVisible(enterEmailID);
		enterEmailID.click();
		Thread.sleep(500);
		enterEmailID.sendKeys("xyz@xyz.xyz");
		Thread.sleep(500);
		clickOnLoginButton.click();
		
		Thread.sleep(1000);
		System.out.println("Printing the Error Message For the Guest User EmailID on Loginpage : " + errorMessagewithoutEnteringthePassword.getText());	
	}
	
	public void clickOncloseButton() throws InterruptedException
	{
		visibilityOfElement(toClosetheLoginPopUp);
		Thread.sleep(500);
		toClosetheLoginPopUp.click();
	}


}
