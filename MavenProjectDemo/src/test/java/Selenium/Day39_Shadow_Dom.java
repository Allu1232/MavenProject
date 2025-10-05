package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day39_Shadow_Dom {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("#input")).sendKeys("WELCOME"); //NoSuchElementException
		
		//Hnadle shaow dom element
		SearchContext shadow= driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#input")).sendKeys("WELCOME");
		//--------------------------------------------------------------------------
		//3) This Element is inside 3 nested shadow DOM.
		/*SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot(); Thread.sleep(1000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot(); Thread.sleep(1000);
		SearchContext shadow2 = shadow1.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot(); Thread.sleep(1000);
		shadow2.findElement(By.cssSelector("#multi-nested-shadow-element"));*/
		}
}
