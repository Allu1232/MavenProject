package WaitStatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class implicitWait {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
   WebDriver driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
   driver.manage().window().maximize();
   driver.findElement( By.xpath("//input[@placeholder='username']")).sendKeys("Admin");
   
	}

}
