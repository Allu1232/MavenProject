package Selenium_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class cssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		//ChromeOptions options=new ChromeOptions();
	
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//using className finding the element
		boolean Status=driver.findElement(By.className("header-logo")).isDisplayed();
		System.out.println(Status);
		
//1.using tag#id finding element
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
//2.using tag.className find element
		
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");

//3.using tag[attribute='value']
		
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("T-shirts");
		
//4.using tag.className(attribute='value')
		
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts");

	}

}
