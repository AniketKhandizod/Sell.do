package ClientCreation;

import org.testng.annotations.Test;

import com.POM.userPage.newLeadCreationPage;
import com.selldo.Utility.BaseTest;

import selldo.POM.SideBar;

public class Push_Pull_Lead_Test extends BaseTest {

	@Test
	public void pushLeadFromPreSales() {
		client.selectClient();
		client.clickOnSelectedClient();
		SideBar sidebar = new SideBar(driver);
		sidebar.signin("Tanmay");
		sidebar.movieleadManagement();
		sidebar.clicknewLead();

//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		newLeadCreationPage a = new newLeadCreationPage(driver);
		a.EnterSalutation("MR");
		a.EnterfirstName("Aniket");
		a.EnterlastName("Aniket");
		a.SelectPrimaryEmail(0);
		a.EnterEmail("aniket@sell.do");
		a.SelectPrimaryPhone(0);
	}

}
