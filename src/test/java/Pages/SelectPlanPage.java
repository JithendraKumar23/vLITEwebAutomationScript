package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class SelectPlanPage extends BasePage{


	public SelectPlanPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(xpath="//img[@class='header-close']")
	private WebElement clickCloseButtonOnthePlansPopUpPage;

	@FindBy(xpath="//*[text()='Subscribe']")
	private WebElement checkingTheSubscribeTEXTonthePlansPage;

	@FindBy(xpath="//div[@class='expiry' and text()='Start FREE TRIAL for 1 days']")
	private WebElement clickOnFREETRAILfor1DAYLink;

	@FindBy(xpath="(//button[@class='vlt-btn btn-login btn-lg-primary inverted button-click-hover'])[1]")
	private WebElement clickONSUBSCRIBEButtonOnPlanPage;

	@FindBy(xpath="(//p[@class='vlt-period'])[1]")
	private WebElement waitConditionToScrollPage;

	public void clickCloseButtonOnPlansPopUp()
	{
		waitTillTheElementVisible(checkingTheSubscribeTEXTonthePlansPage);
		if(checkingTheSubscribeTEXTonthePlansPage.isDisplayed())
		{
			visibilityOfElement(clickCloseButtonOnthePlansPopUpPage);
			clickCloseButtonOnthePlansPopUpPage.click();
		}
		else
		{
			System.out.println("Something Went Wrong");
		}	
	}

	public void checkingTheFREETrailLink() throws InterruptedException
	{
		waitTillTheElementVisible(clickOnFREETRAILfor1DAYLink);
		Thread.sleep(1000);
		if(clickOnFREETRAILfor1DAYLink.isDisplayed())
		{
			visibilityOfElement(clickOnFREETRAILfor1DAYLink);
			Thread.sleep(1000);
			clickOnFREETRAILfor1DAYLink.click();
		}
		else
		{
			System.out.println("Free Trail Link is Disabed OR Already Used By the User");
		}	
	}

	public void clickOnSubscribeButtonOnPlanPage() throws InterruptedException
	{
		Thread.sleep(1000);
		waitTillTheElementVisible(clickONSUBSCRIBEButtonOnPlanPage);
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", waitConditionToScrollPage );
		clickONSUBSCRIBEButtonOnPlanPage.click();
	}



}
