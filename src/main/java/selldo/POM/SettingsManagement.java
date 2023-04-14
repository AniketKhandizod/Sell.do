package selldo.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.Utility.ReusableUtils;

public class SettingsManagement extends ReusableUtils {

	public WebDriver driver;

	public SettingsManagement(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "user-mngmnt")
	private WebElement leadManagement;
	@FindBy(how = How.CSS, using = ".card-body")
	private List< WebElement> allMenue;

}
