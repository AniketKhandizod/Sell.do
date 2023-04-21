package com.selldo.Utility;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableUtils {

	private WebDriver driver;
	private FileWriter writer;
	private BufferedWriter buffer;

	protected ReusableUtils(WebDriver driver) {
		this.driver = driver;
	}

	protected Properties getGobalData() {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(System.getProperty("user.dir") + "/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

// --------------------------Wait ------------------------
	protected WebElement waitUntilVisiblity(WebElement we) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(we));
		return we;
	}
	protected WebElement waitUntilInvisibility(WebElement we) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(we));
		return we;
	}
	protected List<WebElement> waitUntilVisibilityOfElements(List<WebElement> we) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElements(we));
		return we;
	}
	protected void waitElementToBeClickable(WebElement we) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(we)));
	}

	protected void wait(int value) {
		try {
			Thread.sleep(value);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
//-------------------------------- Action ----------------------

	protected void HoverAndClick(WebDriver driver, WebElement elementToHover, WebElement elementToClick) {
		Actions action = new Actions(driver);
		action.moveToElement(elementToHover).click(elementToClick).build().perform();
	}

	protected void moveToElement(WebElement we) {
		Actions actions = new Actions(driver);
		actions.moveToElement(we).build().perform();
	}

	protected void moveToElementClick(WebElement we) {
		Actions actions = new Actions(driver);
		actions.moveToElement(we).click().build().perform();
	}

	protected void moveToAndEnter(WebElement we) {
		Actions actions = new Actions(driver);
		actions.moveToElement(we);
		actions.click();
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
	}

	protected void moveToAndEnter(WebElement we, String value) {
		Actions actions = new Actions(driver);
		actions.moveToElement(we).click().sendKeys(value).sendKeys(Keys.ENTER).build().perform();
		;

	}

	protected void moveToAndSendKeyEnter(WebElement we, String s) {
		Actions actions = new Actions(driver);
		actions.moveToElement(we);
		actions.click();
		actions.sendKeys(s);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
	}

	protected void moveToAndSendKey(WebElement we, String s) {
		Actions actions = new Actions(driver);
		actions.moveToElement(we);
		actions.click();
		actions.sendKeys(s);
		actions.build().perform();
	}

	protected void scrollAction(WebElement we, WebElement we2) {
		Actions actions = new Actions(driver);
		actions.moveToElement(we);
		actions.scrollToElement(we2);
		actions.build().perform();
	}

	protected void moveToAndSendEnter(WebElement we) {
		Actions actions = new Actions(driver);
		actions.moveToElement(we);
		actions.click();
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
	}

	protected void move2click(WebElement we, WebElement we2) {
		Actions actions = new Actions(driver);
		actions.moveToElement(we);
		actions.moveToElement(we2);
		actions.click();
		actions.build().perform();
	}

	protected void move2click(WebElement we, int value) {
		Actions actions = new Actions(driver);
		actions.moveToElement(we);
		actions.build().perform();

		driver.findElement(By.cssSelector(
				"body > div.main-nav-container > div.sub-navigation-bar > div:nth-child(1) > div:nth-child(" + value
						+ ") > a"))
				.click();
	}

//-------------------JavascriptExecutor---------------- 
	protected void scrollIntoView(WebElement we) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", we);
	}

	protected void scrollBy(int scroll) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + scroll + ")", "");
	}

	protected void jsClick(WebElement we) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", we);
	}

	protected void scrollHeight() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	protected  void Square(WebElement we) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid #C7FF33'", we);
	}

// ----------------Select ------------------
	protected void selectByIndex(WebElement we, int index) {
		Select oSelect = new Select(we);
		oSelect.selectByIndex(index);
	}

	protected void selectByVisibleText(WebElement we, String index) {
		Select oSelect = new Select(we);
		oSelect.selectByVisibleText(index);
	}
// -------------------------RANDOME-------------------------------

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
			writer = new FileWriter(System.getProperty("user.dir") + "/Random Values/" + method + " value" + ".txt");
			buffer = new BufferedWriter(writer);
			buffer.write("for : " + method + " : " + Return);
			buffer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Return;

	}

	// -----------------------Switching frame-------------------
	protected void frameSwitch(int value) {
		driver.switchTo().frame(value);
	}

	protected void frameSwitch(String value) {
		driver.switchTo().frame(value);
	}

	protected void frameSwitch(WebElement value) {
		driver.switchTo().frame(value);
	}

	protected void defaultContentSwitch() {
		driver.switchTo().defaultContent();
	}

//--------------Other------------------------------------------------
	protected void refresh() {
		driver.navigate().refresh();
	}

}
