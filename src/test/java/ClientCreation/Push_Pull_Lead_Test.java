package ClientCreation;

import org.testng.annotations.Test;

import com.selldo.Utility.BaseTest;

import selldo.POM.SideBar;

public class Push_Pull_Lead_Test extends BaseTest {
	
	@Test
	public void pushLeadFromPreSales() {
	client. selectClient() ;	
	client.clickOnSelectedClient();
	SideBar sidebar = new SideBar(driver);
	sidebar.signin("Tanmay");
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}

}
