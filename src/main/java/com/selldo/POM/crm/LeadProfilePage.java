package com.selldo.POM.crm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.Utility.ReusableUtils;

public class LeadProfilePage extends ReusableUtils {
	public WebDriver driver;

	public LeadProfilePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//i[@class='ion-quote mr-2']")
	private WebElement addANote;
	@FindBy(how = How.XPATH, using = "//textarea[@name='content']")
	private WebElement addNote_Textarea;
	@FindBy(how = How.XPATH, using = "//button[text()='Save Note']")
	private WebElement saveNoteButton;
	@FindBy(how = How.CSS, using = "span[name='lead_id']")
	private WebElement leadid;
	@FindBy(how = How.ID, using = "call-dropdown")
	private WebElement call;
	@FindBy(how = How.XPATH, using = "//i[@class='ion-android-drafts mr-2']")
	private WebElement email;
	@FindBy(how = How.XPATH, using = "//a[text()='Compose Email']")
	private WebElement ComposeEmail;
	@FindBy(how = How.XPATH, using = "//i[@class='ion-android-textsms mr-2']")
	private WebElement SMS;
	@FindBy(how = How.XPATH, using = "//i[@class='ion-android-calendar mr-2']")
	private WebElement meeting;
	@FindBy(how = How.XPATH, using = "//i[@class='ion-quote mr-2']/following::a[@class='nav-link dropdown-toggle'][1]")
	private WebElement more;
	@FindBy(how = How.XPATH, using = "//a[@class='nav-link lead-reassign']")
	private WebElement reassign;
	@FindBy(how = How.XPATH, using = "//a[@class='nav-link lead-schedule-followup']")
	private WebElement followup;
	@FindBy(how = How.CSS, using = "a[title='Push to sales']")
	private WebElement push;
	@FindBy(how = How.CSS, using = ".nav-link.active.lead_pull_to_sales")
	private WebElement pull;
	@FindBy(how = How.XPATH, using = "//a[@class='nav-link lead-booking-forms']")
	private WebElement bookings;
	@FindBy(how = How.XPATH, using = "//a[@class='nav-link lead-add-conducted-site-visit']")
	private WebElement conductedSiteVisit;
	@FindBy(how = How.XPATH, using = "//a[@class='nav-link  lead-schedule-site-visit']")
	private WebElement siteVisit;
	@FindBy(how = How.XPATH, using = "//a[@class='nav-link lead-merge']")
	private WebElement mergeLeads;
	@FindBy(how = How.XPATH, using = "//a[@class='nav-link offline-call-form']")
	private WebElement logOflineCall;
	@FindBy(how = How.XPATH, using = "//a[text()='Activity'][@href='#tab-activity']")
	private WebElement activityTab;
	@FindBy(how = How.XPATH, using = "//a[text()='Feed'][@href='#tab-activity']")
	private WebElement feedTab;
	@FindBy(how = How.CSS, using = "#tab-activity > div.activities_list > div:nth-child(1) > div > div.card > div > div:nth-child(1) > div.col-lg-1 > div > a")
	private WebElement actionBar_Sitevisit;
	@FindBy(how = How.CSS, using = "ul.dropdown-menu.dropdown-menu-right.show li a")
	private List<WebElement> actionBar_Options;
	@FindBy(how = How.CSS, using = "#tab-activity > div.activities_list > div:nth-child(1) > div > div.card > div > div:nth-child(1) > div.col-lg-1 > div > div > a")
	private WebElement actionBar_Followup;
	@FindBy(how = How.CSS, using = "a.nav-link.lead-schedule-followup")
	private WebElement followupLink;
	@FindBy(how = How.CSS, using = "body > nav > div.top-navigation-right-panel > div > div.dropdown.float-right > a > i")
	private WebElement userIcon;
	@FindBy(how = How.CSS, using = "[data-method=\"delete\"]")
	private WebElement logout;
	@FindBy(how = How.CSS, using = "a[href='/client/signout']")
	private WebElement backToAdmin;
	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-12 activity-responsive-tabs col-lg-5 pr-0']//a[@role='button'][normalize-space()='More']")
	private WebElement more_d;
	@FindBy(how = How.XPATH, using = "//a[@class='nav-link'][@data-value='SiteVisit']")
	private WebElement sitevisit_d;
	@FindBy(how = How.XPATH, using = "//div[@class='col-lg-1']")
	private WebElement sitevisit_d_actionbar;
	@FindBy(how = How.XPATH, using = "//a[text()='Confirm']")
	private WebElement sitevisit_confirm;
	@FindBy(how = How.XPATH, using = "//span[text()='Campaign Responses']/preceding::a[text()='Send Brochure'][1]")
	private WebElement brochure;
	@FindBy(how = How.XPATH, using = "//a[text()='Send Quick Quote']")
	private WebElement sendQuickQuote;
	@FindBy(how = How.XPATH, using = "//i[@class='ion-edit ml-2']")
	private WebElement editIcon;
	@FindBy(how = How.XPATH, using = "//a[text()='Followups'][@href='#tab-activity']")
	private WebElement followup_d;
	@FindBy(how = How.CSS, using = "#tab-activity > div.activities_list > div:nth-child(1) > div > div.card > div > div:nth-child(1) > div.col-lg-1 > div > div > a")
	private WebElement followup_d_actionbar;
	@FindBy(how = How.XPATH, using = "//span[text()='Email']")
	private WebElement email_FollowupActivity;
	@FindBy(how = How.XPATH, using = "//a[text()='Emails'][@href='#tab-activity']")
	private WebElement email_d;
	// By call_d =
	// @FindBy(how = How.XPATH, using
	// ="//*[@id=\"activity_container\"]/div/div[1]/div[1]/nav/li[3]/a") private
	// WebElement ;
	@FindBy(how = How.XPATH, using = "//a[text()='Calls'][@href='#tab-activity']")
	private WebElement call_d;
	@FindBy(how = How.XPATH, using = "//a[text()='SMS'][@href='#tab-activity']")
	private WebElement sms_d;
	@FindBy(how = How.XPATH, using = "//span[text()='Sub filter']")
	private WebElement subfilter_Sitevisit;
	@FindBy(how = How.XPATH, using = "//ul[@class='dropdown-menu dropdown-menu-right type show']//li")
	private List<WebElement> subfilter_Sitevisit_All;
	@FindBy(how = How.XPATH, using = "//a[@class='nav-link'][@data-value='Email']")
	private WebElement email_Activity;

