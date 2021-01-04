package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.PayTMPage;
import Pages.PaymentPage;
import Pages.ProfileMenuPage;
import Pages.SelectPlanPage;
import Pages.SuccessPopUp;

public class SubscriptionFromSideMenuTest extends BaseTest{

	@Test(enabled = true)
	public void subscriptionFromSideMenu() throws InterruptedException
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
		PaymentPage paymentPage = new PaymentPage(driver);
		PayTMPage payTMPage = new PayTMPage(driver);
		SuccessPopUp successPopUp = new SuccessPopUp(driver);
		
		
		Thread.sleep(2000);
		homePage.clickOnProfileMenu();
		profileMenuPage.clickOnSUBSCRIBEbutton();
		selectPlanPage.clickOnSubscribeButtonOnPlanPage();
		paymentPage.clickOnPaytm();
		payTMPage.clickOnNETBankingLink();
		successPopUp.successMessageToPrint();
		successPopUp.clickOnDoneButtonOnSuccessPopUp();
		
	}

}
