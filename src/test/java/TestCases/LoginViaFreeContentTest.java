package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.DetailPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.PlayerPage;

public class LoginViaFreeContentTest extends BaseTest{
	@Test(enabled = true)
	
	public void loginViaFreeContentDetailpage() throws InterruptedException
	{
		HomePage homepage = new HomePage(driver);
		LoginPage loginpage = new LoginPage(driver);
		DetailPage detailPage = new DetailPage(driver);
		PlayerPage playerPage = new PlayerPage(driver);
		
		homepage.clickOnBUYButton_forFreeContet_Vidoes();
		loginpage.enterEmailID(UN);
		loginpage.enterPassword(PW);
		loginpage.clickOnLoginButton();
		
		homepage.getTheTextOftheButtonfromDetailPage();
		detailPage.clickOnBUYorWATCH();
		playerPage.getTheContentTitle();
		playerPage.clickBackButtonFromPlayerPage();
	}

}
