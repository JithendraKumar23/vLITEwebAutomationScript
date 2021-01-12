package Pages;

import java.util.ArrayList;
import java.util.List;

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
	
	@FindBy(xpath="//*[@id='car-slider-movies-item0']/div/div/div[1]/div[1]/img")
	private WebElement clickOnMovieFirstContent;
	
	@FindBy(xpath="//*[@id='car-slider-shows-item0']/div/div/div[1]/div[1]/img")
	private WebElement clickOnSeriesFirstContent;
	
	@FindBy(xpath="//*[@id='car-slider-shows-item1']/div/div[1]/div/div[1]/img")
	private WebElement clickOnSeriesSecondContent;
	
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
	
	@FindBy(xpath="//*[text()='Episodes']")
	private WebElement clickOnEpisodeSection;
	
	@FindBy(xpath="//*[text()='Trailers']")
	private WebElement clickOnTrailerSection;
	
	@FindBy(xpath="//*[text()='Related']")
	private WebElement clickOnRelatedSection;
	
	@FindBy(xpath="(//img[@class='landscape-div'])[1]")
	private WebElement selectTheFirstEpisode;
	
	@FindBy(xpath="//*[@id='car-slider-Rhymesc-item0']/div/div[1]/img[2]")
	private WebElement clickOnPLAYIcon;
	
	@FindBy(xpath="//*[@id='car-slider-Rhymesc-item0']")
	private WebElement waitingConditionForEpisode;
	
	@FindBy(xpath="(//div[@class='content-card landscape-div'])[1]")
	private WebElement selectTheFirstTrailerFromMovies;
	
	@FindBy(xpath="//input[@class='search']")
	private WebElement clickOnSearchButton;
	
	@FindBy(xpath="//img[@alt='search-ico']")
	private WebElement clickOnSearchOnField;
	
	@FindBy(xpath="//img[@alt='notif-btn-ico']")
	private WebElement clickOnNotificationOnField;
	
	@FindBy(xpath="//img[@alt='next']")
	private WebElement clickOnNextOnRelatedSection;
	
	@FindBy(xpath="//img[@alt='prev']")
	private WebElement clickOnPreviousOnRelatedSection;
	
	@FindBy(xpath="(//img[@alt='Slider'])[2]")
	private WebElement selecetTheSecondContentFromtheRelatedList;
	
	public void clickOnLoginButton() throws InterruptedException
	{
		Thread.sleep(1000);
		visibilityOfElement(loginButton);
		Thread.sleep(500);
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
	
	
	public void clickOnBUYButtonforTheFirstSeriesContent() throws InterruptedException
	{	
		Thread.sleep(1500);
		visibilityOfElement(clickOnSeriesFirstContent);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", clickOnSeriesFirstContent );
		Thread.sleep(1500);
		clickOnSeriesFirstContent.click();
		Thread.sleep(500);
		System.out.println("Checking the Button TEXT - Before Purchase : " + clickOnBUYbutton.getText());
		visibilityOfElement(clickOnBUYbutton);
		clickOnBUYbutton.click();
	}
	
	public void selectTheFirstContentandOfMovieAndPlayTrailer() throws InterruptedException
	{	
		Thread.sleep(1500);
		visibilityOfElement(clickOnMovieFirstContent);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", clickOnMovieFirstContent );
		Thread.sleep(1500);
		clickOnMovieFirstContent.click();
		waitTillTheElementVisible(clickOnTrailerSection);
		clickOnTrailerSection.click();
		waitTillTheElementVisible(selectTheFirstTrailerFromMovies);
		Thread.sleep(2000);
		selectTheFirstTrailerFromMovies.click();	
	}
	
	public void selectTheFirstContentFromMoviesandCheckTheRelatedSectionFlow() throws InterruptedException
	{	
		Thread.sleep(1500);
		visibilityOfElement(clickOnMovieFirstContent);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", clickOnMovieFirstContent );
		Thread.sleep(1500);
		clickOnMovieFirstContent.click();
		waitTillTheElementVisible(clickOnRelatedSection);
		clickOnRelatedSection.click();
		waitTillTheElementVisible(clickOnNextOnRelatedSection);
		Thread.sleep(2000);
		
		clickOnNextOnRelatedSection.click();
		Thread.sleep(500);
		clickOnNextOnRelatedSection.click();
		Thread.sleep(500);
		clickOnNextOnRelatedSection.click();
		
		Thread.sleep(1000);
		clickOnPreviousOnRelatedSection.click();
		Thread.sleep(1000);
		waitTillTheElementVisible(selecetTheSecondContentFromtheRelatedList);
		selecetTheSecondContentFromtheRelatedList.click();
	}
	
	public void selectTheEpisodeFromTheRelatedSection() throws InterruptedException
	{	
		Thread.sleep(1500);
		visibilityOfElement(clickOnSeriesSecondContent);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", clickOnSeriesSecondContent );
		Thread.sleep(1500);
		clickOnSeriesSecondContent.click();
		waitTillTheElementVisible(clickOnEpisodeSection);
		clickOnEpisodeSection.click();
		Thread.sleep(1000);
		waitTillTheElementVisible(selectTheFirstEpisode);
		selectTheFirstEpisode.click();	
	}
	
	public void playEpisode() throws InterruptedException 
	{
		waitTillTheElementVisible(clickOnEpisodeSection);
		Thread.sleep(500);
		clickOnEpisodeSection.click();
		waitTillTheElementVisible(waitingConditionForEpisode);
		Thread.sleep(3000);
		clickOnPLAYIcon.click();
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
		Thread.sleep(1500);
		System.out.println("Checking the Button TEXT - After Purchase : " + clickOnBUYbutton.getText());
		clickCloseButtonOntheDetailPage.click();
	}
	
	public void checkingtheButtonTextOnHomePageforSeriesPurchasedContent() throws InterruptedException
	{	
		Thread.sleep(1500);
		visibilityOfElement(clickOnSeriesSecondContent);
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", clickOnSeriesSecondContent );
		Thread.sleep(1500);
		clickOnSeriesSecondContent.click();
		System.out.println("Checking the Button TEXT - After Purchase : " + clickOnBUYbutton.getText());
		clickOnSeriesSecondContent.click();
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
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", clickOnHambergurMenu );
		Thread.sleep(1500);
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
	
	public void clickOnSearchButton() throws InterruptedException
	{	
		waitTillTheElementVisible(clickOnSearchButton);
		Thread.sleep(500);
		clickOnSearchButton.click();
		Thread.sleep(500);
		clickOnSearchButton.sendKeys("Live");
		Thread.sleep(500);
		clickOnSearchOnField.click();
	}
	
	public void clickCloseButtononDetailPage() throws InterruptedException
	{	
		Thread.sleep(500);
		waitTillTheElementVisible(clickCloseButtonOntheDetailPage);
		Thread.sleep(500);
		clickCloseButtonOntheDetailPage.click();
	}
	
	public void clickOnNotification() throws InterruptedException
	{	
		Thread.sleep(500);
		waitTillTheElementVisible(clickOnNotificationOnField);
		Thread.sleep(500);
		clickOnNotificationOnField.click();
		Thread.sleep(2000);
		clickOnNotificationOnField.click();
	}
	
	
	
	// Continue Watching Test - InComplete Test
	
	@FindBy(xpath = "//div[@class='close-div']")
	private List<WebElement> list1;
	
	@FindBy(xpath = "//div[@class='close-div']")
	private WebElement element;
	
	public void ssssss() throws InterruptedException
	{	
		//waitTillTheElementVisible(element);
		Thread.sleep(1000);
		
		System.out.println(element.isDisplayed());
		
		if(true)
		{
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", element );
		
		for(int i = 0 ; i<= list1.size() ; i++)
		{
			if(element.isDisplayed())
			{
				element.click();
			}
			else
			{
				System.out.println("Test");
			}
			System.out.println(i);
		}

		}
		
		
		
	}


}