	// Stage
	@FindBy(how = How.XPATH, using = "//button[@class='btn dropdown-toggle btn-sm btn-outline-primary']")
	private WebElement stageDropdown;

	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-menu type show']//a")
	private List<WebElement> stageDropdown_All;

	@FindBy(how = How.XPATH, using = "//a[@class='save_stage_and_status btn float-right btn-primary btn-sm mr-2']")
	private WebElement saveButton;

	// Why was this customer Lost? popup appeared when stage changed to Lost
	@FindBy(how = How.XPATH, using = "//label[text()='Select reason']/following::select")
	private WebElement selectReasonDropdown;
	@FindBy(how = How.XPATH, using = "//button[text()='Save changes']")
	private WebElement saveChangesButton;

	// Add a Product
	@FindBy(how = How.XPATH, using = "//a[@id='add-product']")
	private WebElement addaProductButton;
	@FindBy(how = How.XPATH, using = "//input[@id='s2id_autogen10']")
	private List<WebElement> addProjectsField;
	@FindBy(how = How.XPATH, using = "//div[@id='s2id_autogen10']//ul[@class='select2-choices']")
	private WebElement addProjectsField1;
	@FindBy(how = How.XPATH, using = "//div[@id='s2id_autogen10']//ul[@class='select2-choices']")
	private WebElement addProjectsField2;
	// div[@id='s2id_autogen10']//input[@class='select2-input select2-default']

	@FindBy(how = How.CSS, using = "ul.select2-results li:nth-child(3)")
	private WebElement addfirstProject;
	@FindBy(how = How.CSS, using = "ul.select2-choices li:nth-child(1) div")
	private WebElement projectSelected;
	@FindBy(how = How.XPATH, using = "//button[text()='Add']")
	private WebElement addButton;

	@FindBy(how = How.XPATH, using = "//span[text()='Campaign Responses']/preceding::a[@class='btn btn-light']")
	private WebElement actionBar_addProject;
	@FindBy(how = How.XPATH, using = "//ul[@class='dropdown-menu dropdown-menu-right show']//li")
	private List<WebElement> actionBar_addProject_dd;

	// Add Inventory
	@FindBy(how = How.XPATH, using = "//i[@class='ion-funnel']")
	private WebElement funnelIcon_addInventory;
	@FindBy(how = How.XPATH, using = "//a[text()='Units'][@class='nav-link new_resale_div']")
	private WebElement unitsTab;
	@FindBy(how = How.XPATH, using = "//th[text()='Actions']/following::i[@class='fa fa-ellipsis-v'][1]")
	private WebElement actionBar_Unit;
	@FindBy(how = How.XPATH, using = "//th[text()='Actions']/following::button[text()='Details'][1]")
	private WebElement details_actionBar_Unit;

