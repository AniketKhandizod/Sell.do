package ClientCreation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.POM.userPage.AddLeadFormPage;
import com.POM.userPage.newLeadCreationPage;
import com.selldo.Utility.BaseTest;

import selldo.POM.SideBar;

public class PushPullLeadTest extends BaseTest {


	@Test
	public void pushToSales() throws InterruptedException, IOException {

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
		addLeadForm.inputPrimaryEmail("" + random("LeadEmail", "AN", 7) + "@sell.do");
		addLeadForm.inputPrimaryPhone("+91 " + "9" + random("LeadPhone", "N", 9) + "");	                                     	// addLeadForm.selectingProjectsOfInterest();
		addLeadForm.selectLeadStage("Incoming");
		addLeadForm.selectTeam("Amura");// amura
		addLeadForm.selectCampaign();
		addLeadForm.selectSource();
		addLeadForm.selectProject();
		addLeadForm.inputAddress("Test");
		addLeadForm.inputStreet("Test");
		addLeadForm.inputCity("Pune");
		addLeadForm.inputState("Maharashtra");
		addLeadForm.inputZip("414003");
		addLeadForm.inputBudget(random("Lead min budget", "N", 8), random("Lead min budget", "N", 9));
		addLeadForm.selectPossession();
		addLeadForm.selectPropertyTypes();                                                                                     // addLeadForm.selectBedroomPreferences();
		addLeadForm.inputLocatioPreferences("Pune");
		addLeadForm.clickOnSaveButton();
		buffer.write("Lead id : "+driver.findElement(By.xpath("//*[@id='leads-overview']/div[1]/div[1]/span/div/div[1]/div/div[1]/span")).getText().trim());
		buffer.newLine();
		buffer.write("Lead Owner : "+driver.findElement(By.xpath("//*[@id='leads-overview']/div[1]/div[2]/div[4]/div[1]/div/span")).getText().trim());
		Assert.assertNotEquals(currentUrl, driver.getCurrentUrl(), "Lead Not Created");

	}

}
