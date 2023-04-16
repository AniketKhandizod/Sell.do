package selldo.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.Utility.ReusableUtils;

public class SideBar extends ReusableUtils {

	public WebDriver driver;

	public SideBar(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "main-menu-lead-management")
	private WebElement leadManagement;
	@FindBy(how = How.ID, using = "main-menu-bookings-management")
	private WebElement bookings_management;
	@FindBy(how = How.ID, using = "main-menu-conversations")
	private WebElement conversations;
	@FindBy(how = How.ID, using = "main-menu-tasks")
	private WebElement tasks;
	@FindBy(how = How.ID, using = "main-menu-reports")
	private WebElement reports;
	@FindBy(how = How.ID, using = "main-menu-products-services")
	private WebElement products_services;
	@FindBy(how = How.ID, using = "main-menu-automation")
	private WebElement automation;
	@FindBy(how = How.ID, using = "main-menu-assets")
	private WebElement assets;
	@FindBy(how = How.ID, using = "main-menu-settings")
	private WebElement settings;
	@FindBy(how = How.ID, using = "main-menu-signin")
	private WebElement signin;
	@FindBy(how = How.ID, using = "release_notes_link_container")
	private WebElement release_notes_link_container;
	@FindBy(how = How.ID, using = "//*[@id='s2id_id_signin']/a/span[1]")
	private WebElement clickOnUserSearch;
	@FindBy(how = How.ID, using = "//*[@id='select2-drop']/div/input")
	private WebElement enterUserName;
	@FindBy(how = How.ID, using = "//*[@id='select2-drop']/ul/li/div")
	private WebElement selectSuggation;
	@FindBy(how = How.ID, using = "//*[.='Login']")
	private WebElement click;

	// ---------------------LeadManagement------------------------
	@FindBy(how = How.ID, using = "//a[.='Dashboard']")
	private WebElement dashBord;
	@FindBy(how = How.ID, using = "/html/body/div[3]/div[2]/div[1]/div[3]/a")
	private WebElement newLead;
	@FindBy(how = How.ID, using = "//a[.='All Leads']")
	private WebElement allLead;
	@FindBy(how = How.ID, using = "//a[.='Contact New Leads']")
	private WebElement contactNewLead;

	public void leadManagement() {
		(leadManagement).click();

	}

	public void bookings_management() {
		(bookings_management).click();

	}

	public void conversations() {
		(conversations).click();

	}

	public void tasks() {
		(tasks).click();

	}

	public void reports() {
		(reports).click();

	}

	public void products_services() {
		(products_services).click();

	}

	public void automation() {
		(automation).click();

	}

	public void assets() {
		(assets).click();

	}

	public void settings() {
		(settings).click();

	}

	public void signin(String userName) {
		(signin).click();
		driver.findElement(By.xpath("//*[@id='s2id_id_signin']/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li/div")).click();
		driver.findElement(By.xpath("//*[.='Login']")).click();
	}

	public void release_notes_link_container() {
		(release_notes_link_container).click();
	}

	public void movieleadManagement() {
		moveToElement(leadManagement);
	}

	public void moviebookings_management() {
		moveToElement(bookings_management);
	}

	public void movieconversations() {
		moveToElement(conversations);
	}

	public void movietasks() {
		moveToElement(tasks);
	}

	public void moviereports() {
		moveToElement(reports);
	}

	public void movieproducts_services() {
		moveToElement(products_services);
	}

	public void movieautomation() {
		moveToElement(automation);
	}

	public void movieassets() {
		moveToElement(assets);
	}

	public void moviesettings() {
		moveToElement(settings);
	}

	public void moviesignin() {
		moveToElement(signin);
	}

	public void movierelease_notes_link_container() {
		moveToElement(release_notes_link_container);
	}

	public void clickDashBord() {
		waitUntilVisiblity(dashBord);
		dashBord.click();
	}

	public void clicknewLead() {
		
//		System.out.println("kasfhb");
//		moveToElement(leadManagement);
//		System.out.println("kasfhb");
//		frameSwitch(driver.findElement(By.id("HW_frame"))) ;
//		newLead.click();;
//		System.out.println("kasfhb");

		move2click(leadManagement,4);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public void clickallLead() {
		waitUntilVisiblity(allLead);
		allLead.click();
	}

	public void clickcontactNewLead() {
		waitUntilVisiblity(contactNewLead);
		contactNewLead.click();
	}

}
