package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	
	
	
public class Day37_FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		//single file upload
		//driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\SDIRISAN\\OneDrive - Capgemini\\Documents\\Activities.txt");
//String file=driver.findElement(By.xpath("//ul[@id=\"fileList\"]/li")).getText();
	/*if(file.equals("Activities.txt")) {
		System.out.println("File validation success");
	}
	else {
		System.out.println("File validation failed");
	}*/
	
	//Multiple files uploaded
	String file1= "C:\\Users\\SDIRISAN\\OneDrive - Capgemini\\Documents\\Activities.txt";
	String file2= "C:\\Users\\SDIRISAN\\OneDrive - Capgemini\\Documents\\Agentic AI prompt.txt";
	driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
	int noOfFilesUploaded=driver.findElements (By.xpath("//ul[@id=\"fileList\"]//li")).size();
	if(noOfFilesUploaded==2)
	{
	System.out.println("All Files are uploaded");
	}
	else
	{
	System.out.println("Files are not uploaded or incorrect files uploaded");
	}
	if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Activities.txt")
			&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Agentic AI prompt.txt")) {
			System.out.println("File names matching");
	}
	else
	{
	System.out.println("Files are not uploaded or incorrect files uploaded");
	}
	}
}
