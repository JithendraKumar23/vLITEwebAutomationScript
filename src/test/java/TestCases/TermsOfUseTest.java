package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.HomePage;

public class TermsOfUseTest extends BaseTest {
	
	@Test(enabled = true)
	public void helpPage() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);
		
		homePage.clickOnTermsOfuse();

	}
}
