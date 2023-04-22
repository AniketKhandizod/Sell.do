package com.selldo.Utility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import selldo.POM.LoginAsClient;
import selldo.POM.loginPage;

public class BaseTest {
	public WebDriver driver;
	public Properties prop;
	public LoginAsClient client;
	public FileWriter writer;
	public BufferedWriter buffer;

	@BeforeSuite(alwaysRun = true)
	public void ObjectInvokder() throws IOException {
		writer = new FileWriter(System.getProperty("user.dir") + "/Random Values/value.txt", true);
		buffer = new BufferedWriter(writer);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");//yyyy/MM/dd
		LocalDateTime now = LocalDateTime.now();
		buffer.newLine();
		buffer.write("===========================================================");
		buffer.newLine();
		buffer.write("------------------"+dtf.format(now)+"----------------------");
		buffer.newLine();
		buffer.write("⇓ ⇟ ⇩ ⇓ ⇟ ⇩ ⇓ ⇟ ⇩ ⇓ ⇟ ⇩ ⇓ ⇟ ⇩ ⇓ ⇟ ⇩ ⇓ ⇟ ⇩ ⇓ ⇟ ⇩ ⇓ ⇟ ⇩ ⇓ ⇟ ⇩ ");
		buffer.newLine();
	}

	@AfterSuite(alwaysRun = true)
	public void ObjectSupressor() throws IOException {
		buffer.close();
	}

	@BeforeMethod(alwaysRun = true)
	public void browserConfig() throws FileNotFoundException, IOException {

		// -------------------Property Files-------------------//
		prop = new Properties();
		prop.load(new FileInputStream(System.getProperty("user.dir") + "/config.properties"));

		// -------------------WebDriver-------------------//
		WebDriverManager.chromedriver().setup();

		if (prop.getProperty("browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		loginPage A = new loginPage(driver);
		client = A.login();

	}

	@AfterMethod(alwaysRun = true)
	public void terminate() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}

	public String getScreenshot(String fileName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		File filee = new File(System.getProperty("user.dir") + "//reports//" + fileName + ".png");
		FileUtils.copyFile(file, filee);
		return System.getProperty("user.dir") + "//reports//" + fileName + ".png";
	}

	protected String random(String method, String choise, int size) {
		String Return = "";
		switch (choise) {
		case "AN":
			Return = RandomStringUtils.randomAlphanumeric(size);
			break;// pX4Mv3KsJU
		case "A":
			Return = RandomStringUtils.randomAlphabetic(size);
			break;// ZLTRqGyuXk
		case "R":
			Return = RandomStringUtils.random(size);
			break;// 嚰险걻鯨贚䵧縓
		case "N":
			Return = RandomStringUtils.randomNumeric(size);
			break;// 3511779161
		default:
			break;
		}

		try {
			buffer.write("for : " + method + " : " + Return);
			buffer.newLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Return;
	}
	protected String R(char []arr) {
		return RandomStringUtils.random(1, arr);
	}
	
}
