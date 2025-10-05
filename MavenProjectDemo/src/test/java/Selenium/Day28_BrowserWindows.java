package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day28_BrowserWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	driver.manage().window().maximize();	   
	    driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	   Set<String> windowIDS= driver.getWindowHandles();
	   System.out.println(windowIDS);
	   
	   //Approach-1
	  /* List<String> windowList=new ArrayList(windowIDS);
	   String child=windowList.get(0);
	   String parent=windowList.get(1);
	   
	   driver.switchTo().window(child);
	   System.out.println(driver.getTitle());
	   
	   driver.switchTo().window(parent);
	   System.out.println(driver.getTitle());*/
	   
	   //Approach-2
	   for(String winID:windowIDS) {
		   String Title=driver.switchTo().window(winID).getTitle();
		   System.out.println(Title);
		   if(Title.equals("OrangeHRM") || Title.equals("Human Resources Management Software | OrangeHRM HR Software")) {
			   System.out.println(driver.getCurrentUrl());
			   
			   driver.close();
		   }
	   }


	   
	}

}
