package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class ChangePasswordPage extends BasePage{

	

	
	public ChangePasswordPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(id = "old-password")
	private WebElement oldPassword;
	
	@FindBy(id = "new-password")
	private WebElement newPassword;
	
	@FindBy(xpath = "//img[@class='header-close']")
	private WebElement clickOnCloseButtonOnChnagePasswordPopUp;
	
	@FindBy(xpath = "//button[@class='btn-login']")
	private WebElement clickOnChangeButton;
	
	@FindBy(xpath = "(//p[@class='login-error-message'])[2]")
	private WebElement getTheErrorMessageWithTheSamePassword;
	
	public void enterOldPassword()
	{
	waitTillTheElementVisible(oldPassword);
	oldPassword.sendKeys("Test@123");
	}
	
	public void enterNewPassword()
	{
	waitTillTheElementVisible(newPassword);
	oldPassword.sendKeys("Test@1234");
	}
	
	public void clickOnCloseButtonOnChangePasswordPopUp() throws InterruptedException
	{
	waitTillTheElementVisible(clickOnCloseButtonOnChnagePasswordPopUp);
	Thread.sleep(500);
	clickOnCloseButtonOnChnagePasswordPopUp.click();
	}
	
	public void clickOnChanageButtonOnChangePasswordPopUp()
	{
	waitTillTheElementVisible(clickOnChangeButton);
	clickOnChangeButton.click();
	}
	
	public void toPrintTheErrorMessage() throws InterruptedException
	{
	waitTillTheElementVisible(getTheErrorMessageWithTheSamePassword);
	Thread.sleep(500);
	System.out.println("Printing the Error Message While Entering the OLD PASSWORD in NEW PASSWORD Field : " + getTheErrorMessageWithTheSamePassword.getText());
	}
	
	public void changePassword() throws InterruptedException
	{
	Thread.sleep(1500);
	waitTillTheElementVisible(oldPassword);
	oldPassword.sendKeys("Test@123");
	Thread.sleep(500);
	waitTillTheElementVisible(newPassword);
	newPassword.sendKeys("Test@123");
	waitTillTheElementVisible(clickOnChangeButton);
	Thread.sleep(500);
	clickOnChangeButton.click();
	}


}
