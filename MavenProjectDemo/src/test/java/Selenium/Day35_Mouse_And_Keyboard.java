package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Day35_Mouse_And_Keyboard {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//1,moveToElement
		/*driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement desktops=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		Actions act=new Actions (driver);
		//Mouse hover
		//act.moveToElement(desktops).moveToElement(mac).click().build().perform();
		act.moveToElement (desktops).moveToElement(mac).perform();*/
		
		
		//2.ContextClick
		
		/*driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/dynamic-create.html");
		driver.manage().window().maximize();
		WebElement btn=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	
		  Actions act=new Actions(driver);
		  act.contextClick(btn).perform();
		  
		  //click on copy
		  driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		  Thread.sleep(5000);
		  driver.switchTo().alert().accept();*/
		
		//3.doubleclick
	
		/*driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button=driver.findElement(By.xpath("//button [normalize-space()='Copy Text']"));
		box1.clear(); // clears box1
		box1.sendKeys("WELCOME");
		//Double click action on the button
		Actions act=new Actions (driver);
		act.doubleClick(button).perform();
		//validation box2 should contains "WELCOME"
		String txt=box2.getAttribute("value");
		if(txt.equals("WELCOME"))
		{
		System.out.println("Text copied..");
		}
		else
		{
		System.out.println("Text Not copied proper");
	}*/
	
	//4.drag and drop
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Actions act=new Actions (driver);
		WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
		act.dragAndDrop (rome, italy).perform();
		}
	
	}
