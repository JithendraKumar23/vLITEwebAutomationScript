package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class SearchPage extends BasePage{

	public SearchPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath = "//div[@class='card-title']")
	private WebElement waitCondition;
	
	@FindBy(xpath = "//img[@class='content-img content-card hover-effect content-card-land']")
	private List<WebElement> toGetTheContentCount;
	
	@FindBy(xpath = "//img[@class='content-img content-card hover-effect content-card-land']")
	private WebElement clickOnElement;
	
	@FindBy(xpath = "//img[@class='close']")
	private WebElement clickOnCloseButtonOnSearchPage;
	
	public void getTheContentCount() throws InterruptedException 
	{
		waitTillTheElementVisible(waitCondition);
		Thread.sleep(1000);
		System.out.println("Search Result :" + toGetTheContentCount.size());
	}
	
	public void openTheContentDetailPage() throws InterruptedException 
	{
		waitTillTheElementVisible(waitCondition);
		Thread.sleep(1000);
		clickOnElement.click();
	}
	
	public void clickOnCloseButtonOnSearchpage() throws InterruptedException 
	{
		waitTillTheElementVisible(clickOnCloseButtonOnSearchPage);
		Thread.sleep(1000);
		clickOnCloseButtonOnSearchPage.click();
	}

}
