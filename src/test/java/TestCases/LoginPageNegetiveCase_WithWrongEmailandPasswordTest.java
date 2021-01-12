package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginPageNegetiveCase_WithWrongEmailandPasswordTest extends BaseTest {
	
	@Test(enabled = true)
	public void LoginPageNegetiveTestCase_WithWrongEmailandPassword() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		
		homePage.clickOnLoginButton();
		loginPage.enterGuestUserEmailIDandPassword();
	}
}
