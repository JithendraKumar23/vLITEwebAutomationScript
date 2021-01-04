package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class ForgotPasswordPage extends BasePage {


	public ForgotPasswordPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(id="userEmail")
	private WebElement enterEmailID;
	
	@FindBy(xpath="//button[@class='btn-login']")
	private WebElement clickOnSENDButton;
	
	@FindBy(xpath="//h5[text()='Your password is successfully reseted']")
	private WebElement verifyigtheSuccessMessage;
	
	@FindBy(xpath="//img[@alt='closes']")
	private WebElement clickOnCloseButton;
	
	@FindBy(xpath="//p[@class='login-error-message']")
	private WebElement printingtheErrorMessageWithOutEnteringtheEmailID;
	
	@FindBy(xpath="//p[text()='No Active Subscriber Found']")
	private WebElement printingtheErrorMessagefortheGuestUserEmailID;
	
	public void forgotPassword() throws InterruptedException 
	{
		waitTillTheElementVisible(enterEmailID);
		enterEmailID.click();
		Thread.sleep(500);
		enterEmailID.sendKeys("sub@mob.com");
		Thread.sleep(1000);
		clickOnSENDButton.click();
		
		waitTillTheElementVisible(verifyigtheSuccessMessage);
		System.out.println("Printing the Message From the Success page " + verifyigtheSuccessMessage.getText());
		
		Thread.sleep(1000);
		clickOnCloseButton.click();
	}
	
	public void forgotPassword_withoutEnteringtheEmailPrintingtheErrorMessage() throws InterruptedException 
	{
		waitTillTheElementVisible(enterEmailID);
		Thread.sleep(500);
		clickOnSENDButton.click();
		
		System.out.println("Printing the Error Message WithOut Entering the Email ID : " + printingtheErrorMessageWithOutEnteringtheEmailID.getText());
	}
	
	public void forgotPassword_withINVALIDorGuestUserEmailID() throws InterruptedException 
	{
		waitTillTheElementVisible(enterEmailID);
		Thread.sleep(2000);
		enterEmailID.sendKeys("InvalidEmailID@gamil.com");
		clickOnSENDButton.click();
		
		Thread.sleep(1000);
		System.out.println("Printing the Error Message WithOut Entering the Email ID : " + printingtheErrorMessagefortheGuestUserEmailID.getText());
		
		Thread.sleep(1000);
		clickOnCloseButton.click();
	}
 


}
