package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
public class Day38_handle_SSL {

	public static void main(String[] args) {
		
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--incogito"); //it opens in incognito mode
	options.setAcceptInsecureCerts (true); // accepts SSL certificates
	options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});  //disables Chrome is automated message
	WebDriver driver=new ChromeDriver (options);
	driver.get("https://expired.badssl.com/");
	System.out.println("title of the page:"+driver.getTitle());
	//Privacy error
	//expired.badssl.com
}
}