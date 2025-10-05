package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day26_Conditional_Methods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.nopcommerce.com/register");
	driver.manage().window().maximize();
	//isDisplayed
	boolean status=driver.findElement(By.xpath("//div[@class=\'header-logo\']//img")).isDisplayed();
	System.out.println(status);
	//isEnabled
	boolean status1=driver.findElement(By.xpath("//input[@name='q']")).isEnabled();
	System.out.println(status1);
	
	//isSelected
	WebElement male=driver.findElement(By.id("gender-male"));
	WebElement female=driver.findElement(By.id("gender-female"));
	System.out.println("Before Selection");
	System.out.println(male.isSelected());
	System.out.println(female.isSelected());
	
	System.out.println("After Selection");
	male.click();
	System.out.println(male.isSelected());
	System.out.println(female.isSelected());
	
	WebElement status2=driver.findElement(By.xpath("//input[@name='Newsletter' and @id='Newsletter']"));
	System.out.println(status2.isSelected());
	
	//browser methods
		driver.quit();
		
	    
	}

}
