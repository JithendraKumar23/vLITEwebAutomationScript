package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.EditProfilePage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProfileMenuPage;
import Pages.ProfilePage;
import Pages.SelectPlanPage;

public class EditProfileTest extends BaseTest{


	@Test(enabled = true)
	public void editProfile() throws InterruptedException, IOException
	{
		HomePage homePage = new HomePage(driver);
		
		LoginPage loginpage = new LoginPage(driver);
		SelectPlanPage selectplan = new SelectPlanPage(driver);
		
		homePage.clickOnLoginButton();
		loginpage.enterEmailID(UN);
		loginpage.enterPassword(PW);
		loginpage.clickOnLoginButton();
		
		selectplan.clickCloseButtonOnPlansPopUp();
		
		ProfileMenuPage profileMenuPage = new ProfileMenuPage(driver);
		ProfilePage profilePage = new ProfilePage(driver);
		EditProfilePage editProfilePage = new EditProfilePage(driver);
		
		Thread.sleep(2000);
		homePage.clickOnProfileMenu();
		profileMenuPage.clickOnProfileButton();
		profilePage.clickOnEditPrifile();
		editProfilePage.editPrifile();
		
	}


}
