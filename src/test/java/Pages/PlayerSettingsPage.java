package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class PlayerSettingsPage extends BasePage{

	public PlayerSettingsPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath="(//div[@class='vlite-menu-cell-group'])[1]")
	private List<WebElement> listAllTheQualityFromQualityColumn;
	
	@FindBy(xpath="(//div[@class='vlite-menu-cell-group'])[1]/div[2]")
	private WebElement selectTheQualityFromTheList;
	
	@FindBy(xpath="//*[text()='Settings']")
	private WebElement waitingCondition;
	
	public void listTheQuality() throws InterruptedException {
		waitTillTheElementVisible(waitingCondition);
		
		for(WebElement getTextOfAlltheQuality : listAllTheQualityFromQualityColumn)
		{
			Thread.sleep(1000);
			System.out.println(getTextOfAlltheQuality.getText());
		}
	}
	
	public void selectTheQualityandPrintSelectedQuality() throws InterruptedException 
	{
		waitTillTheElementVisible(selectTheQualityFromTheList);
		Thread.sleep(1000);
		selectTheQualityFromTheList.click();
		Thread.sleep(1500);
		System.out.println("Selected Quality From The List : " + selectTheQualityFromTheList.getText() );
	}

}
