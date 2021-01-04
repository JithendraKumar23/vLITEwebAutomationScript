package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class ProfileMenuPage extends BasePage{


	public ProfileMenuPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath="//p[@class='meta-link logout-label']")
	private WebElement clickOnLogoutbutton;
	
	@FindBy(xpath="//p[@class='meta-link' and text()='Profile']")
	private WebElement clickOnProfileLink;
	
	@FindBy(xpath="//div[@class='login-signup-button vlt-btn']")
	private WebElement clickOnSubscribeButton;
	
	public void clickOnProfileButton() throws InterruptedException
	{
		visibilityOfElement(clickOnProfileLink);
		Thread.sleep(1500);
		clickOnProfileLink.click();
	}
	
	public void clickOnLogoutButton() throws InterruptedException
	{
		visibilityOfElement(clickOnLogoutbutton);
		Thread.sleep(1500);
		clickOnLogoutbutton.click();
	}
	
	public void clickOnSUBSCRIBEbutton() throws InterruptedException
	{
		waitTillTheElementVisible(clickOnSubscribeButton);
		Thread.sleep(1000);
		if(clickOnSubscribeButton.isDisplayed())
		{
			clickOnSubscribeButton.click();
		}
		else
		{
			System.out.println("SUBSCRIBE Button is Not Displaying Because - SUBSCRIPTION FLAG is FALSE");
		}
	}



}
