package com.selldo.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import selldo.POM.LoginAsClient;
import selldo.POM.loginPage;

public class BaseTest {
	public WebDriver driver;
	public Properties prop;
	public ExtentReports extent; 
	public  ExtentTest test;
	public LoginAsClient client;
	

	@BeforeMethod(alwaysRun = true)
	public void browserConfig() throws FileNotFoundException, IOException {
		
		getReportObject();
		prop = new Properties();
		prop.load(new FileInputStream(System.getProperty("user.dir") + "/config.properties"));
		WebDriverManager.chromedriver().setup();

		if (prop.getProperty("browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		}
		loginPage A =new loginPage(driver);
		 client= A.login();
		
		 
	}

	@AfterMethod(alwaysRun = true)
	public void terminate() {
		driver.quit();
	}

	public String getScreenshot(String fileName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		File filee = new File(System.getProperty("user.dir") + "//reports//" + fileName + ".png");
		FileUtils.copyFile(file, filee);
		return System.getProperty("user.dir") + "//reports//" + fileName + ".png";
	}

	public  ExtentReports getReportObject() {

		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(System.getProperty("user.dir") + "/config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// -----------------------------------------------------------------------------
		String path = System.getProperty("user.dir") + "//reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		// reporter.config().setChartVisibilityOnOpen(true);
		// reporter.config().setTestViewChartLocation(ChartLocation.TOP);
		reporter.config().setTheme(Theme.STANDARD);

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Aniket");
		extent.setSystemInfo("OS", "Linux");
		extent.setSystemInfo("Host Name", "selldoTest-ThinkCentre-A85");
		extent.setSystemInfo("Environment", prop.getProperty("url"));
		extent.setSystemInfo("User Name", "amura");
		return extent;
	}


	
}
