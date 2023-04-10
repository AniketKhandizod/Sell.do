package com.selldo.POM.adminPages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.Utility.ReusableUtils;

public class ExportPage extends ReusableUtils {
	public WebDriver driver;

	public ExportPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//span[text()='Export Leads']")
	private WebElement exportLeadsTab;
	@FindBy(how = How.XPATH, using = "//span[text()='Export Tasks']")
	private WebElement exportTasksTab;
	@FindBy(how = How.XPATH, using = "//span[text()='Export Users']")
	private WebElement exportUsersTab;
	@FindBy(how = How.XPATH, using = "//span[text()='Export User Logs']")
	private WebElement exportUserLogsTab;
	@FindBy(how = How.XPATH, using = "//span[text()='Export Virtual Numbers']")
	private WebElement exportVirtualNumbersTab;
	@FindBy(how = How.XPATH, using = "//span[text()='Export Booking Details']")
	private WebElement exportBookingsTab;
	@FindBy(how = How.XPATH, using = "//span[text()='Export Campaigns']")
	private WebElement exportCampaignsTab;
	@FindBy(how = How.XPATH, using = "//span[text()='Export Invoices']")
	private WebElement exportInvoicesTab;
	@FindBy(how = How.XPATH, using = "//span[text()='Export Calls']")
	private WebElement exportCallsTab;
	@FindBy(how = How.XPATH, using = "//span[text()='Export Site visits']")
	private WebElement exportSiteVisitsTab;
	@FindBy(how = How.XPATH, using = "//span[text()='Export Followups']")
	private WebElement exportFollowupsTab;
	@FindBy(how = How.XPATH, using = "//span[text()='Export Partners']")
	private WebElement exportPartnersTab;
	@FindBy(how = How.XPATH, using = "//span[text()='Export Project Units']")
	private WebElement exportProjectUnitsTab;
	@FindBy(how = How.XPATH, using = "//span[text()='Export Projects']")
	private WebElement exportProjectsTab;
	@FindBy(how = How.XPATH, using = "//input[@name='created_at']")
	private WebElement duration;
	@FindBy(how = How.CSS, using = "li.select2-search-field input")
	private List<WebElement> role;
	@FindBy(how = How.XPATH, using = "//span[text()='Project']")
	private WebElement projectField;
	@FindBy(how = How.XPATH, using = "//input[@class='select2-input']/following::ul[@class='select2-results']//li[3]")
	private WebElement project_dd;
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/table/tbody/tr[3]/td[4]/span")
	private WebElement exportStatus;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Completed')]")
	private WebElement userLogExportStatus;
	@FindBy(how = How.XPATH, using = "//div[@class='ranges']//ul//li")
	private List<WebElement> calenderRange_ExportLead;
	@FindBy(how = How.XPATH, using = "//div[@id='select2-drop']//ul//li")
	private List<WebElement> roleDropDown;
	@FindBy(how = How.XPATH, using = "//input[@id='s2id_autogen3']")
	private WebElement email;
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-drop']/ul/li[1]/div")
	private WebElement selectEmail;
	@FindBy(how = How.XPATH, using = "//label[text()='Campaign']/following::input[1]")
	private WebElement campaignSpan;
	@FindBy(how = How.CSS, using = "#select2-drop ul li:nth-child(1) div")
	private WebElement selectcampaign;
	@FindBy(how = How.XPATH, using = "//ul[@class='select2-results']//li")
	private WebElement campaign_All;
	@FindBy(how = How.XPATH, using = "//span[text()='invoice']")
	private WebElement invoicesSpan;
	@FindBy(how = How.CSS, using = "#select2-drop ul li:nth-child(1) div")
	private WebElement selectInvoice;
	@FindBy(how = How.XPATH, using = "//ul[@class='select2-results']//li")
	private List<WebElement> invoice_All;
	@FindBy(how = How.XPATH, using = "//span[text()='Type']")
	private WebElement invoiceTypeSpan;
	@FindBy(how = How.XPATH, using = "//ul[@class='select2-results']//li")
	private List<WebElement> invoiceType_All;
	@FindBy(how = How.XPATH, using = "//input[@value='Export']")
	private WebElement exportButton;
	@FindBy(how = How.XPATH, using = "//input[@value='Next >>']")
	private WebElement NextButton;
	@FindBy(how = How.XPATH, using = "//span[text()='Export History']")
	private WebElement exportHistoryTab;
	@FindBy(how = How.XPATH, using = "//i[@class='ion-funnel']")
	private WebElement funnelIcon;
	@FindBy(how = How.XPATH, using = "//input[@name='filters[created_at]']")
	private WebElement createdAtField;
	@FindBy(how = How.XPATH, using = "//div[@class='daterangepicker dropdown-menu opensleft']//ul//li")
	private List<WebElement> createdAtField_All;
	@FindBy(how = How.XPATH, using = "//label[text()='Export Type']/following::span[1]")
	private WebElement exportTypeSpan;
	@FindBy(how = How.XPATH, using = "//ul[@class='select2-results']//li")
	private List<WebElement> exportTypeSpan_All;
	@FindBy(how = How.XPATH, using = "//input[@value='Apply']")
	private WebElement applyButton;
	@FindBy(how = How.XPATH, using = "//a[text()='Clear All']")
	private WebElement clearAllLink;
	@FindBy(how = How.XPATH, using = "//button[@class='close']//i[@class='ion-android-close']")
	private WebElement crossExportIcon;
	@FindBy(how = How.XPATH, using = "//input[@value='Apply']/preceding::i[@class='ion-android-close'][1]")
	private WebElement crossFilterIcon;
	@FindBy(how = How.XPATH, using = "//a[text()='Home']/following::b[1]")
	private WebElement clickToExpandLink;
	@FindBy(how = How.CSS, using = "div#select2-drop ul li:nth-child(17)")
	private WebElement selectProject;
	@FindBy(how = How.CSS, using = "h6#export_type")
	private WebElement exportLabel;
	@FindBy(how = How.CSS, using = "div.table-filter-container.pt-2 table tbody tr:nth-child(2) td:nth-child(6) span")
	private WebElement emailIdField;

