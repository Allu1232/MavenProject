package Selenium;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Day38_Take_Screenshot {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.get("https://demo.nopcommerce.com/");
		   driver.manage().window().maximize();
		  
		   //1) full page screenshot 
		   
		/*  TakesScreenshot ts=(TakesScreenshot) driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		// File targetfile=new File(System.getProperty("User.dir")+"\\Screenshots\\fullpage1.png");
		File targetfile=new File("C:\\Automation\\MavenProjectDemo\\Screenshots\\fullpage1.png");
		  srcfile.renameTo(targetfile);*/
		  
		   //2)Capture the Screenshot for Specific Section
		 /* WebElement featureProduct=driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]"));
		  File srcfile=featureProduct.getScreenshotAs(OutputType.FILE);
			File targetfile=new File("C:\\Automation\\MavenProjectDemo\\Screenshots\\featureProduct.png");
			  srcfile.renameTo(targetfile);*/
			  
			//3)Capture the Screenshot for webelement
			  WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
			  File srcfile=logo.getScreenshotAs(OutputType.FILE);
				File targetfile=new File("C:\\Automation\\MavenProjectDemo\\Screenshots\\logo.png");
				  srcfile.renameTo(targetfile);//img[@alt='nopCommerce demo store']
	}

}
