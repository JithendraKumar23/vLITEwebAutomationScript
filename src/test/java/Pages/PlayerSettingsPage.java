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
	
	@FindBy(xpath="(//div[@class='vlite-menu-cell-group'])[2]")
	private List<WebElement> listAllThAudioFromAudioColumn;
	
	@FindBy(xpath="(//div[@class='vlite-menu-cell-group'])[3]")
	private List<WebElement> listAllThSubTilesFromSubtileColumn;
	
	@FindBy(xpath="(//div[@class='vlite-menu-cell-group'])[1]/div[2]")
	private WebElement selectTheQualityFromTheList;
	
	@FindBy(xpath="(//div[@class='vlite-menu-cell-group'])[3]/div[2]")
	private WebElement selectTheSubtitleFromTheList;
	
	@FindBy(xpath="(//div[@class='vlite-menu-cell-group'])[3]/div[1]")
	private WebElement selectTheSubtitleFromTheListasOFF;
	
	@FindBy(xpath="//img[@class='vlite-back-arrow']")
	private WebElement clickBackFromTheSettingspage;
	
	@FindBy(xpath="//*[text()='Settings']")
	private WebElement waitingCondition;
	
	@FindBy(xpath="(//div[@class='vlite-menu-cell-group'])[2]/div[1]")
	private WebElement printTheSelectedAudioFromTheList;
	
	public void listTheQuality() throws InterruptedException {
		waitTillTheElementVisible(waitingCondition);
		
		for(WebElement getTextOfAlltheQuality : listAllTheQualityFromQualityColumn)
		{
			Thread.sleep(1000);
			System.out.println(getTextOfAlltheQuality.getText());
		}
	}
	
	public void listTheAudio() throws InterruptedException {
		waitTillTheElementVisible(waitingCondition);
		
		for(WebElement getTextOfAlltheAudio : listAllThAudioFromAudioColumn)
		{
			Thread.sleep(1000);
			System.out.println("Printing the List From Audio : " + getTextOfAlltheAudio.getText());
		}
	}
	
	public void selectTheQualityandPrintSelectedQuality() throws InterruptedException 
	{
		waitTillTheElementVisible(waitingCondition);
		Thread.sleep(1000);
		selectTheQualityFromTheList.click();
		Thread.sleep(1500);
		System.out.println("Selected Quality From The List : " + selectTheQualityFromTheList.getText() );
	}
	
	public void printSelectedAudioFromTheList() throws InterruptedException 
	{
		waitTillTheElementVisible(selectTheQualityFromTheList);
		Thread.sleep(1000);
		printTheSelectedAudioFromTheList.click();
		Thread.sleep(1500);
		System.out.println("Selected Quality From The List : " + printTheSelectedAudioFromTheList.getText() );
	}
	
	public void listOfSubstiles() throws InterruptedException {
		waitTillTheElementVisible(waitingCondition);
		
		for(WebElement getTextOfAlltheSubtiles : listAllThSubTilesFromSubtileColumn)
		{
			Thread.sleep(1000);
			System.out.println("Printing the List From Audio : " + getTextOfAlltheSubtiles.getText());
		}
	}
	
	public void selectTheSubtileandPrintSelectedQuality() throws InterruptedException 
	{
		
		if(selectTheSubtitleFromTheList.isDisplayed())
		{
		waitTillTheElementVisible(waitingCondition);
		Thread.sleep(1000);
		selectTheSubtitleFromTheList.click();
		Thread.sleep(1500);
		System.out.println("Selected Quality From The List : " + selectTheSubtitleFromTheList.getText() );
		}
		else 
		{
			System.out.println("Second Element is not Present on Subtile List");
		}
		
	}
	
	public void deselectTheSubtileandPrintSelectedQuality() throws InterruptedException 
	{
		Thread.sleep(10000);
		waitTillTheElementVisible(waitingCondition);
		Thread.sleep(1000);
		selectTheSubtitleFromTheListasOFF.click();
		Thread.sleep(1500);
		System.out.println("Selected Quality From The List : " + selectTheSubtitleFromTheListasOFF.getText() );		
	}
	
	public void clickBackFromSettingspage() throws InterruptedException 
	{
		clickBackFromTheSettingspage.click();
	}
}


