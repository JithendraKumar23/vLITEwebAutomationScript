package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SelectPlanPage;

public class LoginTest extends BaseTest {
	
	@Test(enabled = true)
	public void login() throws InterruptedException
	{
		HomePage homepage = new HomePage(driver);
		LoginPage loginpage = new LoginPage(driver);
		SelectPlanPage selectplan = new SelectPlanPage(driver);
		
		homepage.clickOnLoginButton();
		loginpage.enterEmailID(UN);
		loginpage.enterPassword(PW);
		loginpage.clickOnLoginButton();
		
		selectplan.clickCloseButtonOnPlansPopUp();
	}

}
