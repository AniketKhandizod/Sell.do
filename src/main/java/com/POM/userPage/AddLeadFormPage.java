package com.POM.userPage;

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

public class AddLeadFormPage extends ReusableUtils{

	public WebDriver driver;

	public AddLeadFormPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.CSS, using = "#lead_profile > div > div > div.modal-body.mt-4 > form > ul > li:nth-child(1) > a")
	private WebElement BasicProfileTab;
	@FindBy(how = How.NAME, using = "first_name")
	private WebElement FistNameField;
	@FindBy(how = How.NAME, using = "last_name")
	private WebElement LastNameField;
	@FindBy(how = How.NAME, using = "primary_email_email")
	private WebElement PrimaryEmail;
	@FindBy(how = How.NAME, using = "primary_phone_ph_number")
	private WebElement PrimaryPhone;
	@FindBy(how = How.XPATH, using = "//*[@id='s2id_autogen57']/ul")
	private WebElement ScheduleAndConductSiteVisitForProjectField;
	@FindBy(how = How.XPATH, using = "//div[@id='s2id_autogen64']")
	private WebElement NewLeadCreationLeadStage;
	@FindBy(how = How.XPATH, using = "//body/div[@id='select2-drop']/ul[1]")
	private List<WebElement> NewLeadStage;
	@FindBy(how = How.CSS, using = "div.select2-drop.select2-drop-multi.select2-display-none.select2-drop-active ul li")
	private List<WebElement> Project_dd;
	@FindBy(how = How.XPATH, using = ".//*[@id='basic_info']/div/div[1]/div[1]/div[1]/")
	private WebElement Salutation;
	@FindBy(how = How.XPATH, using = "//label[text()='Primary Email']/following::a[1]")
	private WebElement addAnotherLink_pe;
	@FindBy(how = How.XPATH, using = "//label[text()='Secondary Email']/following::a[1]")
	private WebElement removeAnotherLink_se;
	@FindBy(how = How.XPATH, using = "//label[text()='Primary Phone']/following::a[1]")
	private WebElement addAnotherLink_pp;
	@FindBy(how = How.XPATH, using = "//label[text()='Secondary Phone']/following::a[1]")
	private WebElement removeAnotherLink_sp;
	@FindBy(how = How.XPATH, using = "//*[@id='s2id_autogen61']/a/span[1]")
	private WebElement TeamsField;
	@FindBy(how = How.XPATH, using = "//*[@id='select2-drop']/div/input")
	private WebElement SelectTeamInputField;
	@FindBy(how = How.XPATH, using = "//*[@id='select2-drop']/ul/li/div/span")
	private WebElement TeamFrom_dd;
	@FindBy(how = How.XPATH, using = "//label[text()='Assign to']/following::span[1]")
	private WebElement AssignToField;
	@FindBy(how = How.XPATH, using = "//label[text()='Assign to']/following::span[1]/following::input[1]")
	private WebElement AssignToInputField;
	@FindBy(how = How.XPATH, using = "//label[text()='Assign to']/following::input[1]/ul")
	private WebElement AssignTo_dd;
	@FindBy(how = How.XPATH, using = "//label[text()='Source']/following::span[text()='Select']")
	private WebElement SourceDropdown;
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-drop']/ul/li[2]/div")
	private WebElement SourceFrom_dd;
	@FindBy(how = How.XPATH, using = "//label[text()='Campaign']/following::span[text()='Walkin']")
	private WebElement CampaignDropdown;
	@FindBy(how = How.CSS, using = "#select2-drop ul li")
	private List<WebElement> Campaign_dd;
	@FindBy(how = How.XPATH, using = "//span[text()='Lead Stage']")
	private WebElement LeadStageField;
	@FindBy(how = How.CSS, using = "#select2-drop ul li")
	private List<WebElement> LeadStages_dd;
	@FindBy(how = How.XPATH, using = "//input[@name='address1']")
	private WebElement AddressField;
	@FindBy(how = How.XPATH, using = "//input[@name='address2']")
	private WebElement StreetField;
	@FindBy(how = How.XPATH, using = "//input[@name='city']")
	private WebElement CityField;
	@FindBy(how = How.XPATH, using = "//select[@name='state']")
	private WebElement StateField;
	@FindBy(how = How.XPATH, using = "//select[@name='country']")
	private WebElement CountryDropdown;
	@FindBy(how = How.XPATH, using = "")
	private WebElement CountryFrom_dd;
	@FindBy(how = How.XPATH, using = "//input[@name='zip']")
	private WebElement ZipField;
	@FindBy(how = How.XPATH, using = "//label[text()='Interested projects']/following::input[1]")
	private WebElement ProjectsOfInterest;
	@FindBy(how = How.CSS, using = "#select2-drop ul li:nth-child(1) div")
	private WebElement ProjectOfInterestFrom_dd;
	@FindBy(how = How.XPATH, using = "//label[text()='Budget']/following::input[1]")
	private WebElement MinBudgetInputField;
	@FindBy(how = How.XPATH, using = "//label[text()='Budget']/following::input[2]")
	private WebElement MaxBudgetInputField;
	@FindBy(how = How.CSS, using = "[href=\"#requirement\"]")
	private WebElement RequirementTab;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Min possession')]")
	private WebElement MinPossession;
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-drop']/ul/li[2]/div")
	private WebElement MinPossession_dd;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Max possession')]")
	private WebElement MaxPossession;
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-drop']/ul/li[3]/div")
	private WebElement MaxPossession_dd;
	@FindBy(how = How.XPATH, using = "//label[text()='Property types']/following::input[1]")
	private WebElement PropertyTypes;
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-drop']/ul/li[3]/div")
	private WebElement PropertyTypes_dd;
	@FindBy(how = How.XPATH, using = "//input[@id='s2id_autogen78']")
	private WebElement BedroomPreferences;
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-drop']/ul/li[4]/div")
	private WebElement BedroomPreferences_dd;
	@FindBy(how = How.XPATH, using = "//label[text()='Location preferences']/following::input[1]")
	private WebElement LocationPreferencesInputField;
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-drop']/ul/li/div/span")
	private WebElement LocationPreferences_dd;
	@FindBy(how = How.XPATH, using = "//button[text()='Save'][@class='pull-right btn btn-primary save btn-sm']")
	private WebElement SaveButton;
	@FindBy(how = How.XPATH, using = "//*[@id='pre_sales_profile']/div/div/div[3]/div/button")
	private WebElement SaveButton2;
	@FindBy(how = How.XPATH, using = "//button[text()='Save']/preceding::button[2]")
	private WebElement CloseButton;
	@FindBy(how = How.XPATH, using = "//button[@id='button-0']")
	private WebElement closeButton_popup;

	public void inputFirstName(String firstname) {
		FistNameField.sendKeys(firstname);
	}

	public void inputLastName(String lastname) {
		LastNameField.sendKeys(lastname);
	}

	public void inputPrimaryEmail(String pemail) {
		PrimaryEmail.sendKeys(pemail);
	}

	public void inputPrimaryPhone(String pphone) {
		PrimaryPhone.sendKeys(pphone);
	}

	public void selectTeam(String teamname) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", ScheduleAndConductSiteVisitForProjectField);

		TeamsField.click();
		SelectTeamInputField.sendKeys(teamname);
		Thread.sleep(2000);
		TeamFrom_dd.click();
	}

	public void selecAssignTo(String assign) throws InterruptedException {
		AssignToField.click();
		AssignToInputField.sendKeys(assign);
		Thread.sleep(2000);
		AssignTo_dd.click();
	}

	public void selectProject(String projectname) throws InterruptedException {
		ScheduleAndConductSiteVisitForProjectField.sendKeys(projectname);
		Thread.sleep(2000);
		Project_dd.get(0).click();
	}

	public void selectProject() {

		// This will scroll into view
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", ScheduleAndConductSiteVisitForProjectField);
		scrollIntoView(ScheduleAndConductSiteVisitForProjectField);
		
		ScheduleAndConductSiteVisitForProjectField.click();

		List<WebElement> list = Project_dd;

		for (WebElement ele : list)

		{
			// for every elements it will print the name using innerHTML

		//	System.out.println("Values " + ele.getAttribute("innerHTML"));

			// Here we will verify if link (item) is equal Srujan

			if (ele.getAttribute("innerHTML").contains("Srujan")) {

				// if yes then click on link

				ele.click();

			//	System.out.println("Clicked on Srujan");

				// break the loop or come out of loop

				break;
			}
		}

	}

	public void selectLeadStageNewLead() {

		NewLeadCreationLeadStage.click();

		List<WebElement> list = NewLeadStage;

		for (WebElement ele : list)

		{

			System.out.println("Values " + ele.getAttribute("innerHTML"));

			if (ele.getAttribute("innerHTML").contains("CUSTOM 1")) {

				ele.click();
				System.out.println("Clicked on CUSTOM 1");

				break;
			}
		}

	}

	public void selectCampaign() {

		CampaignDropdown.click();

		List<WebElement> list = Campaign_dd;

		for (WebElement ele : list)

		{
			// for every elements it will print the name using innerHTML

			//System.out.println("Values " + ele.getAttribute("innerHTML"));

			// Here we will verify if link (item) is equal Srujan

			if (ele.getAttribute("innerHTML").contains("Final Destination 2")) {

				// if yes then click on link

				ele.click();

				// break the loop or come out of loop

				break;
			}
		}

	}

	public void selectLeadStage(String value) {

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(false);", ScheduleAndConductSiteVisitForProjectField);
//	//	scrollIntoView(ScheduleAndConductSiteVisitForProjectField);
		scrollIntoView(driver.findElement(By.xpath("//label[text()='Interested projects']")));
		wait(1000);
		LeadStageField.click();

		List<WebElement> list = LeadStages_dd;

		for (WebElement ele : list)

		{
			// for every elements it will print the name using innerHTML

			//System.out.println("Values " + ele.getAttribute("innerHTML"));

			// Here we will verify if link (item) is equal Srujan

			if (ele.getAttribute("innerHTML").contains(value)) {

				// if yes then click on link

				ele.click();

				// break the loop or come out of loop

				break;
			}
		}

	}

	public void selectSource() {

		SourceDropdown.click();
		SourceFrom_dd.click();
	}

	public void inputAddress(String address) {
		AddressField.sendKeys(address);
	}

	public void inputStreet(String street) {
		StreetField.sendKeys(street);
	}

	public void inputCity(String city) {
		CityField.sendKeys(city);
	}

	public void inputState(String state) {
		StateField.sendKeys(state);
	}

	public void inputZip(String zip) {
		ZipField.sendKeys(zip);
	}

	public void selectingProjectsOfInterest() {
		ProjectsOfInterest.click();
		ProjectOfInterestFrom_dd.click();

	}

	public void inputBudget(String min, String max) throws InterruptedException {

		// This will scroll up the web page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", FistNameField);
		scrollBy(-20000);
		RequirementTab.click();
		MinBudgetInputField.sendKeys(min);
		MaxBudgetInputField.sendKeys(max);
	}

	public void selectPossession() {
		MinPossession.click();
		MinPossession_dd.click();
		MaxPossession.click();
		MaxPossession_dd.click();
	}

	public void selectPropertyTypes() {

		// This will scroll down the web page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[@id='s2id_autogen79']/a/span[1]")));
		PropertyTypes.click();
		PropertyTypes_dd.click();
	}

	public void selectBedroomPreferences() {

		// This will scroll down the web page
		
		scrollIntoView(LocationPreferencesInputField);
		BedroomPreferences.click();
		BedroomPreferences_dd.click();
	}

	public void inputLocatioPreferences(String pref) {
		LocationPreferencesInputField.sendKeys(pref);
		LocationPreferences_dd.click();
	}

	public void clickOnSaveButton() {
		new Actions(driver).moveToElement(SaveButton2).click().perform();
		waitUntilVisiblity(driver.findElement(By.xpath("//*[@id='leads-overview']/div[1]/div[1]/span/div/div[1]/div/div[1]/span")));
		wait(3000);
	}

	public void clickOnCloseButton() {
		CloseButton.click();
	}

	public void closeButton_popup() {
		closeButton_popup.click();
	}

	public void clickOnSalutation_dd() {
		Salutation.click();
	}
}
