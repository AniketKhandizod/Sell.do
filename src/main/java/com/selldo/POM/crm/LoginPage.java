package com.selldo.POM.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.Utility.ReusableUtils;

public class LoginPage extends ReusableUtils {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "user_email")
	private WebElement Email;
	@FindBy(how = How.ID, using = "user_password")
	private WebElement Password;
	@FindBy(how = How.XPATH, using = "//*[@type='submit']")
	private WebElement SignIn;

	public void login(String myusername, String mypassword) {
		Email.sendKeys(myusername);// Taking email
		System.out.println("Taking email");
		Password.sendKeys(mypassword);// Taking password
		System.out.println("Taking password");
		SignIn.click();// Clicking on Sign in button
		System.out.println("Clicking on Sign In button");
	}

}
