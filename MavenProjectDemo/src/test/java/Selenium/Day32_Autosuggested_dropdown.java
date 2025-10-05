package Selenium;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day32_Autosuggested_dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https:www.google.com");
		
	driver.manage().window().maximize();	   
	//Login steps
	driver.findElement(By.name("q")).sendKeys("selenium");
	
	List<WebElement> opt=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
        System.out.println(opt.size());
        
        
       for(WebElement op:opt) {
    	   String list=op.getText();
    	   if(op.getText().equals("selenium")) {
    		   Thread.sleep(5000);
    		   op.click();
    		   break;
    	   }
    	   		
       }

}}
