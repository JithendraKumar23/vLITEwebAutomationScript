package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class SelectQualityPage extends BasePage{


	public SelectQualityPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath="(//label[@class='radio-label'])[1]")
	private WebElement seletHDQuality;
	
	@FindBy(xpath="(//label[@class='radio-label'])[2]")
	private WebElement seletSDQuality;
	
	@FindBy(xpath="//button[@class='btn-login btn-lg-primary inverted button-click-hover']")
	private WebElement clickOnpurchaseButton;
	
	public void selectHDQuality() throws InterruptedException 
	{
		Thread.sleep(1000);
		waitTillTheElementVisible(seletHDQuality);
		seletHDQuality.click();
		clickOnpurchaseButton.click();
	}

	public void selectSDQuality() throws InterruptedException 
	{
		Thread.sleep(1000);
		waitTillTheElementVisible(seletSDQuality);
		seletSDQuality.click();
		clickOnpurchaseButton.click();
		
	}


}
