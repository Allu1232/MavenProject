package Selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Day27_WebDriver_Waiting_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));     //Implict Wait Declaration
		
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));  //Explicit Wait Declaration
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement txtusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Usename']")));
     txtusername.sendKeys("Admin");
     
   
	   WebElement txtpassword=mywait.until(ExpectedConditions.visibilityOfElementLocated( By.xpath("//input[@placeholder='password']")));
	   txtpassword.sendKeys("admin123");
	    WebElement logbtn=mywait.until(ExpectedConditions.elementToBeClickable( By.xpath("//button[normalize-space()='Login']")));
	    logbtn.click();
	
	driver.close();
	}

}
