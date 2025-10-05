package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Day29_Handle_Authenticates_Popup {

	public static void main(String[] args) throws InterruptedException {
   WebDriver driver=new ChromeDriver();
		   
		  // driver.get("http://the-internet.herokuapp.com/basic_auth");  // here we need to manually pass the username and password;	
         driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth"); //we are passing username & pwd on the url
	Thread.sleep(5000);
	
	Boolean status=driver.findElement(By.xpath("//div/h3[text()='Basic Auth']")).isDisplayed();
	System.out.println(status);
	}

}
