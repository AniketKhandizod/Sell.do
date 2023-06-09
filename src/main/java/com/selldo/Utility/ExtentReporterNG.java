package com.selldo.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterNG  {

	
	public static ExtentReports getReportObject()
	{
		
		
		
		Properties  prop = new Properties();
		try {
			prop.load(new FileInputStream(System.getProperty("user.dir")+"/config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//-----------------------------------------------------------------------------
		String path =System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Sell.do CRM");
		reporter.config().setDocumentTitle("Test Results");
		reporter.config().setTheme(Theme.DARK);		
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Aniket");
		extent.setSystemInfo("OS", "Linux");
		extent.setSystemInfo("Host Name", "selldoTest-ThinkCentre-A85");
		extent.setSystemInfo("Environment", prop.getProperty("url"));
		extent.setSystemInfo("User Name", "amura");
		return extent;
		
		
		
//

		
		
	}
}
