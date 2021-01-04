package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class ListingPage extends BasePage{


	public ListingPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath = "//img[@class='close']")
	private WebElement clickOnClosebutton;
	
	public void cllickOnCloseButton() throws InterruptedException 
	{
		waitTillTheElementVisible(clickOnClosebutton);
		Thread.sleep(1500);
		clickOnClosebutton.click();
	}

}
