package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class PayTMPage extends BasePage{

	
	public PayTMPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath="(//div[@class='fl wauto'])[3]")
	private WebElement clickOnNETBANKINGLink;
	
	@FindBy(xpath="(//li[@class='pos-r ib vt '])[1]")
	private WebElement selectStateBankOfIndia;
	
	@FindBy(xpath="//button[@class='btn btn-primary w100 pos-r  ']")
	private WebElement clickOnPayButton;
	
	@FindBy(xpath="//button[@onclick='submitSuccessForm()']")
	private WebElement clickOnSuccessButton;
	
	@FindBy(xpath="//button[@onclick='submitFailureForm()']")
	private WebElement clickOnfailureButton;
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public void clickOnNETBankingLink() throws InterruptedException 
	{
		waitTillTheElementVisible(clickOnNETBANKINGLink);
		js.executeScript("arguments[0].scrollIntoView();", clickOnNETBANKINGLink);
		clickOnNETBANKINGLink.click();
		Thread.sleep(1500);
		selectStateBankOfIndia.click();
		waitTillTheElementVisible(clickOnPayButton);
		clickOnPayButton.click();
		waitTillTheElementVisible(clickOnSuccessButton);
		clickOnSuccessButton.click();
	}



}
