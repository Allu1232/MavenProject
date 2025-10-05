package Sselenium_Day41;
import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class FD_Calculater {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement alert=driver.findElement(By.xpath("//button[@id='wzrk-cancel']"));
		      alert.click();
		String filePath=System.getProperty("user.dir")+"\\Test Data\\CalculateData.xlsx";
		int rows=ExcelUtils.getRowCount (filePath, "Sheet1");
		for(int i=1;i<=rows;i++)
		{
		//read data from excel
		String pric=ExcelUtils.getCellData (filePath, "Sheet1", 1,0);
		String rateofinterest=ExcelUtils.getCellData (filePath, "Sheet1", 1,1);
		String per1=ExcelUtils.getCellData (filePath, "Sheet1", 1,2);
		String per2=ExcelUtils.getCellData(filePath, "Sheet1", 1,3);
		String fre=ExcelUtils.getCellData (filePath, "Sheet1", 1, 4);
		String exp_mvalue=ExcelUtils.getCellData(filePath, "Sheet1", 1,5);
		
		
		//2) pass above data into application
		driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pric);
		driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
		driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys (per1);
		Select perdrp=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
		perdrp.selectByVisibleText(per2);
		Select fredrp=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
		fredrp.selectByVisibleText(fre);
		
		driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click(); //clicked on calculate
				//validation
		
				String act_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
				if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
				{
				System.out.println("Test passed");
				ExcelUtils.setCellData (filePath, "Sheet1", i, 7, "Passed");
				ExcelUtils.fillGreenColor (filePath, "Sheet1", 1,7);
				}
				else
				{
				System.out.println("Test failed");
				ExcelUtils.setCellData (filePath, "Sheet1",1,7, "Failed");
				ExcelUtils.fillRedColor(filePath, "Sheet1", 1,7);
				}
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='cal_div']//a[2]/img")).click(); // clicked on clear button
				}
				driver.quit();
				
		}
	}
		
