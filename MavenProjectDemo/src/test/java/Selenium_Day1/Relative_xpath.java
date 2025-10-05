package Selenium_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Relative_xpath {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		//ChromeOptions options=new ChromeOptions();
	
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//using className finding the element
		boolean Status=driver.findElement(By.className("header-logo")).isDisplayed();
		System.out.println(Status);
		
		driver.findElement(By.linkText("Register")).click();
	//	driver.findElement(By.xpath("//input[@type='text'][@id='FirstName']")).sendKeys("Siva");
		//using chained xpath 
		driver.findElement(By.xpath("//div[@class='inputs']/input[contains(@id, 'First')]")).sendKeys("Arjun");
		
		//find element using id
		driver.findElement(By.id("gender-male")).click();
		
		//x-path with inner text
	//	driver.findElement(By.xpath("//a(text()='Books')")).click();
		
		//x-path with normalize-space(), same as text
	    //driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

		
		//x-path using contains method
		driver.findElement(By.xpath("//input[contains(@id, 'gender-male')]")).click();
		//x-path using starts-with
		driver.findElement(By.xpath("//input[contains(@id, 'gender-ma')]")).click();
		
		
	}

}
