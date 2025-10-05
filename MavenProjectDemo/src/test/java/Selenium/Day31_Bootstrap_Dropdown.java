package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day31_Bootstrap_Dropdown {

	public static void main(String[] args) throws InterruptedException {
    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex.64.0");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[containbs(@class, 'multiselect')]")); // opens dropdown
		
	//select single option
		//driver.findElement(By.xpath("//input[@value='java']")).click();
	
		//capture all the options and find out size
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	     System.out.println(options.size());
	     
	     //print options from dropdown
	     //for(WebElement op:options) {
	    	// System.out.println(op.getText());}
	
	     //select multiple options
	     for(WebElement op:options) {
	    	 String option=op.getText();
	    	 
	    	 if(option.equals("Java") || op.getText().equals("Python") || op.getText().equals("MySql") ) {
	    		 op.click();
	    	 }
	    	
	     }
	}
}
