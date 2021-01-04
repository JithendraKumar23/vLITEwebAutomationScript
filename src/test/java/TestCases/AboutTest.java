package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.AboutPage;
import Pages.HomePage;

public class AboutTest extends BaseTest{


	@Test(enabled = true)
	public void helpPage() throws InterruptedException
	{
		
		HomePage homePage = new HomePage(driver);
		AboutPage aboutpage = new AboutPage(driver);
		
		homePage.clickOnAboutButton();
		aboutpage.switchtabforFB();
		aboutpage.switchtabforPinterest();
		aboutpage.switchtabforTwitter();
		aboutpage.switchtabforInstagram();
		aboutpage.closeAboutPage();
	}


}
