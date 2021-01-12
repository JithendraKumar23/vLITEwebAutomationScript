package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.PlayerPage;
import Pages.PlayerSettingsPage;

public class PlayerAudioTest extends BaseTest{
	
@Test(enabled = true)
	
	public void listAndPrintTheSelectedAudio() throws InterruptedException
	{
		/*HomePage homepage = new HomePage(driver);
		LoginPage loginpage = new LoginPage(driver);
		DetailPage detailPage = new DetailPage(driver);
		
		
		homepage.clickOnBUYButton_forFreeContet_Vidoes();
		loginpage.enterEmailID(UN);
		loginpage.enterPassword(PW);
		loginpage.clickOnLoginButton();*/
		PlayerPage playerpage = new PlayerPage(driver);
		PlayerSettingsPage playersettingspage = new PlayerSettingsPage(driver); 
		
		/*homepage.getTheTextOftheButtonfromDetailPage();
		detailPage.clickOnBUYorWATCH();
		
		playerpage.clickOnQualityButton();*/
		playersettingspage.listTheAudio();
		playersettingspage.printSelectedAudioFromTheList();
		
	}


}
