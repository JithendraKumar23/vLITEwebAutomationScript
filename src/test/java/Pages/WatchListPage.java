package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class WatchListPage extends BasePage{


	public WatchListPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(xpath="//div[@class='card-title']")
    public List<WebElement> alList;
	
	@FindBy(xpath="(//div[@class='vlite-content-item-3 align-landscape '])[1]")
    public WebElement waitingCondition;
	
	@FindBy(xpath="//img[@class='close']")
    public WebElement clickOnCloseButton;

	public void comparingOnTheTitleANDPrintingTheMessageOnWatchListPage() throws InterruptedException
	{

	waitTillTheElementVisible(waitingCondition);
	Thread.sleep(1000);
	for( WebElement product : alList)
	{	
		waitTillTheElementVisible(waitingCondition);
		Thread.sleep(1000);
		System.out.println("Printing all the Content From the WatchList Page : " + product.getText());
		
		waitTillTheElementVisible(waitingCondition);
		Thread.sleep(1000);
		System.out.println("Comparing the List with WatchList Added Content - " + product.getText().equals("Live - 9"));
		
		if(product.getText().equals("Live - 9") == true)
		{
			waitTillTheElementVisible(waitingCondition);
			Thread.sleep(2000);
			System.out.println("CONTENT IS ADDED TO THE WATCHLIST SECTION");
		}
		else
		{
			waitTillTheElementVisible(waitingCondition);
			Thread.sleep(2000);
			System.out.println("Favourited and Current Current Compared Content is Defferent");
			Thread.sleep(1000);
			System.out.println("-- -- ");
		}
	}
	
	}
	
	public void afterRemovingtheContentFromDetailpageComparingOnTheTitleANDPrintingTheMessageOnWatchListPage() throws InterruptedException
	{

	waitTillTheElementVisible(waitingCondition);
	Thread.sleep(1000);
	for( WebElement product : alList)
	{	
		waitTillTheElementVisible(waitingCondition);
		Thread.sleep(1000);
		System.out.println("Printing all the Content From the WatchList Page : " + product.getText());
		
		waitTillTheElementVisible(waitingCondition);
		Thread.sleep(1000);
		System.out.println("Comparing the List with Removed WatchList Content - " + product.getText().equals("Live - 9"));
		
		if(product.getText().equals("Live - 9") == true)
		{
			waitTillTheElementVisible(waitingCondition);
			Thread.sleep(2000);
			System.out.println("CONTENT IS NOT REMOVED FROM THE DETAIL PAGE");
		}
		else
		{
			waitTillTheElementVisible(waitingCondition);
			Thread.sleep(2000);
			System.out.println("Removed and Current Current Compared Content is Defferent");
			Thread.sleep(1000);
			System.out.println("-- -- ");
		}
	}
	
	}
	
	public void clickOnCloseButton() 
	{
		waitTillTheElementVisible(waitingCondition);
		clickOnCloseButton.click();
	}
	


}