	// Inventory details
	@FindBy(how = How.XPATH, using = "//*[@id='right_pane']/div/div/div[1]/div/div/div[2]/div[2]/div[1]/div[1]/a")
	private WebElement addButton_inventoryDetails;
	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-menu dropdown-menu-right show']//a")
	private List<WebElement> addButton_inventoryDetails_All;

	// .........Booking Details.........
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-default close_profile_form']")
	private WebElement closeButton_Bookingdetails;
	@FindBy(how = How.XPATH, using = "//*[@id=\"s2id_autogen58\"]/a/span[2]")
	private WebElement enterUnit;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-drop\"]/ul/li[1]")
	private WebElement selectUnit;
	@FindBy(how = How.XPATH, using = "//*[@id=\"center_pane_container\"]/div/div/div/div[1]/div[2]/div/div/button/i")
	private WebElement filters;
	@FindBy(how = How.XPATH, using = "//*[@id=\"leads-list\"]/div/div/div/div[2]/div/div[2]/div/a")
	private WebElement clearFilters;
	@FindBy(how = How.XPATH, using = "//*[@id=\"leads-list\"]/div/div/div/div[2]/div/div[2]/div/div/button")
	private WebElement applyButton;
	@FindBy(how = How.XPATH, using = "//*[@id=\"s2id_autogen53\"]")
	private WebElement projectFilter;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-drop\"]/ul/li[2]")
	private WebElement projectSelect;
	@FindBy(how = How.XPATH, using = "//*[@id=\"s2id_autogen51\"]")
	private WebElement status;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-drop\"]/ul/li[1]/div")
	private WebElement statusSelect;
	@FindBy(how = How.XPATH, using = "//*[@id=\"s2id_autogen57\"]")
	private WebElement tower;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-drop\"]/ul/li")
	private WebElement towerSelect;
	@FindBy(how = How.XPATH, using = "//*[@id=\"leads-list\"]/div/div/div/div[2]/div/div[1]/div/span/a/i")
	private WebElement closeFilter;
	@FindBy(how = How.XPATH, using = "//span[text()='Campaign Responses']/preceding::a[@class='float-right small pt-2 open_form']")
	private WebElement addAProduct;
	@FindBy(how = How.XPATH, using = "//input[@class='select2-input select2-default']")
	private List<WebElement> enterProduct;
	@FindBy(how = How.XPATH, using = "//button[@class='w-100 btn btn-primary add_interested_property']")
	private WebElement clickAdd;
	@FindBy(how = How.CSS, using = "#leads-overview > div:nth-child(1) > div:nth-child(2) > div.alert.alert-info > div:nth-child(1)")
	private WebElement noAccessMessageText;

	public void clickOnFollowup() {
		more.click();
		followup.click();
	}

	public void followupLink() {
		more.click();
		followupLink.click();
	}

	// ................Methods for Scheduling Site visit....................

	public void clickOnMeetingLink() {
		more.click();
		siteVisit.click();
	}

	public void selectReschedule() {
		actionBar_Sitevisit.click();

		List<WebElement> list = actionBar_Options;
		for (WebElement ele : list) {
			// for every elements it will print the name using innerHTML
			System.out.println("Values " + ele.getAttribute("innerHTML"));

			// Here we will verify if link (item) is equal to Mark as conducted
			if (ele.getAttribute("innerHTML").contains("Reschedule")) {

				// if yes then click on link
				ele.click();
				System.out.println("Clicked on Reschedule");

				// break the loop or come out of loop
				break;
			}
		}
	}

	public void selectMarkAsConducted() {
		actionBar_Sitevisit.click();

		List<WebElement> list = actionBar_Options;
		for (WebElement ele : list) {
			// for every elements it will print the name using innerHTML
			System.out.println("Values " + ele.getAttribute("innerHTML"));

			// Here we will verify if link (item) is equal to Mark as conducted
			if (ele.getAttribute("innerHTML").contains("Mark as conducted")) {

				// if yes then click on link
				ele.click();
				System.out.println("Clicked on Mark as conducted");

				// break the loop or come out of loop
				break;
			}
		}
	}

	public void selectMarkDidNotVisit() {
		actionBar_Sitevisit.click();
		List<WebElement> list = actionBar_Options;
		for (WebElement ele : list) {
			// for every elements it will print the name using innerHTML
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			// Here we will verify if link (item) is equal to Mark as conducted
			if (ele.getAttribute("innerHTML").contains("Mark did not visit")) {
				// if yes then click on link
				ele.click();
				System.out.println("Clicked on Mark did not visit");
				// break the loop or come out of loop
				break;
			}
		}
	}

	public void selectMarkNotInterested() {
		actionBar_Sitevisit.click();
		List<WebElement> list = actionBar_Options;
		for (WebElement ele : list) {
			// for every elements it will print the name using innerHTML
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			// Here we will verify if link (item) is equal to Mark as conducted
			if (ele.getAttribute("innerHTML").contains("Mark not interested")) {
				// if yes then click on link
				ele.click();
				System.out.println("Clicked on Mark not interested");
				// break the loop or come out of loop
				break;
			}
		}
	}

	public void selectConfirm() throws Exception {
		Thread.sleep(2000);
		actionBar_Sitevisit.click();

		List<WebElement> list = actionBar_Options;
		for (WebElement ele : list) {
			// for every elements it will print the name using innerHTML
			System.out.println("Values " + ele.getAttribute("innerHTML"));

			// Here we will verify if link (item) is equal to Mark as conducted
			if (ele.getAttribute("innerHTML").contains("Confirm")) {

				// if yes then click on link
				ele.click();
				System.out.println("Clicked on Confirm");

				// break the loop or come out of loop
				break;
			}
		}
	}

	public void selectCancelFollowup() {
		actionBar_Followup.click();

		List<WebElement> list = actionBar_Options;
		for (WebElement ele : list) {
			// for every elements it will print the name using innerHTML
			System.out.println("Values " + ele.getAttribute("innerHTML"));

			// Here we will verify if link (item) is equal to Mark as conducted
			if (ele.getAttribute("innerHTML").contains("Cancel Followup")) {

				// if yes then click on link
				ele.click();
				System.out.println("Clicked on Cancel Followup");

				// break the loop or come out of loop
				break;
			}
		}
	}

	public void selectActivity(int tabNumber) {

		driver.findElement(By.cssSelector("#activity_container > div > nav > li:nth-child(" + tabNumber + ") > a"))
				.click();

	}

	public void userLogout() {
		userIcon.click();
		logout.click();

	}

	public void backToAdmin() throws Exception {
		Thread.sleep(3000);
		userIcon.click();
		backToAdmin.click();

	}

	public void clickOnEmailLink() {
		email.click();
		ComposeEmail.click();
	}

	public void clickOnSmsLink() {
		SMS.click();
	}

	// .........................Methods for adding a Note.......................

	public void clickOnAddANoteLink() {
		addANote.click();
	}

	public void enterNote(String note) {
		addNote_Textarea.sendKeys(note);
	}

	public void clickOnsaveNoteButton() {
		saveNoteButton.click();
	}

	// ......................Methods for Activities Details......................

	public void clickSitvisit_d() {
		more_d.click();
		sitevisit_d.click();
	}

	public void openEmailActivities() {
		more_d.click();
		email_Activity.click();

	}

	public void selectPending_Sitevisit() throws InterruptedException {
		subfilter_Sitevisit.click();
		List<WebElement> list = subfilter_Sitevisit_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Pending")) {
				Thread.sleep(1000);
				ele.click();
				System.out.println("Clicked on Pending");
				break;
			}
		}
	}

	public void clickFollowup_d() {
		more_d.click();
		followup_d.click();
	}

	public void clickOnCall_d() {
		more_d.click();
		call_d.click();
	}

	public void clickEmail_d() {
		more_d.click();
		email_d.click();
	}

	public void clickSms_d() {
		more_d.click();
		sms_d.click();
	}

	public void clickActivityTab() {
		activityTab.click();
	}

	public void clickFeedTab() {
		more_d.click();
		feedTab.click();
	}

	public void clickOnActionBar() {
		followup_d_actionbar.click();
	}

	public void clickOnEmail_FollowupActivity() {
		email_FollowupActivity.click();
	}

	public void selectPush() {
		more.click();
		push.click();
	}

	public void selectPull() throws Exception {
		Thread.sleep(5000);
		pull.click();
	}

	public void selectReassign() {
		more.click();
		reassign.click();
	}

	public void selectConductedSiteVisit() {
		more.click();
		conductedSiteVisit.click();
	}

	public void selectSiteVisit() {
		more.click();
		siteVisit.click();
	}

	public void selectMergeLeads() {
		more.click();
		mergeLeads.click();
	}

	public void clickOnBrochure() {
		brochure.click();
	}

	public String getLeadId() {
		String leadId = leadid.getText();
		return leadId;
	}

	public void clickOnSendQuickQuote() {
		sendQuickQuote.click();
	}

	// ...........Method for stage change..............

	public void changing_Stage(String stageName) throws InterruptedException {

		stageDropdown.click();

		List<WebElement> list = stageDropdown_All;

		for (WebElement ele : list) {

			// Here we will verify if link (item) is equal to Prospect
			if (ele.getAttribute("innerHTML").contains(stageName)) {
				// if yes then click on link
				Thread.sleep(1000);
				ele.click();
				// break the loop or come out of loop
				break;
			}
		}

		Thread.sleep(1000);
		saveButton.click();
	}

	public void selectReasonForLostOrUnqualified() {
		selectByIndex(selectReasonDropdown, 4);
		saveChangesButton.click();
	}
	// ........Methods for adding project on lead................

	public void addingProject() throws InterruptedException {
		addaProductButton.click();
		addProjectsField.get(2).click();
		Thread.sleep(2000);

		addfirstProject.click();

	}

	public void selectProject() throws InterruptedException {
		addaProductButton.click();
		addProjectsField1.click();
		List<WebElement> list = addProjectsField;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Swapnil Villa")) {
				Thread.sleep(1000);
				ele.click();
				System.out.println("Clicked on Swapnil Villa");
				break;
			}
		}
	}

	public void addingInventory() throws InterruptedException {
		actionBar_addProject.click();
		List<WebElement> list = actionBar_addProject_dd;
		for (WebElement ele : list) {
			// for every elements it will print the name using innerHTML
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			// Here we will verify if link (item) is equal to Add Inventory
			if (ele.getAttribute("innerHTML").contains("add_inventory_property")) {
				// if yes then click on link
				ele.click();
				System.out.println("Add inventory");
				// break the loop or come out of loop
				break;
			}
		}
	}

	public void selectingUnit() throws InterruptedException {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actionBar_Unit.click();
		Thread.sleep(1000);
		details_actionBar_Unit.click();
	}

	public void bookingUnit() throws InterruptedException {

		addButton_inventoryDetails.click();
		List<WebElement> list = addButton_inventoryDetails_All;
		for (WebElement ele : list) {
			// for every elements it will print the name using innerHTML
			System.out.println("Values " + ele.getAttribute("innerHTML"));

			// Here we will verify if link (item) is equal to Booked
			if (ele.getAttribute("innerHTML").contains("Booked")) {

				// if yes then click on link
				ele.click();

				System.out.println("Booked");

				// break the loop or come out of loop
				break;
			}
		}
	}

	public void selectBookings() {
		// To scroll Up
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-450)", "");
		more.click();
		bookings.click();
	}

	public void searchAndSelectProjectUnit() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Actions actions = new Actions(driver);
		actions.moveToElement(enterUnit);
		actions.click().perform();
		actions.sendKeys("ps unit 75").perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		selectUnit.click();
	}

	public void selectLogOfflineCalls() {
		more.click();
		logOflineCall.click();
	}

	public void clickOnCloseButton_Bookingdetails() {
		closeButton_Bookingdetails.click();
	}

	public void clickOnEditIcon() {
		editIcon.click();
	}

	public void changeFilters() {
		Actions actions = new Actions(driver);

		// Selecting filter and clear the default filters
		actions.moveToElement(filters);
		actions.click().perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actions.moveToElement(clearFilters);
		actions.click().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actions.moveToElement(applyButton).click().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Project filter
		actions.moveToElement(projectFilter);
		actions.click();
		actions.sendKeys("Project Secure");
		actions.build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actions.moveToElement(projectSelect).click().perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Status filter
		actions.moveToElement(status).click().perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actions.moveToElement(statusSelect).click().perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Tower filter
		actions.moveToElement(tower).click();
		actions.sendKeys("Inventory1");
		actions.build().perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actions.moveToElement(towerSelect).click().perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Click Apply button
		actions.moveToElement(applyButton).click().perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JavascriptExecutor jse = (JavascriptExecutor) (driver);
		jse.executeScript("window.scrollBy(0,-300)", "");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Close the filter popup
		actions.moveToElement(closeFilter).click().perform();

	}

	public void addAProduct() {
		addAProduct.click();
		List<WebElement> list = enterProduct;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));

			// Here we will verify if link (item) is equal to Booked
			if (ele.getAttribute("innerHTML").contains("Testing")) {

				// if yes then click on link
				ele.click();
				System.out.println("Testing");
				break;
			}
		}
		clickAdd.click();
	}
}
