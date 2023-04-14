package selldo.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.Utility.ReusableUtils;

public class createClientPage extends ReusableUtils {

	public WebDriver driver;

	public createClientPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "btn-add-client")
	private WebElement addClientButton;
	@FindBy(how = How.ID, using = "client_first_name")
	private WebElement firstName;
	@FindBy(how = How.ID, using = "client_last_name")
	private WebElement lastName;
	@FindBy(how = How.ID, using = "client_name")
	private WebElement buisnessName;
	@FindBy(how = How.ID, using = "s2id_client_business_type")
	private WebElement buisnessType;
	@FindBy(how = How.CSS, using = ".select2-result-label")
	private WebElement selectbuisnessType;
	@FindBy(how = How.ID, using = "client_short_name")
	private WebElement shortName;
	@FindBy(how = How.ID, using = "client_website")
	private WebElement clientWebsite;
	@FindBy(how = How.ID, using = "client_email")
	private WebElement clientEmail;
	@FindBy(how = How.XPATH, using = "//input[@type='file']")
	private WebElement uploadFile;
	@FindBy(how = How.CSS, using = "input[data-field='client[phone]']")
	private WebElement clientPhone;
	@FindBy(how = How.ID, using = "transactional_sms_mask")
	private WebElement mask;
	@FindBy(how = How.ID, using = "client_address_attributes_address1")
	private WebElement clientAddress;
	@FindBy(how = How.ID, using = "client_address_attributes_country")
	private WebElement clientCountry;
	@FindBy(how = How.XPATH, using = "//select[@name='client[address_attributes][state]']")
	private WebElement clientState;
	@FindBy(how = How.ID, using = "client_address_attributes_city")
	private WebElement clientCity;
	@FindBy(how = How.ID, using = "client_address_attributes_zip")
	private WebElement clientZip;
	@FindBy(how = How.ID, using = "user_first_name")
	private WebElement userFirstName;
	@FindBy(how = How.ID, using = "user_last_name")
	private WebElement userLastName;
	@FindBy(how = How.CSS, using = "input[class='form-control phone_number non_form_field unique_phone']")
	private WebElement userPhone;
	@FindBy(how = How.ID, using = "user_email")
	private WebElement userEmail;
	@FindBy(how = How.ID, using = "team_name")
	private WebElement userTeam;
	@FindBy(how = How.ID, using = "//*[text()='Select Vendor']")
	private List<WebElement> vendors;
	@FindBy(how = How.XPATH, using = "(//div[@class='select2-result-label'])[1]")
	private WebElement selectvendor;
	@FindBy(how = How.XPATH, using = "(//span[@class='select2-chosen'])[8]")
	private WebElement selectvendor1;
	@FindBy(how = How.XPATH, using = "(//span[@class='select2-chosen'])[9]")
	private WebElement selectvendor2;
	@FindBy(how = How.XPATH, using = "(//span[@class='select2-chosen'])[10]")
	private WebElement selectvendor3;
	@FindBy(how = How.XPATH, using = "(//span[@class='select2-chosen'])[11]")
	private WebElement selectvendor4;
	@FindBy(how = How.XPATH, using = "(//span[@class='select2-chosen'])[12]")
	private WebElement selectMarketingDomain;
	@FindBy(how = How.CSS, using = "input[class='btn btn-primary']")
	private WebElement clickOnSave;
	// ----------------------------------Prepaid
	// Client----------------------------------------------
	@FindBy(how = How.ID, using = "client_first_name")
	private WebElement enterFirstName;
	@FindBy(how = How.ID, using = "client_last_name")
	private WebElement enterLastName;
	@FindBy(how = How.ID, using = "client_password")
	private WebElement enterPassword;
	@FindBy(how = How.ID, using = "client_email")
	private WebElement enterEmail;
	@FindBy(how = How.ID, using = "client_phone")
	private WebElement enterMobile;
	@FindBy(how = How.ID, using = "client_name")
	private WebElement enterBuisnessName;
	@FindBy(how = How.XPATH, using = "//span[text()='Developer']")
	private WebElement selectBuisnessType;
	@FindBy(how = How.XPATH, using = "//span[text()='Real Estate']")
	private WebElement selectIndustry;
	@FindBy(how = How.ID, using = "client_website")
	private WebElement enterWebsite;
	@FindBy(how = How.XPATH, using = "//span[text()='Default Custom']")
	private WebElement selectPlan;
	@FindBy(how = How.ID, using = "rc-anchor-container")
	private WebElement tikOnRobot;
	@FindBy(how = How.CSS, using = ".btn.btn-primary.save")
	private WebElement clickOnSignup;
	@FindBy(how = How.CSS, using = ".select2-result-label")// 0-> Deveploper || 1 -> Broker
	private List<WebElement> selectDropdown;               //RealEstate , Education, BFSI ,Generic
	@FindBy(how = How.XPATH, using = "//iframe[@title='reCAPTCHA']")
	private WebElement frameSwitch;
	
	public void createClient() {
		jsClick(addClientButton);
		waitUntilVisiblity(firstName);
		firstName.sendKeys(random("firstName", "AN", 7));
		lastName.sendKeys(random("lastName", "AN", 7));
		buisnessName.sendKeys(random("buisnessName", "AN", 7));
		buisnessType.click();
		selectbuisnessType.click();
		shortName.sendKeys(random("shortName", "AN", 7));
		clientWebsite.sendKeys("https://" + random("clientWebsite", "AN", 7) + ".com");
		clientEmail.sendKeys("" + random("clientEmail", "AN", 7) + "@sell.do");
		uploadFile.sendKeys(System.getProperty("user.dir") + "/DataFile/nun.jpg");
		clientPhone.sendKeys("+91 " + "9" + random("clientPhone", "N", 9) + "");
		mask.sendKeys(random("mask", "AN", 6));
		clientAddress.sendKeys("Pune");
		selectByIndex(clientCountry, 1);
		selectByIndex(clientState, 2);
		clientCity.sendKeys("Puhne");
		clientZip.sendKeys("414003");
		userFirstName.sendKeys(random("userFirstName", "AN", 7));
		userLastName.sendKeys(random("userLastName", "AN", 7));
		userPhone.sendKeys("+91 " + "9" + random("userPhone", "N", 9) + "");
		userEmail.sendKeys("" + random("userEmail", "AN", 7) + "+@sell.do");
		userTeam.sendKeys(random("userTeam", "AN", 7));
		scrollIntoView(driver.findElement(By.id("s2id_autogen14")));
		selectvendor1.click();
		selectvendor.click();
		selectvendor2.click();
		selectvendor.click();
		selectvendor3.click();
		selectvendor.click();
		selectvendor4.click();
		selectvendor.click();
		selectMarketingDomain.click();
		selectvendor.click();
		clickOnSave.click();
	}

	public void createClient2() {
		driver.get(getGobalData().getProperty("PrepaidClient"));
		enterFirstName.sendKeys(random("enterFirstName","A",7));
		enterLastName.sendKeys(random("enterLastName","A",7));
		enterPassword.sendKeys(random("enterPassword","AN",10));
		enterEmail.sendKeys("" + random("enterEmail", "AN", 7) + "@sell.do");
		enterMobile.sendKeys("+91 " + "9" + random("enterMobile", "N", 9) + "");
		scrollIntoView(enterBuisnessName);
		enterBuisnessName.sendKeys(random("enterBuisnessName", "AN", 7));
		(selectBuisnessType).click();;
		(selectDropdown.get(0)).click();;
		(selectIndustry).click();;
		(selectDropdown.get(0)).click();;
		enterWebsite.sendKeys("https://" + random("clientWebsite", "AN", 7) + ".com");
		(clickOnSignup).click();
		wait(100000);		
	}
	
}
