package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click_operation {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.facebook.com/");
  driver.findElement(By.linkText("English(UK)")).click();
  
  WebElement forgot=driver.findElement(By.partialLinkText("forgotten password"));
  Actions act=new Actions(driver);
  act.contextClick(forgot).perform();
  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
  act.sendKeys(Keys.ENTER).perform();
	}

}
