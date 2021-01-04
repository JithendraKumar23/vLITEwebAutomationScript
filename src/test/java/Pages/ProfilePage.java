package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class ProfilePage extends BasePage{


	public ProfilePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath = "//p[@class='edit-change' and text()='Edit profile']")
	private WebElement clickOnEditProfile;
	
	@FindBy(xpath = "//p[@class='edit-change' and text()='Change password']")
	private WebElement clickOnChangePassword;
	
	public void clickOnEditPrifile() throws InterruptedException 
	{
		waitTillTheElementVisible(clickOnEditProfile);
		Thread.sleep(1500);
		clickOnEditProfile.click();
	}
	
	public void clickOnChangePassword() throws InterruptedException 
	{
		waitTillTheElementVisible(clickOnChangePassword);
		Thread.sleep(1500);
		clickOnChangePassword.click();
	}
	
	
	



}
