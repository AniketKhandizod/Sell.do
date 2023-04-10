package com.selldo.POM.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.Utility.ReusableUtils;

public class LogOfflineCallPage extends ReusableUtils {
	public WebDriver driver;

	public LogOfflineCallPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//select[@class='form-control direction select2']")
	private WebElement direction;
	@FindBy(how = How.XPATH, using = "//select[@class='form-control status select2']")
	private WebElement status;
	@FindBy(how = How.CSS, using = "input[name='time_stamp_date']")
	private WebElement date;
	@FindBy(how = How.CSS, using = "body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-top > div.datepicker-days > table > tbody > tr > td.active.day")
	private WebElement selectToday;
	@FindBy(how = How.CSS, using = "input[name='time_stamp_time']")
	private WebElement time;
	@FindBy(how = How.XPATH, using = "//input[@class='bootstrap-timepicker-hour']/following::i[1]")
	private WebElement time_down;
	@FindBy(how = How.CSS, using = "input[name='duration']")
	private WebElement duration;
	@FindBy(how = How.CSS, using = "select[class='form-control duration_unit select2']")
	private WebElement durationUnit;
	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add note']")
	private WebElement noteTextArea;
	@FindBy(how = How.XPATH, using = "//button[text()='Save'][@type='submit']")
	private WebElement saveButton;
	@FindBy(how = How.CSS, using = "#tab-activity > div.activities_list > div:nth-child(1) > div > div.card > div > div:nth-child(1) > div.col-lg-11 > div.row > div > a")
	private WebElement viewNotes;

	public void selectDirection_Inbound() {
		selectByVisibleText(direction, "Inbound");
	}

	public void selectDirection_Outbound() {
		selectByVisibleText(direction, "Outbound");
	}

	public void selectStatus_Answered() {
		selectByVisibleText(status, "Answered");
	}

	public void selectStatus_NotAnswered() {
		selectByVisibleText(status, "Not Answered");
	}

	// Selecting current date from calendar
	public void selectDate() {
		date.click();
		selectToday.click();
	}

	public void selectTime() throws InterruptedException {
		time.click();
		Thread.sleep(1000);
		time_down.click();
		/*
		 * WebElement textbox = driver .findElement(By.xpath(
		 * "//label[text()='Duration']/following::div[@class='form-group'][1]"));
		 * textbox.sendKeys(Keys.ENTER);
		 */
	}

	public void enterDuration(String dur) {
		time.sendKeys(dur);
	}

	public void selectDurationUnit_Minutes() {
		selectByVisibleText(durationUnit, "Minute(s)");
	}

	public void selectDurationUnit_Seconds() {
		durationUnit.click();
		selectByVisibleText(durationUnit, "Second(s)");
	}

	public void enterNotes(String note) {
		noteTextArea.sendKeys(note);
	}

	public void clickOnSaveButton() {
		saveButton.click();
	}

	public void clickOnViewNotesLink() {
		viewNotes.click();
	}
}
