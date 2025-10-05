package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day_25_GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//1.get method
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	    System.out.println(driver.getTitle());
	    //2.getCurrentUrl
	    System.out.println(driver.getCurrentUrl());
	    //3.getPageSource
	   // System.out.println(driver.getPageSource());
	    //4.getWindowHandle--returns id of the 1 window
//  String windowid=driver.getWindowHandle();
// System.out.println("Window ID:"+ windowid);
	    Thread.sleep(5000);
	   // driver.findElement(By.xpath("//div[@class='orangehrm-copyright-wrapper']//a")).click();
	   
	    driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	   Set<String> windowIDS= driver.getWindowHandles();
	   System.out.println(windowIDS);
	   
	   driver.quit();
	}

}
