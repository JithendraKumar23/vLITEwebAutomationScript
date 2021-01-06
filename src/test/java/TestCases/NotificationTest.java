package TestCases;

import org.testng.annotations.Test;

import Constant.BaseTest;
import Pages.HomePage;

public class NotificationTest extends BaseTest{
	
	@Test(enabled = true)
	public void notification() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver);
		
		homePage.clickOnNotification();
	}

}
