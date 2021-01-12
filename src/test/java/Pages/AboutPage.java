package Pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class AboutPage extends BasePage {

	


	public AboutPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(xpath="(//img[@alt='facebook logo'])[2]")
    public WebElement clickOnFB;
	
	@FindBy(xpath="(//img[@alt='pinterest logo'])[2]")
    public WebElement clickOnpinterestlogo;
	
	@FindBy(xpath="(//img[@alt='twitter logo'])[2]")
    public WebElement clickOntwitterlogo;
	
	@FindBy(xpath="(//img[@alt='instagram logo'])[2]")
    public WebElement clickOninstagramlogo;
	
	@FindBy(xpath="//*[text()='Follow us on']")
    public WebElement waitingcondition;
	
	@FindBy(xpath="//img[@class='header-close']")
    public WebElement clickOnCloseButton;
	 
	
	public void switchtabforFB() throws InterruptedException 
	{
		waitTillTheElementVisible(clickOnFB);
		clickOnFB.click();
	    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    Thread.sleep(2000);
	    System.out.println("Printing the URL of the page : " + driver.getCurrentUrl());
	    System.out.println("Printing the Title of the page : " + driver.getTitle());
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));
	}
	
	public void switchtabforPinterest() throws InterruptedException 
	{
		waitTillTheElementVisible(waitingcondition);
		clickOnpinterestlogo.click();
	    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    Thread.sleep(2000);
	    System.out.println("Printing the URL of the page : " + driver.getCurrentUrl());
	    System.out.println("Printing the Title of the page : " + driver.getTitle());
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));
	}
	
	public void switchtabforTwitter() throws InterruptedException 
	{
		waitTillTheElementVisible(waitingcondition);
		clickOntwitterlogo.click();
	    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    Thread.sleep(2000);
	    System.out.println("Printing the URL of the page : " + driver.getCurrentUrl());
	    System.out.println("Printing the Title of the page : " + driver.getTitle());
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));
	}
	     
	public void switchtabforInstagram() throws InterruptedException 
	{
		waitTillTheElementVisible(waitingcondition);
		clickOninstagramlogo.click();
	    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    Thread.sleep(2000);
	    System.out.println("Printing the URL of the page : " + driver.getCurrentUrl());
	    System.out.println("Printing the Title of the page : " + driver.getTitle());
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));
	}
	
	public void closeAboutPage() throws InterruptedException 
	{
		Thread.sleep(500);
		waitTillTheElementVisible(waitingcondition);
		Thread.sleep(1000);
		clickOnCloseButton.click();
	}


}
