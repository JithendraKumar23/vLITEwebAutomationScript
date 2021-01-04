package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class PaymentPage extends BasePage{


	public PaymentPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath="//img[@alt='paytm']")
	private WebElement clickOnPAYTMlink;
	
	
	public void clickOnPaytm() throws InterruptedException 
	{
		waitTillTheElementVisible(clickOnPAYTMlink);
		Thread.sleep(2500);
		clickOnPAYTMlink.click();
	}



}
