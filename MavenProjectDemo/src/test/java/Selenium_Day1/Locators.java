package Selenium_Day1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		//ChromeOptions options=new ChromeOptions();
	
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		
//1.To verify the Logo is displayed or Not and it return type should be boolean
		boolean Status=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(Status);
		
//2.Linktext and Partial Linktext
		
   // driver.findElement(By.linkText("Tablets")).click();  //full text we need to pass
   driver.findElement(By.partialLinkText("Table")).click();  // partial linktext is fine but mostly not preferable
     
   
 //3.ClassName Group of Elements
     List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
     System.out.println("total number of header links: "+headerLinks.size());
     
     //tagName Group of Elements
 
     List<WebElement> links=driver.findElements(By.tagName("a"));
     System.out.println("total nmber of links:"+links.size());
     
     List<WebElement> images=driver.findElements(By.tagName("img"));
     System.out.println("total number of images:"+ images.size());
	}

}
