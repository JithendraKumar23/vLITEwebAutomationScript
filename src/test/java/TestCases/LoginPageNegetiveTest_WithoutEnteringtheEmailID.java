package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginPageNegetiveTest_WithoutEnteringtheEmailID extends BaseTest {

	
	@Test(enabled = true)
	public void LoginPageNegetiveTestCase_WithoutEnteringtheEmailIDandPassword() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		
		homePage.clickOnLoginButton();
		loginPage.loginNegetiveCase_withoutEnteringtheEmailIDandPassword();
		loginPage.clickOncloseButton();
		
	}
}
