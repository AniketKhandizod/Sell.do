package selldo.POM;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.Utility.ReusableUtils;

public class allLeadPage  extends ReusableUtils {
	public WebDriver driver;
	Set<String> arry;
	public allLeadPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//*[@id='leads-container']/tbody/tr/td[2]/div/a")
	private List<WebElement> leadID;
	@FindBy(how = How.XPATH, using = "//select[@name='page-select']")
	private WebElement selectPerLead30OR15;
	@FindBy(how = How.XPATH, using = "//span[text()='Next']")
	private WebElement clickOnNext;
	@FindBy(how = How.ID, using = "get_leads_count")
	private WebElement clickOnHashString;
	
	
	public List<WebElement> getLeadID() {
		 
		return leadID;
	}
	public void selectPerPageLead(int size) {
		scrollIntoView(clickOnNext);
		selectByVisibleText(selectPerLead30OR15,""+size+""); //15 OR 30
	}
	public void clickOnNext() {
		scrollIntoView(clickOnNext);
		jsClick(clickOnNext);
	}
	public void clickOnHashString() {
		jsClick(clickOnHashString);
	}
	
	
	
}
