package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginPageNegetiveTest_WithOutEnteringEmilandPassword extends BaseTest {
	
	@Test(enabled = true)
	public void LoginPageNegetiveTestCase() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		
		homePage.clickOnLoginButton();
		loginPage.enterGuestUserEmailIDandPassword();
		loginPage.clickOncloseButton();
	}
}
