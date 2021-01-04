package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SelectPlanPage;
import Pages.SignUpPage;

public class SignUpTest extends BaseTest {
	
	@Test(enabled=true)
	public void signup() throws InterruptedException
	{
		HomePage homepage = new HomePage(driver);
		LoginPage loginpage = new LoginPage(driver);
		SignUpPage signuptest = new SignUpPage(driver);
		SelectPlanPage selectplanpage = new SelectPlanPage(driver);
		
		
		homepage.clickOnLoginButton();
		loginpage.clickOnSignUpButton();
		signuptest.enterName("Jeethu");
		signuptest.enterEmail(UN);
		signuptest.enterPassword(PW);
		signuptest.clickOnSignUpbutton();
		
		selectplanpage.clickCloseButtonOnPlansPopUp();
	}
}
