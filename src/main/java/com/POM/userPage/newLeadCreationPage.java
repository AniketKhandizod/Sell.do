package com.POM.userPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.Utility.ReusableUtils;

public class newLeadCreationPage extends ReusableUtils {

	public WebDriver driver;

	public newLeadCreationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"pre_sales_profile\"]/div/div/div[2]/div/div[1]/form/ul/li[2]/a")
	private WebElement clickOnRequirement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"pre_sales_profile\"]/div/div/div[2]/div/div[1]/form/ul/li[3]/a")
	private WebElement clickOnPersonalDetail;
	@FindBy(how = How.XPATH, using = "//*[@id=\"pre_sales_profile\"]/div/div/div[2]/div/div[1]/form/ul/li[4]/a")
	private WebElement clickOnActivity;
	@FindBy(how = How.XPATH, using = "//*[@id=\"pre_sales_profile\"]/div/div/div[2]/div/div[1]/form/ul/li[1]/a")
	private WebElement clickOnBasicProfile;
	
	//---------------------BasicProfile-----------------
	
	@FindBy(how = How.XPATH, using = "//span[text()='Salutation']")
	private WebElement clickOnSalutation;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-drop\"]/div/input")
	private WebElement enterSalutation;
	@FindBy(how = How.XPATH, using = "(//*[@name='first_name'])[1]")
	private WebElement enterfirstName;
	@FindBy(how = How.XPATH, using = "(//*[@name='last_name'])[1]")
	private WebElement enterlastName;
	@FindBy(how = How.XPATH, using = "//select[@name='primary_email_type']")
	private WebElement selectOffice;
	@FindBy(how = How.XPATH, using = "//select[@name='primary_email_email']")
	private WebElement enterEmail;
	@FindBy(how = How.XPATH, using = "//select[@name='primary_phone_type']")
	private WebElement selectPhone;
	@FindBy(how = How.XPATH, using = "//select[@name='primary_phone_ph_number']")
	private WebElement enterPhone;
	@FindBy(how = How.CSS, using = "#s2id_autogen65 span")
	private WebElement selectTimeZone;
	@FindBy(how = How.XPATH, using = "(//span[@class='select2-chosen'])[22]")
	private WebElement selectCountry;
	@FindBy(how = How.CSS, using = "#s2id_autogen71 ul")
	private WebElement enterTags;
	@FindBy(how = How.CSS, using = "#s2id_autogen75 ul")
	private WebElement enterIntrestedProject;
	@FindBy(how = How.CSS, using = "#s2id_autogen73 span:first-of-type")
	private WebElement selectLeadStage;
	@FindBy(how = How.XPATH, using = "//*[@id='basic_info']/div[9]/div/label/text()")
	private WebElement tikOnPushLeadTOSale;
	@FindBy(how = How.XPATH, using = "//*[@id='s2id_autogen61']/a/span[1]")
	private WebElement selectTeam;
	@FindBy(how = How.XPATH, using = "//*[@id='s2id_autogen69']/a/span[1]")
	private WebElement selectCapmpain;
	@FindBy(how = How.XPATH, using = "//*[@id='s2id_autogen55']/a/span[1]")
	private WebElement selectSource;
	@FindBy(how = How.XPATH, using = "//*[@id='s2id_autogen112']/a/span[1]")
	private WebElement clickChannalPartner;
	@FindBy(how = How.XPATH, using = "//*[@id='select2-drop']/div/input")
	private WebElement enterChannalPartner;
	@FindBy(how = How.XPATH, using = "//*[@id='basic_info']/div[14]/a")
	private WebElement addChannalPartner;
	@FindBy(how = How.XPATH, using = "//*[@id='s2id_autogen57']/ul")
	private WebElement enterSiteVisitForProject;
	@FindBy(how = How.XPATH, using = "//*[@id='select2-drop']/ul/li[1]/div")
	private WebElement clickProjectDropdown;
	@FindBy(how = How.XPATH, using = "//*[@id='basic_info']/div[17]/div/div[2]/div/div[1]/input")
	private WebElement enterAddress;
	@FindBy(how = How.XPATH, using = "//*[@id='basic_info']/div[17]/div/div[2]/div/div[2]/input")
	private WebElement enterStreet;
	@FindBy(how = How.XPATH, using = "//*[@id='basic_info']/div[17]/div/div[3]/div/div[1]/select")
	private WebElement selectCountryandState;
	@FindBy(how = How.XPATH, using = "//*[@id='region_610876001']")
	private WebElement selectRegion;
	@FindBy(how = How.XPATH, using = "//*[@id='basic_info']/div[17]/div/div[4]/div/div[1]/input")
	private WebElement enterCity;
	@FindBy(how = How.XPATH, using = "//*[@id='basic_info']/div[17]/div/div[4]/div/div[2]/input")
	private WebElement enterZip;
	@FindBy(how = How.XPATH, using = "//*[@id='pre_sales_profile']/div/div/div[3]/div/button")
	private WebElement clickOnSave;


	public void ClickOnRequirement() {
		 clickOnRequirement.click();
	}
	public void ClickOnPersonalDetail() {
		 clickOnPersonalDetail.click();
	}
	public void ClickOnActivity() {
		 clickOnActivity.click();
	}
	public void ClickOnBasicProfile() {
		 clickOnBasicProfile.click();
	}
