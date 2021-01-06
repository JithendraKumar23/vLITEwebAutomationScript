package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.DetailPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.PlayerPage;
import Pages.PlayerSettingsPage;

public class PlayerQualityTest extends BaseTest{

	
@Test(enabled = true)
	
	public void listAndSelectTheQuality() throws InterruptedException
	{
		HomePage homepage = new HomePage(driver);
		LoginPage loginpage = new LoginPage(driver);
		DetailPage detailPage = new DetailPage(driver);
		PlayerPage playerpage = new PlayerPage(driver);
		PlayerSettingsPage playersettingspage = new PlayerSettingsPage(driver); 
		
		homepage.clickOnBUYButton_forFreeContet_Vidoes();
		loginpage.enterEmailID(UN);
		loginpage.enterPassword(PW);
		loginpage.clickOnLoginButton();
		
		homepage.getTheTextOftheButtonfromDetailPage();
		detailPage.clickOnBUYorWATCH();
		
		playerpage.clickOnQualityButton();
		playersettingspage.listTheQuality();
		playersettingspage.selectTheQualityandPrintSelectedQuality();
		
	}
}
