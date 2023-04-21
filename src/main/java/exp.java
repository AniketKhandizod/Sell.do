import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.selldo.Utility.ReusableUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exp extends ReusableUtils {

	static WebDriver driver;

	protected exp(WebDriver driver) {
		super(driver);
	}
	public void m1() {
		
		new exp(driver);
		WebElement we =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		Square(we);
		WebElement we2 =driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		Square(we2);
		we2.sendKeys("ekfbekfh");
		we2.sendKeys(Keys.ENTER);
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		exp a = new exp(driver);
		a.m1();
		
		Robot rb = new Robot();
		WebElement element =driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div[2]/g-section-with-header/div[4]/g-more-link/a/div"));
		Point point = element.getLocation();
	    System.out.println(point.getX() +"  "+ point.getY());
		rb.mouseMove(point.getX()+100, point.getY()+155);
		Thread.sleep(4000);
		//rb.mouseWheel(10000);
		
		Actions ac = new Actions(driver);
		ac.moveByOffset(point.getX(), point.getY());
		ac.click().build().perform();
		
		
	}

}
