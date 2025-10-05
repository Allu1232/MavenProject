package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day30_Handles_Frames {


	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
  //frame-1
	
		WebElement frame=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
         driver.switchTo().frame(frame);
         driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
	
	driver.switchTo().defaultContent(); // directly we cant move from 1 frame to 2 frame
	//frame-2
	WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
    driver.switchTo().frame(frame2);
    driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("SivaRedyy");
    
    //frame-3
    driver.switchTo().defaultContent(); // directly we can't move from 1 frame to 2 frame
	WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
    driver.switchTo().frame(frame3);
    driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("SivaRedyy");
	
	//inner iframe-part of frame3
    driver.switchTo().frame(0); //switching to frame using index is used only for single frame in the page
	//driver.findElement(By.xpath("//div[@id='18']//[@class='AB7Lab Id5V1']")).click();
	WebElement rdbutton=driver.findElement(By.xpath("//div[@id='18']//[@class='AB7Lab Id5V1']"));
     JavascriptExecutor js=(JavascriptExecutor) driver;
     js.executeScript("arguments[0].click();", rdbutton);
     driver.switchTo().defaultContent();
	}

}
