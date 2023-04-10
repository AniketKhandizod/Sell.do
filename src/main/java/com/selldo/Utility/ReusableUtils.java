package com.selldo.Utility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableUtils {

	WebDriver driver;

	public ReusableUtils(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement waitUntilVisiblity(WebElement we) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(we));
		return we;
	}

	public void waitElementToBeClickable(WebElement we) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(we)));
	}

	public void HoverAndClick(WebDriver driver, WebElement elementToHover, WebElement elementToClick) {
		Actions action = new Actions(driver);
		action.moveToElement(elementToHover).click(elementToClick).build().perform();
	}

	public void moveToElement(WebElement we) {
		Actions actions = new Actions(driver);
		actions.moveToElement(we).build().perform();
	}
	public void moveToAndSendKey(WebElement we,String s) {
		Actions actions = new Actions(driver);
		actions.moveToElement(we);
		actions.click();
		actions.sendKeys(s);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
	}
	public void moveToAndSendEnter(WebElement we ){
		Actions actions = new Actions(driver);
		actions.moveToElement(we);
		actions.click();
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
	}

	public void scrollIntoView(WebElement we) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", we);
	}

	public void scrollBy(int scroll) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + scroll + ")", "");
	}
	public void jsClick(WebElement we) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", we);
	}
	public void scrollHeight() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void selectByIndex(WebElement we, int index) {
		Select oSelect = new Select(we);
		oSelect.selectByIndex(index);
	}
	public void selectByVisibleText(WebElement we, String index) {
		Select oSelect = new Select(we);
		oSelect.selectByVisibleText(index);
	}
}
