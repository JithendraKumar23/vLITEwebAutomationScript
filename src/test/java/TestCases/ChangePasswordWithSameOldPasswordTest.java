package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.ChangePasswordPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProfileMenuPage;
import Pages.ProfilePage;
import Pages.SelectPlanPage;

public class ChangePasswordWithSameOldPasswordTest extends BaseTest{

	
	@Test(enabled = true)
	public void changePasswordWithTheOldPasswordNegativeTestcase() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);
		
		LoginPage loginpage = new LoginPage(driver);
		SelectPlanPage selectplan = new SelectPlanPage(driver);
		
		homePage.clickOnLoginButton();
		loginpage.enterEmailID(UN);
		loginpage.enterPassword(PW);
		loginpage.clickOnLoginButton();
		
		selectplan.clickCloseButtonOnPlansPopUp();
		
		ProfileMenuPage profileMenuPage = new ProfileMenuPage(driver);
		ProfilePage profilePage = new ProfilePage(driver);
		ChangePasswordPage changePasswordPage = new ChangePasswordPage(driver);
		
		
		Thread.sleep(2000);
		homePage.clickOnProfileMenu();
		profileMenuPage.clickOnProfileButton();
		profilePage.clickOnChangePassword();
		changePasswordPage.changePassword();
		changePasswordPage.toPrintTheErrorMessage();
		changePasswordPage.clickOnCloseButtonOnChangePasswordPopUp();
		
		
	}
}
