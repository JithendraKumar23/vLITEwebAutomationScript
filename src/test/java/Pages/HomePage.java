package Pages;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class HomePage extends BasePage {


	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath="//button[@class='btn-hamb lite']")
	private WebElement clickOnHambergurMenu;
	
	@FindBy(xpath="//div[@class='login-signup-button vlt-btn']")
	private WebElement loginButton;
	
	@FindBy(xpath="//img[@class='img-responsive']")
	private WebElement clickOnProfileMenu;
	
	@FindBy(xpath="//button[@class='btn-login']")
	private WebElement clickOnBUYbutton;
	
	@FindBy(xpath="//*[@id='car-slider-live-tv-item0']/div/div/div[1]/div[1]/img")
	private WebElement clickOnLiveFirstContent;
	
	@FindBy(xpath="//*[@id='car-slider-videos-item0']/div/div/div[1]/div[1]/img")
	private WebElement clickOnVidoesFirstContent_freeContent;
	
	@FindBy(xpath="//img[@class='header-close']")
	private WebElement clickCloseButtonOntheDetailPage;
	
	@FindBy(xpath="(//button[@class='watchlist-btn'])[1]")
	private WebElement clickOnLIKEbutton;
	
	@FindBy(xpath="(//button[@class='watchlist-btn'])[2]")
	private WebElement clickOnDISLIKEbutton;
	
	@FindBy(xpath="(//button[@class='watchlist-btn'])[3]")
	private WebElement clickOnWATCHbutton;
	
	@FindBy(xpath="(//button[@class='watchlist-btn'])[4]")
	private WebElement clickOnSHAREbutton;
	
	@FindBy(xpath="//div[@class='footertext' and text()='ABOUT']")
	private WebElement clickOnAboutButton;
	
	@FindBy(xpath="//div[@class='footertext' and text()='HELP']")
	private WebElement clickOnHelpButton;
	
	@FindBy(xpath="//a[text()='TERMS OF USE']")
	private WebElement clickOntermsOFUse;
	
	@FindBy(xpath="//a[text()='PRIVACY POLICY']")
	private WebElement clickOnPrivacyPolicy;
	
	
	
	public void clickOnLoginButton() throws InterruptedException
	{
		visibilityOfElement(loginButton);
		loginButton.click();
	}
	
	public void clickOnBUYButton() throws InterruptedException
	{	
		Thread.sleep(1500);
		visibilityOfElement(clickOnLiveFirstContent);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", clickOnLiveFirstContent );
		Thread.sleep(1500);
		clickOnLiveFirstContent.click();
		Thread.sleep(500);
		System.out.println("Checking the Button TEXT - Before Purchase : " + clickOnBUYbutton.getText());
		visibilityOfElement(clickOnBUYbutton);
		clickOnBUYbutton.click();
	}
	
	public void scollTheLIVEContentDetailPageAndOpenTheDetailPage() throws InterruptedException
	{	
		Thread.sleep(1500);
		visibilityOfElement(clickOnLiveFirstContent);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", clickOnLiveFirstContent );
		Thread.sleep(1500);
		clickOnLiveFirstContent.click();
	}
	
	public void checkingtheButtonTextOnHomePage() throws InterruptedException
	{	
		Thread.sleep(1500);
		visibilityOfElement(clickOnLiveFirstContent);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", clickOnLiveFirstContent );
		Thread.sleep(1500);
		clickOnLiveFirstContent.click();
		System.out.println("Checking the Button TEXT - After Purchase : " + clickOnBUYbutton.getText());
		clickCloseButtonOntheDetailPage.click();
	}
	
	public void clickOnLIKEButton() throws InterruptedException
	{	
		Thread.sleep(1500);
		visibilityOfElement(clickOnLiveFirstContent);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", clickOnLiveFirstContent );
		Thread.sleep(1500);
		clickOnLiveFirstContent.click();
		Thread.sleep(500);
		System.out.println("Checking the Button TEXT - Before Purchase : " + clickOnBUYbutton.getText());
		visibilityOfElement(clickOnLIKEbutton);
		clickOnLIKEbutton.click();
	}
	
	public void clickOnProfileMenu() throws InterruptedException
	{	
		Thread.sleep(2500);
		visibilityOfElement(clickOnProfileMenu);
		clickOnProfileMenu.click();
	}
	
	public void checkingtheLoginButtonOntheHomepage()
	{	
		visibilityOfElement(loginButton);
		loginButton.isDisplayed();
		System.out.println("Logout Success!!!!");
	}
	
	public void clickOnhambergurMenu() throws InterruptedException
	{	
		Thread.sleep(5000);
		waitTillTheElementVisible(clickOnHambergurMenu);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", clickOnHambergurMenu );
		visibilityOfElement(clickOnHambergurMenu);
		Thread.sleep(1000);
		clickOnHambergurMenu.click();
	}
	
	public void clickOnAboutButton() throws InterruptedException
	{	
		Thread.sleep(5000);
		visibilityOfElement(clickOnAboutButton);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", clickOnAboutButton);
		Thread.sleep(1500);
		visibilityOfElement(clickOnAboutButton);
		clickOnAboutButton.click();
	}
	
	public void clickOnHelpButton() throws InterruptedException
	{	
		Thread.sleep(5000);
		visibilityOfElement(clickOnHelpButton);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", clickOnHelpButton);
		Thread.sleep(1500);
		visibilityOfElement(clickOnHelpButton);
		clickOnHelpButton.click();
	}
	
	public void clickOnTermsOfuse() throws InterruptedException
	{	
		Thread.sleep(5000);
		visibilityOfElement(clickOntermsOFUse);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", clickOntermsOFUse);
		Thread.sleep(1500);
		visibilityOfElement(clickOntermsOFUse);
		clickOntermsOFUse.click();
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    Thread.sleep(2000);
	    System.out.println("Printing the URL of the page : " + driver.getCurrentUrl());
	    System.out.println("Printing the Title of the page : " + driver.getTitle());
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));
	}
	
	public void clickOnPrivacyPolicy() throws InterruptedException
	{	
		Thread.sleep(5000);
		visibilityOfElement(clickOnPrivacyPolicy);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", clickOnPrivacyPolicy);
		Thread.sleep(1500);
		visibilityOfElement(clickOnPrivacyPolicy);
		clickOnPrivacyPolicy.click();
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    Thread.sleep(2000);
	    System.out.println("Printing the URL of the page : " + driver.getCurrentUrl());
	    System.out.println("Printing the Title of the page : " + driver.getTitle());
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));
	}
	
	public void clickOnBUYButton_forFreeContet_Vidoes() throws InterruptedException
	{	
		Thread.sleep(1500);
		visibilityOfElement(clickOnVidoesFirstContent_freeContent);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", clickOnVidoesFirstContent_freeContent );
		Thread.sleep(1500);
		clickOnVidoesFirstContent_freeContent.click();
		waitTillTheElementVisible(clickOnBUYbutton);
		Thread.sleep(1500);
		System.out.println("Checking the Button TEXT - Before Purchase : " + clickOnBUYbutton.getText());
		visibilityOfElement(clickOnBUYbutton);
		clickOnBUYbutton.click();
	}
	
	public void getTheTextOftheButtonfromDetailPage() throws InterruptedException
	{	
		waitTillTheElementVisible(clickOnBUYbutton);
		Thread.sleep(2000);
		System.out.println("Checking the Button TEXT - After Purchase : " + clickOnBUYbutton.getText());
		
	}
	
	


}
