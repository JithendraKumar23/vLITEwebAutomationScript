package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SubscribeOrPurchasePage;

public class LoginViaDetailPage extends BaseTest{
	@Test(enabled = true)
	public void login() throws InterruptedException
	{
		HomePage homepage = new HomePage(driver);
		LoginPage loginpage = new LoginPage(driver);
		SubscribeOrPurchasePage subscribeorpurchase = new SubscribeOrPurchasePage(driver);
		
		homepage.clickOnBUYButton();
		loginpage.enterEmailID(UN);
		loginpage.enterPassword(PW);
		loginpage.clickOnLoginButton();
		
		subscribeorpurchase.clickCloseButtonOnSubscribeORPlanPopUp();
	}

}
