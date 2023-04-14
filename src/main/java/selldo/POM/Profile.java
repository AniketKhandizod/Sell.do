package selldo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.Utility.ReusableUtils;

public class Profile extends ReusableUtils{
	public WebDriver driver;

	public Profile(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.ID, using = "user-account-icon")
	private WebElement profile;
	@FindBy(how = How.ID, using = "item-edit-profile")
	private WebElement editProfile;
	@FindBy(how = How.ID, using = "item-change-password")
	private WebElement changePassword;
	@FindBy(how = How.CSS, using = "[ubts='Help']")
	private WebElement help;
	@FindBy(how = How.ID, using = "user_logout")
	private WebElement logout;
	
	public void editProfile() {
		moveToElementClick(profile);
		moveToElementClick(editProfile);
	}
	public void changePassword() {
		moveToElementClick(profile);
		moveToElementClick(changePassword);
	}
	public void help() {
		moveToElementClick(profile);
		moveToElementClick(help);
	}
	public void logout() {
		moveToElementClick(profile);
		moveToElementClick(logout);
	}
}