	public void clickOnExportLeadsTab() {
		exportLeadsTab.click();
	}

	public void clickOnExportTasksTab() {
		exportTasksTab.click();
	}

	public void clickOnExportUsersTab() {
		exportUsersTab.click();
	}

	public void clickOnExportUserLogsTab() {
		exportUserLogsTab.click();
	}

	public void clickOnExportVirtualNumbersTab() {
		exportVirtualNumbersTab.click();
	}

	public void clickOnExportBookingsTab() {
		exportBookingsTab.click();
	}

	public void clickOnExportCampaignsTab() {
		exportCampaignsTab.click();
	}

	public void clickOnExportInvoicesTab() {
		exportInvoicesTab.click();
	}

	public void clickOnExportCallsTab() {
		exportCallsTab.click();
	}

	public void clickOnExportSiteVisitsTab() {
		exportSiteVisitsTab.click();
	}

	public void clickOnExportFollowupsTab() {
		exportFollowupsTab.click();
	}

	public void clickOnExportChannelPartnersTab() {
		exportFollowupsTab.click();
	}

	public void clickOnExportHistoryTab() {
		exportHistoryTab.click();
	}

	public void clickOnExportPartnersTab() {
		exportPartnersTab.click();
	}

	public void clickOnExportProjectUnitsTab() {
		exportProjectUnitsTab.click();
	}

	public void clickOnExportProjectsTab() {
		exportProjectsTab.click();
	}

	public void selectDuration() {
		duration.click();

		List<WebElement> list = calenderRange_ExportLead;

		for (WebElement ele : list)

		{
			// for every elements it will print the name using innerHTML

			System.out.println("Values " + ele.getAttribute("innerHTML"));

			// Here we will verify if link (item) is equal to Last 7 Days

			if (ele.getAttribute("innerHTML").contains("Last 7 Days")) {

				// if yes then click on link

				ele.click();

				System.out.println("Clicked on Last 7 Days");

				// break the loop or come out of loop

				break;
			}
		}
	}

