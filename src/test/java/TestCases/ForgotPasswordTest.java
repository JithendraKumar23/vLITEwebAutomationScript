package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.ForgotPasswordPage;
import Pages.HomePage;
import Pages.LoginPage;

public class ForgotPasswordTest extends BaseTest{

	
	@Test(enabled = true)
	public void forgotPassword() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
		
		
		homePage.clickOnLoginButton();
		loginPage.clickOnForgotPasswordLink();
		forgotPasswordPage.forgotPassword();
	}



}
