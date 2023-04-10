package com.selldo.POM.crm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.selldo.Utility.ReusableUtils;

public class SalesPresalesDashboardPage extends ReusableUtils {

	public WebDriver driver;

	public SalesPresalesDashboardPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.CSS, using = "i.ion-ios-people")
	private WebElement leadsIcon;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='All Leads']")
	private WebElement allLeadsLink;
	@FindBy(how = How.CSS, using = "i.ion-cube")
	private WebElement inventoryCubeIcon;
	@FindBy(how = How.XPATH, using = "//button[text()='Save As']")
	private WebElement saveAsButton;
	@FindBy(how = How.CSS, using = "#s2id_autogen2 > a > span.select2-chosen")
	private WebElement listField;
	@FindBy(how = How.CSS, using = "#select2-drop > div > input")
	private WebElement listSearch;
	@FindBy(how = How.XPATH, using = "//button[@class='btn dropdown-toggle btn-sm btn-outline-primary']")
	private WebElement stageDropdown;
	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-menu type show']")
	private List<WebElement> stageDropdown_All;
	@FindBy(how = How.XPATH, using = "//a[@class='save_stage_and_status btn float-right btn-primary btn-sm mr-2']")
	private WebElement saveButton;
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-ellipsis-v']")
	private WebElement actionBar_Lead1;
	@FindBy(how = How.CSS, using = "#leads-container > tbody > tr:nth-child(2) > td.text-right > div > a")
	private WebElement actionBar_Lead2;
	@FindBy(how = How.CSS, using = "#leads-container > tbody > tr:nth-child(1) > td.text-right > div > a")
	private WebElement actionBar;
	@FindBy(how = How.XPATH, using = "//button[text()='Preview']")
	private WebElement preview;
	@FindBy(how = How.XPATH, using = "//button[text()='View Profile']")
	private WebElement viewProfileButton;
	@FindBy(how = How.CSS, using = "div.dropdown-menu.dropdown-menu-right.show button.dropdown-item.goto_details")
	private WebElement details;
	@FindBy(how = How.XPATH, using = "//span[text()='Search...']")
	private WebElement searchField;
	@FindBy(how = How.XPATH, using = "//div[@id='new-enquires']//div[@class='tile-item-body text-success']")
	private WebElement newEnquiryBucket;
	@FindBy(how = How.XPATH, using = "//div[@id='reengaged-leads']//div[@class='tile-item-body text-success']")
	private WebElement reengagedLeadsBucket;
	@FindBy(how = How.XPATH, using = "//div[@id='missed-calls']//div[@class='tile-item-body text-danger']")
	private WebElement missedCallsBucket;
	@FindBy(how = How.XPATH, using = "//div[@id='nfa-leads']//div[@class='tile-item-body text-danger']")
	private WebElement nFABucket;
	@FindBy(how = How.CSS, using = "i#user-account-icon")
	private WebElement userAccountIcon;
	@FindBy(how = How.CSS, using = "span.status")
	private WebElement availableLink;
	@FindBy(how = How.XPATH, using = "//a[text()='Edit Profile']")
	private WebElement editProfile;
	@FindBy(how = How.XPATH, using = "//h5[text()='Edit User']/following::i[1]")
	private WebElement crossIcon_EditProfile;
	@FindBy(how = How.XPATH, using = "//input[@value='Save']")
	private WebElement saveButton_EditProfile;
	@FindBy(how = How.CSS, using = "div.dropdown-menu.dropdown-menu-right.call-center-availability-dropdown.show a:nth-child(2)")
	private WebElement markOnBreak;
	@FindBy(how = How.CSS, using = "span.status")
	private WebElement onBreakLink;
	@FindBy(how = How.CSS, using = "div.dropdown-menu.dropdown-menu-right.call-center-availability-dropdown.show a:nth-child(1)")
	private WebElement markOnlineLink;
	@FindBy(how = How.CSS, using = "#select2-drop > div > input")
	private WebElement searchTextBox;
	@FindBy(how = How.CSS, using = "i.ion-refresh.refresh-sales-dashboard")
	private WebElement refreshIcon;
	@FindBy(how = How.XPATH, using = "//span[text()='missed Followups']/following::div[1]")
	private WebElement missedFollowups;
	@FindBy(how = How.XPATH, using = "//a[@href='#open_tasks']")
	private WebElement openTasksLink;
	@FindBy(how = How.XPATH, using = "//span[text()='missed Site visits']/following::div[1]")
	private WebElement missedSiteVisits;
	@FindBy(how = How.CSS, using = "#dropdownMenuButton")
	private WebElement filterIcon;
	@FindBy(how = How.CSS, using = "div.dropdown-menu.dropdown-menu-right.show a:nth-child(2)")
	private WebElement siteVisitFilter;
	@FindBy(how = How.CSS, using = "div.dropdown-menu.dropdown-menu-right.show a:nth-child(3)")
	private WebElement followupFilter;

	// To Search Lead
	public void searchLead(String lead) throws InterruptedException {
		Thread.sleep(2000);
		searchField.click();
		WebElement webElement = searchTextBox;
		webElement.sendKeys(lead);
		Thread.sleep(4000);
		webElement.sendKeys(Keys.ENTER);// Clicking enter
	}

	public void clickOnSaveAsButton() {
		saveAsButton.click();
	}

	// To Select values from Lead Management Drop down
	public void selectLeadActions(int value) throws Exception {

		moveToElement(leadsIcon);

		driver.findElement(By.cssSelector(
				"body > div.main-nav-container > div.sub-navigation-bar > div:nth-child(1) > div:nth-child(" + value
						+ ") > a"))
				.click();
	}

	public void goToAllLeadsList() {

		moveToElement(leadsIcon);

		allLeadsLink.click();
	}

	public void openLeadProfile() {
		actionBar.click();
		preview.click();
		viewProfileButton.click();
	}

	public void openLeadDetails() throws Exception {
		Thread.sleep(6000);
		actionBar.click();
		details.click();

	}

	public void openLeadDetails2() throws Exception {
		Thread.sleep(4000);
		actionBar_Lead2.click();
		details.click();

	}

	public void refreshDashboardStats() {
		refreshIcon.click();
	}

	public void clickOnnewEnquiryBucket() {
		newEnquiryBucket.click();
	}

	public void clickOnReengagedLeadsBucket() {
		reengagedLeadsBucket.click();
	}

	public void clickOnMissedCallsBucket() {
		missedCallsBucket.click();
	}

	public void clickOnNFAbucket() {
		nFABucket.click();
	}

	public void selectMarkOnBreak() {
		availableLink.click();
		markOnBreak.click();
	}

	public void validatingOnBreakLink() {
		SoftAssert assertion = new SoftAssert();
		System.out.println("Started verification");
		Assert.assertEquals(onBreakLink.getText(), "You are on break", "Not matched");
		System.out.println("Completed verification");
		assertion.assertAll();
	}

	public void validatingOnBreakStatus() {
		SoftAssert assertion = new SoftAssert();
		System.out.println("Started verification");
		Assert.assertEquals(onBreakLink.getText(), "You are on break", "Not matched");
		System.out.println("Completed verification");
		assertion.assertAll();
	}

	public void validatingAvailableLink() {
		SoftAssert assertion = new SoftAssert();
		System.out.println("Started verification");
		Assert.assertEquals(availableLink.getText(), "Available", "Not matched");
		System.out.println("Completed verification");
		assertion.assertAll();
	}

	// Clicking on Mark Online Link
	public void availableForCall() {
		onBreakLink.click();
		markOnlineLink.click();
	}

	public void SelectList(String reassign) throws Exception {
		Thread.sleep(12000);
		listField.click();
		listSearch.sendKeys(reassign);
		listSearch.sendKeys(Keys.ENTER);
	}

	public void changing_BookedToProspect() throws InterruptedException {

		stageDropdown.click();

		List<WebElement> list = stageDropdown_All;

		for (WebElement ele : list)

		{
			// for every elements it will print the name using innerHTML

			System.out.println("Values " + ele.getAttribute("innerHTML"));

			// Here we will verify if link (item) is equal to Prospect

			if (ele.getAttribute("innerHTML").contains("Prospect")) {

				// if yes then click on link

				Thread.sleep(3000);

				ele.click();

				System.out.println("Clicked on Prospect");

				// break the loop or come out of loop

				break;
			}
		}
		saveButton.click();
	}

	public void editUserProfile() {
		userAccountIcon.click();
		editProfile.click();
	}

	public void closeEditProfile() {
		saveButton_EditProfile.click();
	}

	public void clickOnMissedSitevisitBucket() {
		openTasksLink.click();
		missedSiteVisits.click();

	}

	public void clickOnMissedFollowupBucket() {
		openTasksLink.click();
		missedFollowups.click();
	}

	public void applySitevisitFilter() {

		filterIcon.click();
		siteVisitFilter.click();
	}

	public void applyFollowupFilter() {

		filterIcon.click();
		followupFilter.click();
	}

	public void pageRefresh() {

		driver.navigate().refresh();
	}

}
