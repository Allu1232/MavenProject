package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Day37_Scrolling_Page {
	
   public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.nopcommerce.com/");
	   driver.manage().window().maximize();
	   JavascriptExecutor js=(JavascriptExecutor) driver;
	   //1) scroll down page by pixel number
	   //js.executeScript("window.scrollBy (0,1500)", "");
	   //System.out.println(js.executeScript("return window.pageYOffset;")); //1500
	   
	   
	   //2) scroll the page till element is visible
	//  WebElement ele= driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
	 //  js.executeScript("arguments[0].scrollIntoView();", ele);
	 //  System.out.println(js.executeScript("return window.pageYOffset;")); //1500
    
    
   // 3)scroll down the page till bottom
	   js.executeScript("window.scrollBy (0,document.body.scrollHeight)");
	   System.out.println(js.executeScript("return window.pageYOffset;")); 
	  
	   //4. Scroll upto initial page
	   Thread.sleep(5000);
	   js.executeScript("window.scrollBy (0,-document.body.scrollHeight)");
	   
	   Thread.sleep(5000);
	   
	   js.executeScript("document.body.style.zoom='50%'");  //set zoom level 50
	   Thread.sleep(5000);
}
	

}
