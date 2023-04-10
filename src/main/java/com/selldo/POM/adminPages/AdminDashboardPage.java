package com.selldo.POM.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.selldo.Utility.GetTestData;
import com.selldo.Utility.ReusableUtils;

public class AdminDashboardPage extends ReusableUtils {
	
	public WebDriver driver;
	public AdminDashboardPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.CSS, using = "i.ion-ios-people")
	private WebElement leadsIcon;
	@FindBy(how = How.CSS, using = "#s2id_autogen2 > a > span.select2-chosen")
	private WebElement listField;
	@FindBy(how = How.CSS, using = "#select2-drop > div > input")
	private WebElement listSearch;
	@FindBy(how = How.CSS, using = "i.ion-chatbubbles")
	private WebElement chatIcon;
	@FindBy(how = How.CSS, using = "i.ion-android-calendar")
	private WebElement calenderIcon;
	@FindBy(how = How.CSS, using = "i.ion-pie-graph")
	private WebElement pieGraphIcon;
	@FindBy(how = How.CSS, using = "i.ion-cube")
	private WebElement inventoryIcon;
	@FindBy(how = How.CSS, using = "i.ion-ios-color-wand")
	private WebElement wandIcon;
	@FindBy(how = How.CSS, using = "i.ion-ios-folder")
	private WebElement documentIcon;
	@FindBy(how = How.CSS, using = "i.ion-android-settings")
	private WebElement settingIcon;
	@FindBy(how = How.CSS, using = "i.ion-android-unlock")
	private WebElement unlockIcon;
	@FindBy(how = How.XPATH, using = "//h5[text()='Login as']/following::span[1]")
	private WebElement loginAsField;
	@FindBy(how = How.CSS, using = "#select2-drop div input")
	private WebElement enterUserName;
	@FindBy(how = How.CSS, using = "#login_as_sales div.modal-footer a")
	private WebElement userLoginButton;
	@FindBy(how = How.CSS, using = "i#user-account-icon")
	private WebElement userAccountIcon;
	@FindBy(how = How.XPATH, using = "//a[text()='Edit Profile']")
	private WebElement editProfile;
	@FindBy(how = How.XPATH, using = "//a[text()='Change Password']")
	private WebElement changePassword;
	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	private WebElement logout;
	@FindBy(how = How.XPATH, using = "//span[text()='user management']")
	private WebElement userManagementTab;
	@FindBy(how = How.XPATH, using = "//span[text()='manage users']")
	private WebElement manageUsersTab;
	@FindBy(how = How.XPATH, using = "//span[text()='Search...']")
	private WebElement searchField;
	@FindBy(how = How.CSS, using = "#select2-drop > div > input")
	private WebElement searchTextBox;
	@FindBy(how = How.XPATH, using = "//span[text()='Developers']")
	private WebElement developers;
	@FindBy(how = How.CSS, using = "div.pending-invoices-alert.small.float-right.mr-2")
	private WebElement clientName;

	// To Search Lead
	public void searchLead(String lead) throws InterruptedException {
		Thread.sleep(2000);
		searchField.click();
		WebElement webElement = searchTextBox;
		webElement.sendKeys(lead);
		Thread.sleep(4000);
		webElement.sendKeys(Keys.ENTER);// Clicking enter
	}

	public void clickOnDocument() {
		documentIcon.click();
	}

	// Login as User from Admin Dashboard
	public void loginAsUser(String userName) throws Exception {
		unlockIcon.click();
		Thread.sleep(3000);
		waitUntilVisiblity(loginAsField);
		loginAsField.click();
		enterUserName.sendKeys(userName);
		enterUserName.sendKeys(Keys.RETURN);
		userLoginButton.click();

	}

	public void clickOnSettingIcon() {
		settingIcon.click();
	}

	// To Select values from Lead Management Dropdown
	public void selectLeadActions(int value) {
		leadsIcon.click();
		leadsIcon.click();
		driver.findElement(By.cssSelector(
				"body > div.main-nav-container > div > div:nth-child(2) > div > div:nth-child(" + value + ") > a"))
				.click();
	}

	public void selectInventoryActions(int value) {
		inventoryIcon.click();
		driver.findElement(By.cssSelector(
				"body > div.main-nav-item > div > div:nth-child(1) > div > div:nth-child(" + value + ") > a")).click();
	}

	public void loggingOut() {
		userAccountIcon.click();
		logout.click();
	}

	public void adminlogOut() {
		logout.click();
	}

	public void SelectList(String reassign) throws Exception {
		Thread.sleep(6000);
		listField.click();
		listSearch.sendKeys(reassign);
		listSearch.sendKeys(Keys.ENTER);
	}

	public void openManageUsersPage() {
		userManagementTab.click();
		manageUsersTab.click();
	}

	public void verifyingClientLogin() {
		SoftAssert assertion = new SoftAssert();
		System.out.println("Started verification");
		Assert.assertEquals(driver.getTitle(), "Sell.Do - Market Smarter. Sell Faster.", "Title Not Matched");
		System.out.println("Completed verification");
		assertion.assertAll();
	}

	public void verifyingClientCreation() {

		String businessName = new GetTestData().location;
		SoftAssert assertion = new SoftAssert();
		System.out.println("Started verification");
		Assert.assertEquals(clientName.getText(), businessName);
		System.out.println("Completed verification");
		assertion.assertAll();
	}

	public void clickOnWandIcon() {
		wandIcon.click();
	}

	public void clickOnDevelopers() {
		developers.click();
	}

}
