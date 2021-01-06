package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.HomePage;
import Pages.SearchPage;

public class SearchTest extends BaseTest
{
	@Test(enabled = true)
	public void search() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);
		SearchPage searchPage = new SearchPage(driver);
		
		homePage.clickOnSearchButton();
		searchPage.getTheContentCount();
		searchPage.openTheContentDetailPage();
		homePage.clickCloseButtononDetailPage();
		searchPage.clickOnCloseButtonOnSearchpage();
	}
}
