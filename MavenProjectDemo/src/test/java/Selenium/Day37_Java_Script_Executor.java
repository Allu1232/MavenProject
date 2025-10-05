package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class Day37_Java_Script_Executor {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--incognito");
     WebDriver driver=new ChromeDriver(options);

     driver.get("https://testautomationpractice.blogspot.com/");
     driver.manage().window().maximize();
     WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
     // passing the text into inputbox alternate of sendKeys()
     JavascriptExecutor js=(JavascriptExecutor) driver; //JavascriptExecutor js-driver;
     js.executeScript("arguments[0].value='John')", inputbox);
     WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
     js.executeScript("arguments[0].click()", radiobtn);
     }
	}

