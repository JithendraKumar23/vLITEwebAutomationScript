package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class SuccessPopUp extends BasePage{

	public SuccessPopUp(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(xpath="//p[@class='success-title']")
	private WebElement successMessagePrint;
	
	@FindBy(xpath="//button[@class='btn-login']")
	private WebElement doneButtonOnSuccessPopup;
	
	@FindBy(xpath="//img[@class='header-close']")
	private WebElement clickOnCloseButtonOnSuccessPopup;
	
	public void successMessageToPrint() throws InterruptedException
	{
		waitTillTheElementVisible(successMessagePrint);
		Thread.sleep(1000);
		System.out.println("Printing the Message From the Success Page : " + successMessagePrint.getText());
	}
	
	public void clickOnDoneButtonOnSuccessPopUp() throws InterruptedException
	{
		waitTillTheElementVisible(doneButtonOnSuccessPopup);
		Thread.sleep(500);
		doneButtonOnSuccessPopup.click();
	}
	
	public void clickOnCloseButtonOnSuccessPopUp() throws InterruptedException
	{
		waitTillTheElementVisible(clickOnCloseButtonOnSuccessPopup);
		Thread.sleep(500);
		clickOnCloseButtonOnSuccessPopup.click();
	}
	
	


}
