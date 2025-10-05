package Selenium;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day34_DatePickers {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait (Duration.ofSeconds (10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		//switch to frame
		driver.switchTo().frame(0);
		
		//Method1 using sendkeys()
		//driver.findElement(By.xpath("//input[@id='datepicker"]")).sendKeys("04/05/2024"); //mm/dd//yyyy
		
		//Method2 using DatePicker
		String month="January";
		String year="2026";
		String date="24";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true) {
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if(currentmonth.equals(month) && currentyear.equals(year)) {
			break;
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //Next botton
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //Previous botton
		}
		
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
	for(WebElement dt:alldates) {
		if(dt.getText().equals(date))
		{
			dt.click();
			break;
		}
		
	}
	
	}

}
