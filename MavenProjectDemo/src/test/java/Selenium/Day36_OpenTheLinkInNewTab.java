package Selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Day36_OpenTheLinkInNewTab {
	public static void main(String []args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	WebElement regLink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
	Actions act=new Actions (driver);
	
	//Control+Reglink
	act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
	//switching to registration page
	List<String> ids=new ArrayList(driver.getWindowHandles());
	
	driver.switchTo().window(ids.get(1)); // switch to registration page
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys ("John KENEDY");
	//Home page
	driver.switchTo().window(ids.get(0)); // switch to home page
	driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("TShirts");
	
	
	//Open in New TAB & Window
	driver.switchTo().newWindow(WindowType.TAB);
	driver.switchTo().newWindow(WindowType.WINDOW);
}
}