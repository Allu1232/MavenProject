package Selenium;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day31_Hidden_Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	driver.manage().window().maximize();	   
	//Login steps
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button [normalize-space()='Login']")).click();
	//clicking on PIM
	driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click(); //PIM
driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
driver.findElement(By.xpath("//span[normalize-space()='Automaton Tester']")).click(); //click on debugger on selectors hub or goto event listeners and remove blur option. so u can see dropdownslist
}}
