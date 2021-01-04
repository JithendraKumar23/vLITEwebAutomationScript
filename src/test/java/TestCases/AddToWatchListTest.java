package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.DetailPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SelectPlanPage;
import Pages.SideMenuPage;
import Pages.WatchListPage;

public class AddToWatchListTest extends BaseTest{

	@Test(enabled = true)
	public void addToWatchListButton() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);

		LoginPage loginpage = new LoginPage(driver);
		SelectPlanPage selectplan = new SelectPlanPage(driver);

		homePage.clickOnLoginButton();
		loginpage.enterEmailID(UN);
		loginpage.enterPassword(PW);
		loginpage.clickOnLoginButton();

		selectplan.clickCloseButtonOnPlansPopUp();

		DetailPage detailPage = new DetailPage(driver);
		SideMenuPage sidemenuPage = new SideMenuPage(driver);
		WatchListPage watchListPage = new WatchListPage(driver);


		Thread.sleep(2000);
		homePage.scollTheLIVEContentDetailPageAndOpenTheDetailPage();
		detailPage.addToWatchList();
		homePage.clickOnhambergurMenu();
		sidemenuPage.selectTheWatchListSection();
		watchListPage.comparingOnTheTitleANDPrintingTheMessageOnWatchListPage();
		
	}


}
