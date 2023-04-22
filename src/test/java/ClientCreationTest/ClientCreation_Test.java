package ClientCreationTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selldo.Utility.BaseTest;

import selldo.POM.createClientPage;

public class ClientCreation_Test extends BaseTest {
	
	@Test
	public void createPostpaidClient() {
		createClientPage page= new createClientPage(driver);
		page.clickOnClientButton();
		page.enterFirstName(random("enterFirstName","A",7));
		page.enterLastName(random("enterLastName","A",7));
		page.enterBuisnessName(random("enterBuisnessName","A",7));
		page.selectBuisnessType();
		page.shortName(random("shortName","A",6));
		page.enterClientWebsite(random("enterClientWebsite","AN",7));
		page.enterclinetEmail(random("enterclinetEmail","AN",7));
		page.uploadFile("nun");
		page.enterClientPhone(random("enterClientPhone","N",9));
		page.enterMask(random("enterMask","A",6));
		page.selectIndustry(3);// 0) Real Estate 1) Education 2) BFSI  3) Generic
		page.enterAddres(random("enterAddres","A",6));
		page.enterCountry(1);
		page.enterState(1);
		page.enterCity("Pune");
		page.enterZip(414003);
		page.enterUserFirstName(random("enterUserFirstName","A",7));
		page.enterUserLasttName(random("enterUserLasttName","A",7));
		page.enterUserPhone(random("enterClientPhone","N",9));
		page.enterEmail(random("enterEmail","A",9));
		page.enterUserTeam(random("enterUserTeam","A",7));
		page.selectVendores();
		String respone = page.clickOnsave();
		Assert.assertEquals(respone, "","Success massage not as expected");
		
		
	}
	@Test
	public void createPrepaidClient() {
		client.logout();
		createClientPage page= new createClientPage(driver);
		page.landOnPrepidpage();
		page.enterfirstNamePrePaid(random("enterfirstNamePrePaid","A",7));
		page.enterLastNamePrePaid(random("enterLastNamePrePaid","A",7));
		page.enterPasswordPrePaid(random("enterPasswordPrePaid","AN",10));
		page.enterEmaillPrePaid(random("enterEmaillPrePaid","A",7));
		page.enterMobilePrePaid(random("enterMobilePrePaid","N",9));
		page.landOnPrepidpagePrePaid(random("landOnPrepidpagePrePaid","A",7));
		page.selectBuisnessTypeePrePaid(0);
		page.selectIndustryPrePaid(0);
		page.selectWebsitePrePaid(random("selectWebsitePrePaid","AN",10));
		page.clickOnSignupPrePaid();
	}
	
	
	
}