	public void selectRole() {
		role.get(0).click();

		List<WebElement> list = roleDropDown;

		for (WebElement ele : list)

		{
			// for every elements it will print the name using innerHTML

			System.out.println("Values " + ele.getAttribute("innerHTML"));

			// Here we will verify if link (item) is equal to Last 7 Days

			if (ele.getAttribute("innerHTML").contains("Sales")) {

				// if yes then click on link

				ele.click();

				System.out.println("Clicked on Sales Role");

				// break the loop or come out of loop

				break;
			}
		}
	}

	public void enterEmail(String em) {
		email.sendKeys(em);
		selectEmail.click();
	}

	public void selectInvoice(String em) {
		invoicesSpan.click();
		selectInvoice.click();
	}

	public void selectInvoice() {
		invoicesSpan.click();
		List<WebElement> list = invoice_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("ADPL-23886097720170421 (01/01/2017 - 22/04/2017)")) {
				ele.click();
				System.out.println("Clicked on ADPL-23886097720170421 (01/01/2017 - 22/04/2017)");
				break;
			}
		}
	}

	public void selectInvoiceType_MarketingActivity() {
		invoiceTypeSpan.click();
		List<WebElement> list = invoiceType_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Marketing Activity")) {
				ele.click();
				System.out.println("Clicked on Marketing Activity");
				break;
			}
		}
	}

	public void selectInvoiceType_Sms() {
		invoiceTypeSpan.click();
		List<WebElement> list = invoiceType_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Sms")) {
				ele.click();
				System.out.println("Clicked on Sms");
				break;
			}
		}
	}

	public void selectInvoiceType_Email() {
		invoiceTypeSpan.click();
		List<WebElement> list = invoiceType_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Email")) {
				ele.click();
				System.out.println("Clicked on Email");
				break;
			}
		}
	}

	public void selectInvoiceType_Call() {
		invoiceTypeSpan.click();
		List<WebElement> list = invoiceType_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Call")) {
				ele.click();
				System.out.println("Clicked on Call");
				break;
			}
		}
	}

	public void clickOnExportButton() {

		exportButton.click();

	}

	public void clickOnNextButton() {
		NextButton.click();

	}

	public void clickOnFunnelIcon() {
		funnelIcon.click();
	}

	public void selectCreatedAtDateRange() {
		createdAtField.click();

		List<WebElement> list = createdAtField_All;

		for (WebElement ele : list)

		{
			// for every elements it will print the name using innerHTML

			System.out.println("Values " + ele.getAttribute("innerHTML"));

			// Here we will verify if link (item) is equal to Last 7 Days

			if (ele.getAttribute("innerHTML").contains("Today")) {

				// if yes then click on link

				ele.click();

				System.out.println("Clicked on Today");

				// break the loop or come out of loop

				break;
			}
		}
	}

	public void selectExportType_ExportLeads() {
		exportTypeSpan.click();
		List<WebElement> list = exportTypeSpan_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Leads")) {
				ele.click();
				System.out.println("Clicked on Leads");
				break;
			}
		}
	}

	public void selectExportType_ExportTasks() {
		exportTypeSpan.click();
		List<WebElement> list = exportTypeSpan_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Tasks")) {
				ele.click();
				System.out.println("Clicked on Leads");
				break;
			}
		}
	}

	public void selectExportType_ExportUsers() {
		exportTypeSpan.click();
		List<WebElement> list = exportTypeSpan_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Users")) {
				ele.click();
				System.out.println("Clicked on Users");
				break;
			}
		}
	}

	public void selectExportType_ExportUserLogs() {
		exportTypeSpan.click();
		List<WebElement> list = exportTypeSpan_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("User Logs")) {
				ele.click();
				System.out.println("Clicked on Users");
				break;
			}
		}
	}

	public void selectExportType_ExportCalls() {
		exportTypeSpan.click();
		List<WebElement> list = exportTypeSpan_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Calls")) {
				ele.click();
				System.out.println("Clicked on Calls");
				break;
			}
		}
	}

	public void selectExportType_ExportSiteVisits() {
		exportTypeSpan.click();
		List<WebElement> list = exportTypeSpan_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Site visit")) {
				ele.click();
				System.out.println("Clicked on SiteVisits");
				break;
			}
		}
	}

	public void selectExportType_ExportFollowups() {
		exportTypeSpan.click();
		List<WebElement> list = exportTypeSpan_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Followups")) {
				ele.click();
				System.out.println("Clicked on Followups");
				break;
			}
		}
	}

	public void selectExportType_ExportBookings() {
		exportTypeSpan.click();
		List<WebElement> list = exportTypeSpan_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Booking Detail")) {
				ele.click();
				System.out.println("Clicked on Bookings");
				break;
			}
		}
	}

	public void selectExportType_ExportVirtualNumbers() {
		exportTypeSpan.click();
		List<WebElement> list = exportTypeSpan_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("VirtualNumbers")) {
				ele.click();
				System.out.println("Clicked on VirtualNumbers");
				break;
			}
		}
	}

	public void selectExportType_ExportItemisedBillSms() {
		exportTypeSpan.click();
		List<WebElement> list = exportTypeSpan_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Itemized Bill(Sms)")) {
				ele.click();
				System.out.println("Clicked on Itemized Bill(Sms)");
				break;
			}
		}
	}

	public void selectExportType_ExportItemisedBillEmail() {
		exportTypeSpan.click();
		List<WebElement> list = exportTypeSpan_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Itemized Bill(Email)")) {
				ele.click();
				System.out.println("Clicked on Itemized Bill(Email)");
				break;
			}
		}
	}

	public void selectExportType_ExportItemisedBillCall() {
		exportTypeSpan.click();
		List<WebElement> list = exportTypeSpan_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Itemized Bill(Call)")) {
				ele.click();
				System.out.println("Clicked on Itemized Bill(Call)");
				break;
			}
		}
	}

	public void selectExportType_ExportItemisedBillMarketingActivity() {
		exportTypeSpan.click();
		List<WebElement> list = exportTypeSpan_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Itemized Bill(Marketing Activity)")) {
				ele.click();
				System.out.println("Clicked on Itemized Bill(Marketing Activity)");
				break;
			}
		}
	}

	public void selectExportType_ExportCampaigns() {
		exportTypeSpan.click();
		List<WebElement> list = exportTypeSpan_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Campaign/SRD")) {
				ele.click();
				System.out.println("Clicked on Campaign");
				break;
			}
		}
	}

	public void selectExportType_ExportPartners() {
		exportTypeSpan.click();
		List<WebElement> list = exportTypeSpan_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Channel Partner")) {
				ele.click();
				System.out.println("Clicked on Partners");
				break;
			}
		}
	}

	public void selectExportType_ExportProjectUnits() {
		exportTypeSpan.click();
		List<WebElement> list = exportTypeSpan_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Project Unit")) {
				ele.click();
				System.out.println("Clicked on Project Unit");
				break;
			}
		}
	}

	public void selectExportType_ExportProjects() {
		exportTypeSpan.click();
		List<WebElement> list = exportTypeSpan_All;
		for (WebElement ele : list) {
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("Project")) {
				selectProject.click();
				// ele.click();
				System.out.println("Clicked on Project");
				break;
			}
		}
	}

	public void scrollToBottom() {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void selectCampaign() {
		campaignSpan.click();
		selectcampaign.click();

	}

	public void clickOnApplyButton() {
		applyButton.click();
	}

	public void clickOnFilterCrossIcon() {
		crossFilterIcon.click();
	}

	public void clickOnExportCrossIcon() {

		// This is used to select the cross icon to close the model

		WebElement element = crossExportIcon;
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		// crossExportIcon.click();
	}

	public void clickOnClickToExpandLink() {
		clickToExpandLink.click();
	}

	public void selectProject() {
		projectField.click();
		project_dd.click();
	}

}
