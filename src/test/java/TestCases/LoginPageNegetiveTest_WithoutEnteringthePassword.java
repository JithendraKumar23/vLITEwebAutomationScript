package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginPageNegetiveTest_WithoutEnteringthePassword extends BaseTest 
{
	@Test(enabled = true)
	public void LoginPageNegetiveTestCase_WithoutEnteringthePassword() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		
		homePage.clickOnLoginButton();
		loginPage.loginNegetiveCase_withoutEnteringthePassword();
		loginPage.clickOncloseButton();
	}
}
