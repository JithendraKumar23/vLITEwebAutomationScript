package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProfileMenuPage;
import Pages.SelectPlanPage;
import Pages.SuccessPopUp;

public class FreeTrailSubscriptionFromSideMenuTest extends BaseTest {


	
	@Test(enabled = true)
	public void freeTrailSubscriptionFromSideMenuTest() throws InterruptedException
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
		SelectPlanPage selectPlanPage = new SelectPlanPage(driver);
		SuccessPopUp successPopUp = new SuccessPopUp(driver);
		
		
		Thread.sleep(2000);
		homePage.clickOnProfileMenu();
		profileMenuPage.clickOnSUBSCRIBEbutton();
		selectPlanPage.checkingTheFREETrailLink();
		successPopUp.clickOnDoneButtonOnSuccessPopUp();
	}
}
