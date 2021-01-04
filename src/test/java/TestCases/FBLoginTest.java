package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.HomePage;
import Pages.SelectPlanPage;
import Pages.SignUpPage;

public class FBLoginTest extends BaseTest {

	@Test(enabled = true)
	public void fbSignUp() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);
		SignUpPage signUpPage = new SignUpPage(driver);
		SelectPlanPage selectplan = new SelectPlanPage(driver);
		
		homePage.clickOnLoginButton();
		signUpPage.fbSignUp();
		selectplan.clickCloseButtonOnPlansPopUp();
	}


}
