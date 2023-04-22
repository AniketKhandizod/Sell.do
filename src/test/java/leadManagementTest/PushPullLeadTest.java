package leadManagementTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.POM.userPage.AddLeadFormPage;
import com.selldo.Utility.BaseTest;

import selldo.POM.SideBar;

public class PushPullLeadTest extends BaseTest {
	char[]arr={'7','8','9'};
	String leadID;
	String leadOwner;
	@Test
	public void TC_001_createNewLead() throws InterruptedException, IOException {

		client.selectClient();
		client.clickOnSelectedClient();
		SideBar sidebar = new SideBar(driver);	
		sidebar.signin("Tanmay");	// Select User		
		sidebar.movieleadManagement();// Navigate point to leadManagemenet		
		sidebar.clicknewLead(3);// Click on new Lead

		AddLeadFormPage addLeadForm = new AddLeadFormPage(driver);
		String currentUrl = driver.getCurrentUrl();
		addLeadForm.inputFirstName(random("LeadfirstName", "AN", 7));
		addLeadForm.inputLastName(random("LeadlastName", "AN", 7));
		addLeadForm.inputPrimaryEmail("" + random("LeadEmail", "AN", 7) + "@gmail.com");
		addLeadForm.inputPrimaryPhone("+91 " + ""+R(arr)+"" + random("LeadPhone", "N", 9) + "");	                                     	// addLeadForm.selectingProjectsOfInterest();
		//addLeadForm.selectProject("Aniket Mega Project PVT LTD");
		addLeadForm.selectLeadStage("Incoming");
		addLeadForm.selectTeam("Amura");// amura
		addLeadForm.selectCampaign("Organic");
		addLeadForm.selectSource();
		addLeadForm.conductedSiteVisit("Aniket K");
		addLeadForm.inputAddress("Test");
		addLeadForm.inputStreet("Test");
		addLeadForm.inputCity("Pune");
		addLeadForm.inputState("Maharashtra");
		addLeadForm.inputZip("414003");
		addLeadForm.inputBudget(random("Lead min budget", "N", 4), random("Lead min budget", "N", 9));
		addLeadForm.selectPossession();
		addLeadForm.selectPropertyTypes("Apartment");                                                                                     // addLeadForm.selectBedroomPreferences();
		addLeadForm.inputLocatioPreferences("Pune");
		addLeadForm.clickOnSaveButton();
	    leadID=driver.findElement(By.xpath("//span[contains(@name,'lead_id')]")).getText().trim();
		buffer.write("Lead id : "+leadID);
		buffer.newLine();
	    leadOwner =driver.findElement(By.xpath("//label[contains(text(),'Owner')]/parent::div//span")).getText().trim();
		buffer.write("Lead Owner : "+leadOwner);
		Assert.assertNotEquals(currentUrl, driver.getCurrentUrl(), "Lead Not Created");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='noty_message']")).getText().trim(), "Lead created successfully","Lead Not Created");
	}
	@Test (dependsOnMethods = { "TC_001_createNewLead" })
	public void TC_002_pushLeadToSales() {
		
		client.selectClient();
		client.clickOnSelectedClient();
		SideBar sidebar = new SideBar(driver);	
		sidebar.signin(leadOwner);
		SideBar sb = new SideBar(driver);
		sb.searchbar(leadID+"#");
	}
	

}
