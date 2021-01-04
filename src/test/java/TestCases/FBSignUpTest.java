package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SelectPlanPage;
import Pages.SignUpPage;

public class FBSignUpTest extends BaseTest{


	@Test(enabled = true)
	public void fbSignUp() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);
		LoginPage loginpage = new LoginPage(driver);
		SignUpPage signUpPage = new SignUpPage(driver);
		SelectPlanPage selectplan = new SelectPlanPage(driver);

		homePage.clickOnLoginButton();
		loginpage.clickOnSignUpButton();
		signUpPage.fbSignUp();
		selectplan.clickCloseButtonOnPlansPopUp();
	}


}
