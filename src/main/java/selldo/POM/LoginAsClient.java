package selldo.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.Utility.ReusableUtils;

public class LoginAsClient extends ReusableUtils {

	public WebDriver driver;

	public LoginAsClient(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//*[@class='select2-chosen']")
	private WebElement SelectAClientField;
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-drop']/div/input")
	private WebElement SelectAClientFieldInput;
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-drop']/ul/li[1]/div")
	private WebElement ClientName;
	@FindBy(how = How.ID, using = "search_clients")
	private WebElement SearchButton;
	@FindBy(how = How.CSS, using = "[value='Search']")
	private WebElement ClickOnSearchButton;
	@FindBy(how = How.ID, using = "link-login-as-client")
	private WebElement loginAsClient;
	@FindBy(how = How.LINK_TEXT, using = "Users")
	private WebElement clickOnUsers;
	@FindBy(how = How.LINK_TEXT, using = "Marketing Vendors")
	private WebElement clickOnMarketingVendors;
	@FindBy(how = How.LINK_TEXT, using = "Monitor")
	private WebElement clickOnMonotor;
	@FindBy(how = How.LINK_TEXT, using = "Call Delay Stats")
	private WebElement clickOnCallDelayState;
	@FindBy(how = How.LINK_TEXT, using = "Support Permissions")
	private WebElement clickOnSupportpermsiison;
	@FindBy(how = How.LINK_TEXT, using = "Upload androLINK_TEXT APK")
	private WebElement clickOnUploadAndroLINK_TEXTAPK;
	@FindBy(how = How.LINK_TEXT, using = "Invoices")
	private WebElement clickOnInvices;
	@FindBy(how = How.LINK_TEXT, using = "Invoice Ageing Tracker")
	private WebElement clickOnInvoiceAgencyTracking;
	@FindBy(how = How.LINK_TEXT, using = "Telephony")
	private WebElement clickOnTelephony;
	@FindBy(how = How.LINK_TEXT, using = "Update default Plan")
	private WebElement updateDefaultPlan;
	@FindBy(how = How.LINK_TEXT, using = "Logout")
	private WebElement logout;
	@FindBy(how = How.CSS, using = "[title='Login as client']")
	private WebElement clickOnSelectedClient;
	@FindBy(how = How.XPATH, using = "//div[@class='text-truncate']")
	private List<WebElement> selectClientAttributes;
	@FindBy(how = How.XPATH, using = "//a[@class='table-action-btn dropdown-toggle btn btn-sm']")
	private WebElement clickOnHamburger;
	@FindBy(how = How.LINK_TEXT, using = "Edit Plan")
	private WebElement clickOnEditPlan;
	@FindBy(how = How.LINK_TEXT, using = "Create Invoice")
	private WebElement clickOnCreateInvoice;

	public void selectClient() {

		SelectAClientField.click();
		SelectAClientFieldInput.sendKeys(getGobalData().getProperty("client"));
		ClientName.click();
		SearchButton.click();

	}

	public void loginAsClient() {
		loginAsClient.click();
	}

	public void clickOnUsers() {
		clickOnUsers.click();
	}

	public void clickOnMarketingVendors() {
		clickOnMarketingVendors.click();
	}

	public void clickOnMonotor() {
		clickOnMonotor.click();
	}

	public void clickOnCallDelayState() {
		clickOnCallDelayState.click();
	}

	public void clickOnSupportpermsiison() {
		clickOnSupportpermsiison.click();
	}

	public void clickOnUploadAndroLINK_TEXTAPK() {
		clickOnUploadAndroLINK_TEXTAPK.click();
	}

	public void clickOnInvices() {
		clickOnInvices.click();
	}

	public void clickOnInvoiceAgencyTracking() {
		clickOnInvoiceAgencyTracking.click();
	}

	public void clickOnTelephony() {
		clickOnTelephony.click();
	}

	public void updateDefaultPlan() {
		updateDefaultPlan.click();
	}

	public void logout() {
		logout.click();
	}

	public AdminHomePage clickOnSelectedClient() {
		jsClick(clickOnSelectedClient); //.click();
		return new AdminHomePage(driver);
	}

	public String getClientAttribute(int value) {
		return selectClientAttributes.get(value).getText().trim();// total count is 15
	}

	public void editPlan() {
		jsClick(clickOnHamburger);
		jsClick(clickOnEditPlan);

	}

	public void clickOnCreateInvoice() {
		jsClick(clickOnHamburger);
		jsClick(clickOnCreateInvoice);
	}
}
