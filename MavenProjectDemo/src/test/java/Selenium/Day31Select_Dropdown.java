package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day31Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {
    
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	WebElement drpcountry=driver.findElement(By.xpath("//select[@id='country']"));
   Select drpcrty=new Select(drpcountry);
   //drpcrty.selectByVisibleText("India");
   
   //drpcrty.selectByValue("japan");
   drpcrty.selectByIndex(2);
   
   //fetch total dropdown list count
   List<WebElement> options=drpcrty.getOptions();
   System.out.println(options.size());
   
   //print options
  /* for(int i=0; i<options.size(); i++) {
	   System.out.println(options.get(i).getText());
   }*/
   //enhanced for loop
   
   for(WebElement op:options) {
	   System.out.println(op.getText());
   }
   
   driver.close();

}
}