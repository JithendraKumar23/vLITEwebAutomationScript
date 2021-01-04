package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.HomePage;
import Pages.ProfileMenuPage;

public class LogoutTest extends BaseTest{
	
	@Test(enabled=true)
	public void Logout() throws InterruptedException
	{
		HomePage homeppage = new HomePage(driver);
		ProfileMenuPage profilemenu = new ProfileMenuPage(driver);
		
		homeppage.clickOnProfileMenu();
		profilemenu.clickOnLogoutButton();
		homeppage.checkingtheLoginButtonOntheHomepage();
	}



}
