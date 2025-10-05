package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day29_Handling_Checkboxes {

	public static void main(String[] args) throws InterruptedException {
    
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	//Approach to select all checkboxes
	/*	for(int i=0; i<checkboxes.size(); i++) {
		checkboxes.get(i).click();
		
	}*/
	//Approach-2 for select all checkboxes
		
	//for(WebElement checkbox:checkboxes) {
	//	checkbox.click();
	//}
	
	//Approach to select particular checkboxes
	for(int i=3; i<checkboxes.size(); i++) {
		checkboxes.get(i).click();

	}
	Thread.sleep(5000);
	//to unselect the checkboxes which are selected
	for(int i=3; i<checkboxes.size(); i++) {
		if(checkboxes.get(i).isSelected()) {
			checkboxes.get(i).click();
		}

	}

}}
