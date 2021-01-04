package Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class HelpPage extends BasePage{


	public HelpPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath = "//h6[@class='popup-header' and text()='FAQ']")
	private WebElement waitingCondition;
	
	@FindBy(xpath = "//*[@class='faq-collapse']")
	private List<WebElement> clickOnEachRow;
	
	@FindBy(xpath = "//button[@type='button' and text()='CONTACT SUPPORT']")
	private WebElement clickOnContactSupport;
	
	@FindBy(xpath = "//button[@type='submit' and text()='CONTACT SUPPORT']")
	private WebElement clickOnContactSupporttoSubmitTheRequest;
	
	@FindBy(xpath = "(//img[@class='header-close'])[2]")
	private WebElement clickOnCloseButton;

	@FindBy(xpath = "//textarea[@class='form-textarea-inp']")
	private WebElement clickOntextField;
	
	
	public void clickOnEachFAQ() throws InterruptedException 
	{
		waitTillTheElementVisible(waitingCondition);
		Thread.sleep(2000);
		for(WebElement  test : clickOnEachRow )
		{
			waitTillTheElementVisible(waitingCondition);
			Thread.sleep(2000);
			test.click();
		}
		
	}
	
	public void sendtheQuerry() throws InterruptedException 
	{
		waitTillTheElementVisible(clickOnContactSupport);
		clickOnContactSupport.click();
		Thread.sleep(1000);
		clickOntextField.click();
		clickOntextField.sendKeys("Jeethu - Testing");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", clickOnContactSupporttoSubmitTheRequest );
		//clickOnContactSupporttoSubmitTheRequest.click();
	}
	
}