//-------------------Basic Details------------
	public void EnterSalutation(String value) {
		 clickOnSalutation.click();
		 enterSalutation.sendKeys(value);
	}
	public void EnterfirstName(String value) {
		 enterfirstName.sendKeys(value);
	}
	public void EnterlastName(String value) {
		 enterlastName.sendKeys(value);
	}
	public void SelectPrimaryEmail(int value) {
		selectByIndex(selectOffice,value);		 
	}
	public void EnterEmail(String value) {
		 enterEmail.sendKeys(value);
	}
	public void SelectPrimaryPhone(int value) {
		selectByIndex( selectPhone,value);
	}
	public void EnterPhone(String value) {
		 enterPhone.sendKeys(value);
	}
	public void SelectTimeZone(int value) {
		 selectTimeZone.click();
		 driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li["+value+"]/div")).click();
	}
	public void SelectCountry(int value) {
		 selectCountry.click();
		 driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li["+value+"]/div/div/div[2]")).click();
	}
	public void EnterTags(String value) {
		moveToAndEnter(enterTags,value);
	}
	public void EnterIntrestedProject(String value) {
		moveToAndEnter( enterIntrestedProject,value);
	}
	public void SelectLeadStage(String value) {
		 selectLeadStage.click();
		 driver.findElement(By.xpath("//*[@id='select2-drop'] //*[text()='"+value+"']")).click();
	}
	public void TikOnPushLeadTOSale() {
		 tikOnPushLeadTOSale.click();;
	}
	public void SelectTeam(String value) {
		 selectTeam.click();
		 driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys(value);
		 driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[1]/div")).click();
		 
	}
	public void SelectCapmpain(String value) {
		 selectCapmpain.click();
		 driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys(value);
		 driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[1]/div")).click();
	}
	public void SelectSource(String value) {
		 selectSource.click();
		 driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys(value);
		 driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[1]/div")).click();
	}
	public void enterChannalPartner(String value) {
		 clickChannalPartner.click();
		 enterChannalPartner.sendKeys(value);
		 driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[1]/div")).click();
	}
	
	public void clickAddChannalPartner() {
		 addChannalPartner.click();
	}
	public void EnterSiteVisitForProject(String value) {
		 enterSiteVisitForProject.sendKeys(value);;
		 clickProjectDropdown.click();
	}
	public void ClickProjectDropdown() {
		 
	}
	public void EnterAddress(String value) {
		 enterAddress.sendKeys(value);
	}
	public void EnterStreet(String value) {
		 enterStreet.sendKeys(value);
	}
	public void SelectCountryandState(int value) {
		selectByIndex( selectCountryandState,value);
	}
	public void SelectRegion(int value) {
		selectByIndex( selectRegion,value);
	}
	public void EnterCity(String value) {
		 enterCity.sendKeys(value);
	}
	public void EnterZip(String value) {
		 enterZip.sendKeys(value);
	}
	public void ClickOnSave() {
		 clickOnSave.click();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
