package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class PlayerPage extends BasePage {


	public PlayerPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(xpath = "//p[@class='content-title']")
	private WebElement toPrintTheContentTilte;
	
	@FindBy(id = "vlive-play-pause-btn")
	private WebElement ClickPLAYButton;
	
	@FindBy(id = "vlive-play-pause-btn")
	private WebElement ClickPAUSEButton;
	
	@FindBy(id = "vlive-rewind-btn")
	private WebElement ClickBACKWARDButton;
	
	@FindBy(id = "vlive-forward-btn")
	private WebElement ClickFORWARDButton;
	
	@FindBy(xpath= "//div[@class='vlite-time-container']//span[1]")
	private WebElement getTheTotalDurationOftheContent;
	
	@FindBy(xpath= "//div[@class='vlite-time-container']//span[2]")
	private WebElement getTheCurrentDurationOftheContent;
	
	@FindBy(xpath= "//img[@class='vlite-settings-icon']")
	private WebElement clickOnTheQualityButton;
	
	@FindBy(xpath= "//img[@class='vlite-fullscreen-primary']")
	private WebElement toExpandTheScreen;
	
	@FindBy(xpath= "//img[@class='vlite-fullscreen-secondary']")
	private WebElement forTheNormalTheScreen;
	
	@FindBy(xpath= "(//img[@class='header-close'])[2]")
	private WebElement clickOnBackbutton;
	
	
	public void getTheContentTitle() throws InterruptedException 
	{
		waitTillTheElementVisible(toPrintTheContentTilte);
		Thread.sleep(2500);
		System.out.println("Content Title : " + toPrintTheContentTilte.getText() );
	}
	
	public void pauseContent() throws InterruptedException 
	{
		Thread.sleep(5000);
		waitTillTheElementVisible(ClickPAUSEButton);
		Thread.sleep(2000);
		ClickPAUSEButton.click();
	}
	
	public void playContent() throws InterruptedException 
	{
		waitTillTheElementVisible(ClickPLAYButton);
		Thread.sleep(3000);
		ClickPLAYButton.click();
	}
	
	public void forwardContent() throws InterruptedException 
	{
		waitTillTheElementVisible(ClickFORWARDButton);
		Thread.sleep(2000);
		ClickFORWARDButton.click();
		waitTillTheElementVisible(ClickFORWARDButton);
		Thread.sleep(1000);
		ClickFORWARDButton.click();
		waitTillTheElementVisible(ClickFORWARDButton);
		Thread.sleep(500);
		ClickFORWARDButton.click();
		waitTillTheElementVisible(ClickFORWARDButton);
		Thread.sleep(250);
		ClickFORWARDButton.click();
	}
	
	public void backwardContent() throws InterruptedException 
	{
		waitTillTheElementVisible(ClickBACKWARDButton);
		Thread.sleep(2000);
		ClickBACKWARDButton.click();
		waitTillTheElementVisible(ClickBACKWARDButton);
		Thread.sleep(1000);
		ClickBACKWARDButton.click();
	}
	
	public void explandTheContentScreen() throws InterruptedException 
	{
		waitTillTheElementVisible(toExpandTheScreen);
		Thread.sleep(2000);
		toExpandTheScreen.click();
	}
	
	public void minimizeTheScreen() throws InterruptedException 
	{
		waitTillTheElementVisible(forTheNormalTheScreen);
		Thread.sleep(2000);
		forTheNormalTheScreen.click();
	}
	
	public void clickBackButtonFromPlayerPage() throws InterruptedException 
	{
		waitTillTheElementVisible(clickOnBackbutton);
		Thread.sleep(1000);
		clickOnBackbutton.click();
	}
	
	public void clickOnQualityButton() throws InterruptedException 
	{
		waitTillTheElementVisible(clickOnTheQualityButton);
		Thread.sleep(2000);
		clickOnTheQualityButton.click();
	}
	
	public void printTotlaDurationOfTheContent() throws InterruptedException 
	{
		waitTillTheElementVisible(getTheTotalDurationOftheContent);
		Thread.sleep(500);
		System.out.println("Printing the Total Duration of the Content :" + getTheTotalDurationOftheContent.getText());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	public void seek() 
	{
	
		  //Locating seekbar using resource id
        WebElement seek_bar=driver.findElement(By.id("seek_bar"));
        // get start co-ordinate of seekbar
        int start=seek_bar.getLocation().getX();
        //Get width of seekbar
        int end=seek_bar.getSize().getWidth();
        //get location of seekbar vertically
        int y=seek_bar.getLocation().getY();

    // Select till which position you want to move the seekbar
  //  TouchAction action=new TouchAction(driver);
    TouchActions action = new TouchActions(driver);

    //Move it will the end
    action.press(start,y).moveTo(end,y).release().perform();
    //Move it 40%
    int moveTo=(int)(end*0.4);
    action.press(start,y).moveTo(moveTo,y).release().perform();
		
	}*/
	
	
	



}
