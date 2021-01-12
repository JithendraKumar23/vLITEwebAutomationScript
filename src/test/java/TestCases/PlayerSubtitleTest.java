package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.PlayerPage;
import Pages.PlayerSettingsPage;

public class PlayerSubtitleTest extends BaseTest{

	
@Test(enabled = true)
	
	public void listAndPrintTheSelectedSubtitle() throws InterruptedException
	{/*
		HomePage homepage = new HomePage(driver);
		LoginPage loginpage = new LoginPage(driver);
		DetailPage detailPage = new DetailPage(driver);
		
		
		homepage.clickOnBUYButton_forFreeContet_Vidoes();
		loginpage.enterEmailID(UN);
		loginpage.enterPassword(PW);
		loginpage.clickOnLoginButton();
		
		homepage.getTheTextOftheButtonfromDetailPage();
		detailPage.clickOnBUYorWATCH();
		
		playerpage.clickOnQualityButton();*/
	
	    PlayerPage playerpage = new PlayerPage(driver);
	    PlayerSettingsPage playersettingspage = new PlayerSettingsPage(driver); 
		playersettingspage.listOfSubstiles();
		playersettingspage.selectTheSubtileandPrintSelectedQuality();
		playersettingspage.deselectTheSubtileandPrintSelectedQuality();
		playersettingspage.clickBackFromSettingspage();
		playerpage.clickBackButtonFromPlayerPage();
		
	}




}
