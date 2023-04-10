package com.selldo.POM.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.Utility.ReusableUtils;

public class PushToSalesPage extends ReusableUtils {
	public WebDriver driver;

	public PushToSalesPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//span[text()='Select team']")
	private WebElement SelectTeamDropdown;
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-drop']/div/input")
	private WebElement SelectTeamTextField;
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-drop']/ul/li/div")
	private WebElement TeamFromDropdown;
	@FindBy(how = How.XPATH, using = "//span[text()='Select sales']")
	private WebElement SelectUserDropdown;
	@FindBy(how = How.XPATH, using = ".//*[@id='select2-drop']/div/input")
	private WebElement SelectUserTextField;
	@FindBy(how = How.XPATH, using = "//div[@class='select2-result-label']")
	private WebElement UserFromDropdown;
	@FindBy(how = How.XPATH, using = "//button[text()='Push to Sales']")
	private WebElement PushButton;

	// Selecting Team of user to which lead is to be pushed
	public void selectTeam(String teamName) throws InterruptedException {
		SelectTeamDropdown.click();
		// Clicking on Team dropdown
		System.out.println("a");
		Thread.sleep(3000);
		SelectTeamTextField.sendKeys(teamName);// Typing
												// team name
		System.out.println("b");
		TeamFromDropdown.click();// Selecting Team from
									// dropdown
		System.out.println("c");
	}

	// Selecting User to which lead is to be pushed
	public void selectUser(String userName) throws InterruptedException {
		SelectUserDropdown.click();// Clicking on User
									// dropdown
		System.out.println("d");
		SelectUserTextField.sendKeys(userName);// Typing
												// team name
		System.out.println("e");
		Thread.sleep(2000);
		UserFromDropdown.click();// Selecting User from
									// dropdown
		System.out.println("f");
	}

	// Clicking on Push button
	public void clickOnPushButton() {
		PushButton.click();
		;
	}
}
