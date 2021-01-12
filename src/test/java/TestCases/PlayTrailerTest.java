package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.HomePage;
import Pages.PlayerPage;

public class PlayTrailerTest extends BaseTest{
	
	@Test(enabled = true)
	public void playTrailer() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);
		PlayerPage playerPage = new PlayerPage(driver);
		
		homePage.selectTheFirstContentandOfMovieAndPlayTrailer();
		playerPage.getTheContentTitle();
		Thread.sleep(10000);
		playerPage.clickBackButtonFromPlayerPage();
		
	}

}
