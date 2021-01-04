package Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class SideMenuPage extends BasePage{


	public SideMenuPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(xpath="//p[text()='Watchlist']")
	private WebElement clickOnWatchListButton;

	@FindBy(xpath="//li[@class='row menu-row']")
	private List<WebElement> clickAllTheListFromSideMenu;

	@FindBy(xpath="//p[text()='Home']")
	private WebElement clickOnHomebutton;

	@FindBy(xpath="//h5[@class='content-title']")
	private WebElement toPrintThePagename;

	@FindBy(xpath="//button[@class='btn-hamb lite']")
	private WebElement clickOnHambergurMenu1;
	
	public void clickOnhambergurMenu_1() throws InterruptedException
	{	
		Thread.sleep(2000);
		waitTillTheElementVisible(clickOnHambergurMenu1);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", clickOnHambergurMenu1);
		visibilityOfElement(clickOnHambergurMenu1);
		Thread.sleep(1000);
	}


	public void selectTheWatchListSection() throws InterruptedException
	{
		waitTillTheElementVisible(clickOnWatchListButton);
		Thread.sleep(500);
		clickOnWatchListButton.click();
	}

	
	Methos is Wrong - Correct IT
	public void clickAlTheListFromSideMenu() throws InterruptedException
	{
		Thread.sleep(2000);
		
		int i = clickAllTheListFromSideMenu.size();
		System.out.println(i);
		
		for(WebElement test : clickAllTheListFromSideMenu )
		{
			if(test.getText() == "Videos")
			{
					System.out.println("Test");
			}
			else
			{
				clickOnHambergurMenu1.click();
				Thread.sleep(1000);
				System.out.println(test.getText());
				waitTillTheElementVisible(clickOnHomebutton);
				Thread.sleep(2000);
				test.click();
				waitTillElementIsClickable(toPrintThePagename);
				Thread.sleep(2000);
				System.out.println("Printing the Navigated PageName : " + toPrintThePagename.getText());
				waitTillTheElementVisible(clickOnHambergurMenu1);
			}
		}
	}



}
