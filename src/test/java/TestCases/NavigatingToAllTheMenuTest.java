package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.SideMenuPage;

InComplete
public class NavigatingToAllTheMenuTest extends BaseTest{

	
	@Test(enabled = true)
	public void navigatingToAllTheMenuFromtheList() throws InterruptedException
	{

		SideMenuPage menuPage = new SideMenuPage(driver);
		
		menuPage.clickOnhambergurMenu_1();
		menuPage.clickAlTheListFromSideMenu();
	}

}
