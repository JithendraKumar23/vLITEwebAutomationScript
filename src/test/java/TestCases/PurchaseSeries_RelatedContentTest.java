package TestCases;

import org.testng.annotations.Test;
import Constant.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.PayTMPage;
import Pages.PaymentPage;
import Pages.PlayerPage;
import Pages.SelectQualityPage;
import Pages.SubscribeOrPurchasePage;
import Pages.SuccessPopUp;

public class PurchaseSeries_RelatedContentTest extends BaseTest{

	
	@Test(enabled = true)
	public void PurchaseLiveContent() throws InterruptedException
	{
		HomePage homepage = new HomePage(driver);
		LoginPage loginpage = new LoginPage(driver);
		SubscribeOrPurchasePage subscribeOrPurchasePage = new SubscribeOrPurchasePage(driver);
		SelectQualityPage selectQualityPage = new SelectQualityPage(driver);
		PaymentPage paymentPage = new PaymentPage(driver); 
		PayTMPage payTMPage = new PayTMPage(driver);
		SuccessPopUp successPopUp = new SuccessPopUp(driver);
		PlayerPage playerPage = new PlayerPage(driver);
		
		homepage.selectTheEpisodeFromTheRelatedSection();
		loginpage.enterEmailID(UN);
		loginpage.enterPassword(PW);
		loginpage.clickOnLoginButton();
		
		subscribeOrPurchasePage.clickOnPurchasebutton();
		selectQualityPage.selectHDQuality();
		paymentPage.clickOnPaytm();
		payTMPage.clickOnNETBankingLink();
		successPopUp.successMessageToPrint();
		successPopUp.clickOnDoneButtonOnSuccessPopUp();
		homepage.checkingtheButtonTextOnHomePageforSeriesPurchasedContent();
		homepage.playEpisode();
		playerPage.clickBackButtonFromPlayerPage();
		
	}
}
