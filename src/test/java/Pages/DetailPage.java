package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class DetailPage extends BasePage{


	public DetailPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(xpath = "(//button[@class='watchlist-btn'])[1]")
	private WebElement clickLikeButton;

	@FindBy(xpath = "(//button[@class='watchlist-btn'])[2]")
	private WebElement clickDisLikeButton;

	@FindBy(xpath = "(//button[@class='watchlist-btn'])[3]")
	private WebElement clickWatchListButton;

	@FindBy(xpath = "(//button[@class='watchlist-btn'])[4]")
	private WebElement clickShareButton;

	@FindBy(xpath = "(//p[@class='countLikeDislike'])[1]")
	private WebElement getTheLikeCount;	

	@FindBy(xpath = "(//p[@class='countLikeDislike'])[2]")
	private WebElement getTheDISLikeCount;	

	@FindBy(xpath = "//p[text()='Added to watchlist']")
	private WebElement printTheTextWhileAddingTheContentToWatchlist;	

	@FindBy(xpath = "//p[text()='Removed from watchlist']")
	private WebElement printTheTextWhileRemovingTheContentFromWatchlist;

	@FindBy(xpath = "//*[@class='b']")
	private WebElement checkingTheTICKButtonisSelectedORNot;

	@FindBy(xpath = "//div[@class='card-title' and text()='Live - 9']")
	private WebElement checkingTheContentNameForLIVE9;

	@FindBy(xpath = "//img[@src='data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB3aWR0aD0iNTIiIGhlaWdodD0iNTMiIHZpZXdCb3g9IjQgNCA1MiA1MyI+PGRlZnM+PHN0eWxlPi5hLC5iLC5ke2ZpbGw6bm9uZTt9LmF7c3Ryb2tlOnJnYmEoMjQ3LDI0NywyNDcsMC42KTt9LmJ7c3Ryb2tlOiNhNmE2YTY7c3Ryb2tlLWxpbmVjYXA6cm91bmQ7c3Ryb2tlLXdpZHRoOjJweDt9LmN7c3Ryb2tlOm5vbmU7fS5le2ZpbHRlcjp1cmwoI2EpO308L3N0eWxlPjxmaWx0ZXIgaWQ9ImEiIHg9IjAiIHk9IjAiIHdpZHRoPSI1MiIgaGVpZ2h0PSI1MyIgZmlsdGVyVW5pdHM9InVzZXJTcGFjZU9uVXNlIj48ZmVPZmZzZXQgaW5wdXQ9IlNvdXJjZUFscGhhIi8+PGZlR2F1c3NpYW5CbHVyIHN0ZERldmlhdGlvbj0iMS41IiByZXN1bHQ9ImIiLz48ZmVGbG9vZCBmbG9vZC1vcGFjaXR5PSIwLjEwMiIvPjxmZUNvbXBvc2l0ZSBvcGVyYXRvcj0iaW4iIGluMj0iYiIvPjxmZUNvbXBvc2l0ZSBpbj0iU291cmNlR3JhcGhpYyIvPjwvZmlsdGVyPjwvZGVmcz48ZyB0cmFuc2Zvcm09InRyYW5zbGF0ZSg0LjU1MyA0LjUpIj48ZyB0cmFuc2Zvcm09InRyYW5zbGF0ZSgwKSI+PGcgY2xhc3M9ImUiIHRyYW5zZm9ybT0ibWF0cml4KDEsIDAsIDAsIDEsIC00LjU1LCAtNC41KSI+PGcgY2xhc3M9ImEiIHRyYW5zZm9ybT0idHJhbnNsYXRlKDQuNSA0LjUpIj48ZWxsaXBzZSBjbGFzcz0iYyIgY3g9IjIxLjUiIGN5PSIyMiIgcng9IjIxLjUiIHJ5PSIyMiIvPjxlbGxpcHNlIGNsYXNzPSJkIiBjeD0iMjEuNSIgY3k9IjIyIiByeD0iMjEiIHJ5PSIyMS41Ii8+PC9nPjwvZz48ZyB0cmFuc2Zvcm09InRyYW5zbGF0ZSgxMy42MTEgMTQuMjI5KSI+PGxpbmUgY2xhc3M9ImIiIHkyPSIxNC44NzIiIHRyYW5zZm9ybT0idHJhbnNsYXRlKDcuODM5KSIvPjxsaW5lIGNsYXNzPSJiIiB5Mj0iMTUuNjc3IiB0cmFuc2Zvcm09InRyYW5zbGF0ZSgxNS42NzcgNy40MzYpIHJvdGF0ZSg5MCkiLz48L2c+PC9nPjwvZz48L3N2Zz4=']")
	private WebElement testing;
	
	@FindBy(xpath="//button[@class='btn-login']")
	private WebElement clickOnBUYorWATCHbutton;

	public void likeFunctionality() throws InterruptedException 
	{
		waitTillTheElementVisible(clickLikeButton);
		Thread.sleep(500);
		System.out.println("Get the Like Count Before Clicking the LIKE Button : " + getTheLikeCount.getText());
		clickLikeButton.click();
		Thread.sleep(1000);
		System.out.println("Get the Like Count After Clicking the LIKE Button : " + getTheLikeCount.getText());
	}


	public void dislikeFunctionality() throws InterruptedException 
	{
		waitTillTheElementVisible(clickDisLikeButton);
		Thread.sleep(500);
		System.out.println("Get the DisLike Count Before Clicking the DISLIKE Button : " + getTheDISLikeCount.getText());
		clickDisLikeButton.click();
		Thread.sleep(1000);
		System.out.println("Get the DisLike Count After Clicking the DISLIKE Button : " + getTheDISLikeCount.getText());
	}


	public void addToWatchList() throws InterruptedException 
	{	
		waitTillTheElementVisible(clickWatchListButton);
		Thread.sleep(1500);
		
		if(testing.isDisplayed())
		{
			Thread.sleep(1000);
			clickWatchListButton.click();
			Thread.sleep(1000);
			System.out.println("Print the Text after Clicking the Watchlist button :" + printTheTextWhileAddingTheContentToWatchlist.getText());
			Thread.sleep(1000);
		}
		else
		{
			Thread.sleep(2000);
			System.out.println("PRINTING MESSAGE : Content is Already added to the Watchlist");
		}
	}

	
	public void removeFromWatchList() throws InterruptedException 
	{
		waitTillTheElementVisible(clickWatchListButton);
		Thread.sleep(1000);
		if(checkingTheTICKButtonisSelectedORNot.isDisplayed())
		{
			Thread.sleep(1000);
			clickWatchListButton.click();
			waitTillTheElementVisible(printTheTextWhileRemovingTheContentFromWatchlist);
			Thread.sleep(500);
			System.out.println("Print the Text after Clicking the Watchlist button :" + printTheTextWhileRemovingTheContentFromWatchlist.getText());
		}
		else
		{
			Thread.sleep(1000);
			System.out.println("PRINTING MESSAGE : Content is Not Added to the Watchlist");
		}
	}

	
	public void printTheMessage() throws InterruptedException 
	{
		Thread.sleep(1000);
		String printingtheContentname = checkingTheContentNameForLIVE9.getText();
		System.out.println(printingtheContentname);
	}
	
	public void clickOnBUYorWATCH() throws InterruptedException 
	{
		Thread.sleep(1000);
		waitTillTheElementVisible(clickOnBUYorWATCHbutton);
		clickOnBUYorWATCHbutton.click();
	}



}
