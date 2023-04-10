package com.selldo.POM.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.Utility.ReusableUtils;

public class FollowupsPage extends ReusableUtils {

	public WebDriver driver;

	public FollowupsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.CSS, using = "input[name=\"scheduled_date\"]")
	private WebElement ScheduleOnDateField;
	@FindBy(how = How.CSS, using = "		")
	private WebElement ScheduleOnTimeField;
	@FindBy(how = How.CSS, using = "div.datepicker-days > table > tbody > tr > td.active.day")
	private WebElement selectToday;
	@FindBy(how = How.CSS, using = "#s2id_autogen26 > a > span.select2-chosen")
	private WebElement FollowupType;
	@FindBy(how = How.CSS, using = "#select2-drop ul li:nth-child(1)")
	private WebElement callFollowup;
	@FindBy(how = How.CSS, using = "#select2-drop ul li:nth-child(2)")
	private WebElement emailFollowup;
	@FindBy(how = How.CSS, using = "[placeholder=\"Subject\"]")
	private WebElement subjectText;
	@FindBy(how = How.CSS, using = "[placeholder=\"Notes / Agenda\"]")
	private WebElement noteText;
	@FindBy(how = How.CSS, using = "button.btn.btn-primary.pull-right.schedule_followup")
	private WebElement ScheduleFollowupButton;
	@FindBy(how = How.CSS, using = "button.close.text-white.lead-index")
	private WebElement closeButton;
	@FindBy(how = How.CSS, using = "div.select2-container.form-control.cancellation_reason a span")
	private WebElement CancellationReasonDropdown;
	@FindBy(how = How.CSS, using = "#select2-drop > ul > li:nth-child(1) > div")
	private WebElement cancellationReason;
	@FindBy(how = How.CSS, using = "textarea[placeholder=\"Notes\"]")
	private WebElement cancelNoteText;
	@FindBy(how = How.XPATH, using = "//button[text()='Cancel Followup']")
	private WebElement cancelFollowupButton;
	@FindBy(how = How.XPATH, using = "//button[text()=' Ignore & Schedule ']")
	private WebElement ignoreAndScheduleButton;
	@FindBy(how = How.XPATH, using = "//button[text()='Cancel']")
	private WebElement cancelFollowupForPostSalesButton;
	@FindBy(how = How.XPATH, using = "//button[contains(@class,'btn btn-primary submit_form')]")
	private WebElement ScheduleFollowupButtonForPostSales;

	// Selecting current date from calendar
	public void selectDate() throws Exception {
		Thread.sleep(2000);
		ScheduleOnDateField.click();
		selectToday.click();
	}

	// Clicking on Schedule On Time field
	public void clickOnScheduleOnTimeField() {
		ScheduleOnTimeField.click();
	}

	// Selecting type of follow up either call/email

	public void selectFollowupType(String type) {
		FollowupType.click();
		if (type.equalsIgnoreCase("Call")) {
			callFollowup.click();
		} else {
			emailFollowup.click();
		}

	}

	// adding Subject
	public void addSubject(String subject) {
		noteText.sendKeys(subject);

	}

	// adding Notes
	public void addingNotes(String notes) {
		subjectText.sendKeys(notes);

	}

	// Clicking on Schedule Followup button
	public void clickOnScheduleFollowupButton() {
		ScheduleFollowupButton.click();
	}

	public void clickOnIgnoreAndSchedule() {
		ignoreAndScheduleButton.click();
	}

	// Closing Follow up Page
	public void closeWindow() {
		closeButton.click();

	}

	// Clicking on Cancellation Reason drop down
	public void clickCancellationReasonDropdown() throws Exception {
		Thread.sleep(4000);
		CancellationReasonDropdown.click();
	}

	// Selecting Cancellation Reason as Incorrect follow up date
	public void selectCancellationReason() {
		cancellationReason.click();
	}

	// adding Cancellation Notes
	public void cancelNotes(String textNotes) {
		cancelNoteText.sendKeys(textNotes);

	}

	// Clicking on Cancel Follow up button
	public void clickCancelFollowupButton() {
		cancelFollowupButton.click();
	}

	// Clicking on Schedule Followup button for post sales
	public void clickOnScheduleFollowupButtonForPostSales() {
		ScheduleFollowupButtonForPostSales.click();
	}

	// Clicking on Cancel Follow up button PostSales
	public void clickCancelFollowupForPostSalesButton() {
		cancelFollowupForPostSalesButton.click();
	}

}
