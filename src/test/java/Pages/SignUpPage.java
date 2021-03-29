package Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant.BasePage;
import Constant.BaseTest;

public class SignUpPage extends BasePage {

	public SignUpPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}

	@FindBy(id="subscribername")
	private WebElement enterName;

	@FindBy(id="userEmail")
	private WebElement enterEmailID;

	@FindBy(id="password")
	private WebElement enterPassword;

	@FindBy(xpath="//div[@class='vlt-btn signup-div']")
	private WebElement clickOnSignUpButton;

	@FindBy(xpath="(//img[@class='login-img'])[2]")
	private WebElement clickOnGoogleButtonOnSignUpPage;

	@FindBy(xpath="(//img[@class='login-img'])[1]")
	private WebElement clickOnFBButtonOnSignUpPage;

	@FindBy(id="identifierId")
	private WebElement enterEmailIDFortheGoogleAccount;

	@FindBy(id="email")
	private WebElement enterEmailIDFortheFBAccount;

	@FindBy(xpath="//*[@id='identifierNext']/div/button/div[2]") 
	private WebElement clickOnNEXTButtoInGoogleSignInPopUp; //Testing

	@FindBy(xpath="(//input[@class='whsOnd zHQkBf'])[1]")
	private WebElement enterPasswordFortheGoogleAccount;

	@FindBy(id="pass")
	private WebElement enterPasswordFortheFBAccount;

	@FindBy(xpath="(//div[@class='VfPpkd-RLmnJb'])[1]")
	private WebElement clickOnNEXTButtoInEnterPasswordPage;

	@FindBy(id="loginbutton")
	private WebElement clickOnLoginButtonOnFBLoginpage;

	@FindBy(xpath="//input[@class='VfPpkd-muHVFf-bMcfAe']")
	private WebElement clickonCheckBoxToDispaythePassword;

	public void enterName(String name) throws InterruptedException
	{
		visibilityOfElement(enterName);
		enterName.sendKeys(name);
	}

	public void enterEmail(String email) throws InterruptedException
	{
		Thread.sleep(500);
		enterEmailID.sendKeys(email);
	}

	public void enterPassword(String password) throws InterruptedException
	{
		Thread.sleep(500);
		enterPassword.sendKeys(password);
	}

	public void clickOnSignUpbutton() throws InterruptedException
	{
		Thread.sleep(1000);
		clickOnSignUpButton.click();
	}

	public void googleSignUp() throws InterruptedException
	{
		Thread.sleep(1000);
		clickOnGoogleButtonOnSignUpPage.click();

		Thread.sleep(2000);

		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{
			String child_window=I1.next();

			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());
				waitTillTheElementVisible(enterEmailIDFortheGoogleAccount);
				enterEmailIDFortheGoogleAccount.sendKeys("ENTER YOU EMAIL ID");
				Thread.sleep(2500);
				clickOnNEXTButtoInGoogleSignInPopUp.click();

				Thread.sleep(2500);
				waitTillTheElementVisible(enterPasswordFortheGoogleAccount);
				enterPasswordFortheGoogleAccount.sendKeys("ENTER YOUR PASSWORD");
				clickonCheckBoxToDispaythePassword.click();
				Thread.sleep(1000);
				clickOnNEXTButtoInEnterPasswordPage.click();
				driver.switchTo().window(parent);

			}
		}

	}

	public void fbSignUp() throws InterruptedException
	{
		Thread.sleep(500);
		clickOnFBButtonOnSignUpPage.click();

		Thread.sleep(1000);

		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{
			String child_window=I1.next();

			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());
				waitTillTheElementVisible(enterEmailIDFortheFBAccount);
				enterEmailIDFortheFBAccount.sendKeys("ENTER YOUR EMAIL ID");
				Thread.sleep(1000);
				waitTillTheElementVisible(enterPasswordFortheFBAccount);
				enterPasswordFortheFBAccount.sendKeys("ENTER YOUR PASSWORD");
				Thread.sleep(500);
				clickOnLoginButtonOnFBLoginpage.click();
				driver.switchTo().window(parent);
			}
		}

	}



}
