package com.selldo.POM.crm;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.Utility.ReusableUtils;

public class SiteVisitPage extends ReusableUtils {

	public WebDriver driver;

	public SiteVisitPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// ...................Schedule Site visit form .........................

	@FindBy(how = How.XPATH, using = "//label[@for='project_id']/following::span[1]")
	private WebElement projectSpan;
	@FindBy(how = How.XPATH, using = "//input[@class='select2-input']/following::ul[@class='select2-results']//li[3]")
	private WebElement project_dd;
	@FindBy(how = How.XPATH, using = "//input[@name='scheduled_date']")
	private WebElement scheduleOnDate;
	@FindBy(how = How.XPATH, using = "//input[@name='conducted_date']")
	private WebElement conductedOnDate;
	@FindBy(how = How.XPATH, using = "//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-top']//tr//td")
	private List<WebElement> wholeCalender;
	@FindBy(how = How.CSS, using = "div.datepicker-days > table > tbody > tr > td.active.day")
	private WebElement selectToday;
	@FindBy(how = How.XPATH, using = "//label[text()='Schedule on (date & time)']/following::span[2]")
	private WebElement scheduleOnTime;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Schedule Site visit']")
	private WebElement scheduleSiteVisitButton;
	@FindBy(how = How.XPATH, using = "//label[text()='Site visit Confirmation']/following::span[1]")
	private WebElement siteVisitConfirmation;
	@FindBy(how = How.CSS, using = "#select2-drop > div > input")
	private WebElement tentative_dd;
	@FindBy(how = How.XPATH, using = "//button[text()=' Ignore & Schedule ']")
	private WebElement ignoreAndScheduleButton;
	@FindBy(how = How.XPATH, using = "//textarea[@class='form-control notes']")
	private WebElement siteVisitNotes_addConducted;
	@FindBy(how = How.XPATH, using = "//button[text()='Add previously conducted site visit']")
	private WebElement addPreviouslyConductedSiteVisitButton;

	// ...................Reschedule Site visit form........................

	@FindBy(how = How.XPATH, using = "//button[text()='Reschedule']")
	private WebElement rescheduleButton;

	// ....................Mark Site visit Conducted.........................

	@FindBy(how = How.XPATH, using = "//label[text()='Conducted on (date & time)']/following::input[1]")
	private WebElement scheduleOnDate_ConductedOn;
	@FindBy(how = How.XPATH, using = "//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-top']//tr//td")
	private List<WebElement> calender;
	@FindBy(how = How.XPATH, using = "//textarea[@name='notes']")
	private WebElement conductedNotes;
	@FindBy(how = How.XPATH, using = "//button[text()='Mark as conducted']")
	private WebElement markAsConductedButton;

	// ......................Mark Did Not Visit.................................

	@FindBy(how = How.XPATH, using = "//label[text()='Site visit notes']/following::textarea")
	private WebElement didNotVisitNotes;
	@FindBy(how = How.XPATH, using = "//button[text()='Did not visit']")
	private WebElement didNotVisitButton;

	// ......................Mark Not Interested................................

	@FindBy(how = How.XPATH, using = "//label[text()='Site visit notes']/following::textarea")
	private WebElement notInterestedNotes;
	@FindBy(how = How.XPATH, using = "//button[text()='Mark not interested']")
	private WebElement markNotInterestedButton;

	@FindBy(how = How.XPATH, using = "//button[text()='Confirm']")
	private WebElement confirmButton;

	/*
	 * WebDriver driver = null; WebDriverWait wait;
	 * 
	 * public DocumentsPage(WebDriver driver) {
	 * 
	 * this.driver = driver; wait = new WebDriverWait(driver, 8); }
	 */

	public void selectProject() {
		projectSpan.click();
		project_dd.click();
	}

	public void sitevisitScheduleDate() throws Exception {
		Thread.sleep(2000);
		scheduleOnDate.click();
		List<WebElement> dates = wholeCalender;
		int total_node = dates.size();
		for (int i = 0; i < total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equals("6")) {
				dates.get(i).click();// Clicking on above selected date
				break;
			}
		}
	}

	public void selectDate() throws Exception {
		Thread.sleep(2000);
		scheduleOnDate.click();
		selectToday.click();
	}

	public void clickOnScheduleSiteVisitButton() {
		scheduleSiteVisitButton.click();
	}

	public void clickOnConfirmButton() throws Exception {
		Thread.sleep(5000);
		confirmButton.click();
	}

	public void clickOnIgnoreAndSchedule() {
		ignoreAndScheduleButton.click();
	}

	// ...................Methods for Reschedule............................

	public void sitevisitRescheduleDate() throws InterruptedException {
		Thread.sleep(2000);
		scheduleOnDate.click();
		List<WebElement> dates = wholeCalender;
		int total_node = dates.size();
		for (int i = 0; i < total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equals("28")) {
				dates.get(i).click();// Clicking on above selected date
				break;
			}
		}
	}

	public void clickOnRescheduleButton() throws Exception {
		Thread.sleep(4000);
		rescheduleButton.click();
	}

	// .................Methods for Mark As Conducted.......................

	public void sitevisitConductedOnDate() throws Exception {
		Thread.sleep(2000);
		scheduleOnDate_ConductedOn.click();
		List<WebElement> dates = calender;
		int total_node = dates.size();
		for (int i = 0; i < total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equals("10")) {
				dates.get(i).click();// Clicking on above selected date
				break;
			}
		}
	}

	public void enterNotesForConductedSiteVisit(String notes) {
		conductedNotes.sendKeys(notes);
	}

	public void clickOnMarkAsConductedButton() throws Exception {
		Thread.sleep(3000);
		markAsConductedButton.click();
	}

	// ..................Methods for Mark Did Not Visit........................

	public void enterNotesForDidNotVisit(String notes) {
		didNotVisitNotes.sendKeys(notes);
	}

	public void clickOnDidNotVisitButton() throws Exception {

		Thread.sleep(5000);
		didNotVisitButton.click();
	}

	// ..................Methods for Mark Not Interested.......................

	public void enterNotesForNotInterested(String notes) throws Exception {
		Thread.sleep(2000);
		notInterestedNotes.sendKeys(notes);
	}

	public void clickOnMarkNotInterestedButton() throws Exception {
		Thread.sleep(5000);
		markNotInterestedButton.click();
	}

	// ........................Selecting
	// Tentative................................

	public void selectTentative() {
		siteVisitConfirmation.click();
		tentative_dd.sendKeys("Tentative");
		tentative_dd.sendKeys(Keys.ENTER);

	}

	// ...........Methods for adding conducted site visit..................

	public void sitevisitConductedDate(String dt) throws Exception {
		Thread.sleep(2000);
		conductedOnDate.click();
		List<WebElement> dates = wholeCalender;
		int total_node = dates.size();
		for (int i = 0; i < total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equals(dt)) {
				dates.get(i).click();// Clicking on above selected date
				break;
			}
		}
	}

	public void addNotes(String notes) {
		siteVisitNotes_addConducted.sendKeys(notes);
	}

	public void clickOnAddPreviouslyConductedSvButton() {
		addPreviouslyConductedSiteVisitButton.click();
	}

}
