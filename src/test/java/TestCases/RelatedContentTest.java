package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.HomePage;

public class RelatedContentTest extends BaseTest
{
	@Test(enabled = true)
	public void relatedContent() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);
		
		homePage.selectTheFirstContentFromMoviesandCheckTheRelatedSectionFlow();
		homePage.clickCloseButtononDetailPage();
	}
}
