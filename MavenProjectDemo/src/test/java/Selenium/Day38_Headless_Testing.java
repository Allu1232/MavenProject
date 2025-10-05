package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class Day38_Headless_Testing {

	public static void main(String[] args) {
      //1) launch the browser
		ChromeOptions options=new ChromeOptions();  //headless Testing
		options.addArguments("--headless=new");
		
		
		WebDriver driver=new ChromeDriver(options);
		//WebDriver driver=new EdgeDriver();
		
		//2) open URL https://demo.opencart.com/
		
		driver.get("https://demo.opencart.com/");
		
		//3) validate the title of the web app ("your store")
		
		String act_title=driver.getTitle();
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		driver.quit();
	}

}
