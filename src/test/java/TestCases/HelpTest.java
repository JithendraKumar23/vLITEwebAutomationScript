package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.HelpPage;
import Pages.HomePage;

public class HelpTest extends BaseTest{

	
	@Test(enabled = true)
	public void helpPage() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);

		/*LoginPage loginpage = new LoginPage(driver);
		SelectPlanPage selectplan = new SelectPlanPage(driver);

		homePage.clickOnLoginButton();
		loginpage.enterEmailID(UN);
		loginpage.enterPassword(PW);
		loginpage.clickOnLoginButton();

		selectplan.clickCloseButtonOnPlansPopUp();*/
		
		
		HelpPage helpPage = new HelpPage(driver);
		
		homePage.clickOnHelpButton();
		helpPage.clickOnEachFAQ();
		helpPage.sendtheQuerry();
		
	}
}
