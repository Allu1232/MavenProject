package Selenium;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day29_Handle_Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
    //driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	
		
		//1.Click on alert and fetch the text
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		         //Alert myalert=driver.switchTo().alert();
		         //System.out.println(myalert.getText());
		         //myalert.accept();
		
		//2.Confirmation alert ok & Cancel
		     // driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		     //driver.switchTo().alert().accept();  //close alert using ok button
		     // driver.switchTo().alert().dismiss();  //close alert using cancel button
		
		//3.Prompt Alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		WebDriverWait mywait=new WebDriverWait (driver,Duration.ofSeconds(10));
        Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());
		
		
		
		//Alert myalert=driver.switchTo().alert();
        
        myalert.sendKeys("Siva");
        myalert.accept();
	}

}
