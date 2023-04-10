package com.selldo.POM.adminPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selldo.Utility.ReusableUtils;

public class DocumentsPage extends ReusableUtils {

	public WebDriver driver;

	public DocumentsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.CSS, using = "#back-button")
	private WebElement backButton;
	@FindBy(how = How.CSS, using = "#new_folder_form input[value=\"Create New Folder\"]")
	private WebElement createFolderButton;
	@FindBy(how = How.CSS, using = "input[placeholder=\"Search by file name\"]")
	private WebElement searchFileField;
	@FindBy(how = How.CSS, using = "a.btn.btn-primary.asset_search_term_btn")
	private WebElement searchButton;
	@FindBy(how = How.CSS, using = "div.btn.btn-outline-primary.fileinput-button")
	private WebElement uploadButton;
	@FindBy(how = How.CSS, using = "div.asset-icon.asset-icon-image")
	private WebElement fileDoc;
	@FindBy(how = How.CSS, using = "a[title='Delete']")
	private WebElement delete;
	@FindBy(how = How.XPATH, using = "//input[@type='file']")
	private WebElement brows;

	public void backToFolder() {

		backButton.click();
	}

	public void searchFile(String fileName) throws Exception {

		searchFileField.sendKeys(fileName);
		searchButton.click();
		Thread.sleep(1000);
	}

	public void uploadFile() {

		uploadButton.click();
	}

	public void deleteFile(String fileName) throws InterruptedException {

		Thread.sleep(3000);		
		moveToElement(fileDoc);
		delete.click();
		driver.switchTo().alert().accept();

	}

	public void upload() throws Exception {

		String claimZIP = System.getProperty("user.dir") + "/DataFile/" + "google-new-logo.png";
		// pass the path of the file to be uploaded using Sendkeys method
		brows.sendKeys(claimZIP);

	}

}
