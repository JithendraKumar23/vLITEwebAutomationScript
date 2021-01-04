package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class SubscribeOrPurchasePage extends BasePage {


	public SubscribeOrPurchasePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath="//li[@class='payment-progress active-progress']")
	private WebElement checkingTheSubscribeANDpurchaseTEXTontheInterMediatePage;
	
	@FindBy(xpath="(//img[@class='header-close'])[2]")
	private WebElement clickCloseButtonOnthePurchaseORSubscribePopUpPage;
	
	@FindBy(xpath="(//button[@class='btn-login'])[3]")
	private WebElement clickOnPurchasebutton;
	
	@FindBy(xpath="(//button[@class='btn-login'])[2]")
	private WebElement clickOnSubscribebutton;
	
	
	public void clickCloseButtonOnSubscribeORPlanPopUp() throws InterruptedException
	{
		waitTillTheElementVisible(checkingTheSubscribeANDpurchaseTEXTontheInterMediatePage);
		Thread.sleep(1000);
		System.out.println(checkingTheSubscribeANDpurchaseTEXTontheInterMediatePage.getText());
		if(checkingTheSubscribeANDpurchaseTEXTontheInterMediatePage.isDisplayed())
		{
			visibilityOfElement(clickCloseButtonOnthePurchaseORSubscribePopUpPage);
			clickCloseButtonOnthePurchaseORSubscribePopUpPage.click();
		}
		else
		{
			System.out.println("Something Went Wrong");
		}	
	}
	
	public void clickOnPurchasebutton() throws InterruptedException 
	{
		Thread.sleep(1000);
		visibilityOfElement(clickOnPurchasebutton);
		clickOnPurchasebutton.click();
	}



}
