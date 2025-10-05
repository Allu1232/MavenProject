package conditional_statement;

import static org.testng.Assert.assertTrue;
 
import java.io.FileInputStream;
 
import java.io.IOException;
 
import java.time.Duration;
import java.util.List;
 
import org.apache.poi.ss.usermodel.Cell;
 
import org.apache.poi.ss.usermodel.Row;
 
import org.apache.poi.ss.usermodel.Sheet;
 
import org.apache.poi.ss.usermodel.Workbook;
 
import org.apache.poi.xssf.usermodel.XSSFSheet;
 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.JavascriptExecutor;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class GenAITool {
 
 
//	public String tittle;
 
	public static void main(String[] args) throws InterruptedException {
     ChromeOptions options=new ChromeOptions();
     options.addArguments("--incognito");			
     		WebDriver driver=new ChromeDriver(options);
 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 
				driver.manage().window().maximize();
 
				driver.get("https://test-genaiqep-bafae9fdemajgrgh.eastus-01.azurewebsites.net/login");
 
				driver.findElement(By.className("login")).click();
 
				Thread.sleep(3000);
 
 
				//Fetch data from excel and  Read data from Excel file,c
 
 
//-----------------------------------USER 1 LOGIN------------------------------------------------------------------
 
			FileInputStream inputStream = null;
 
			    Workbook workbook = null;
 
				 try {
 
			        //inputStream = new FileInputStream(new String(excelFilePath));
 
		    	FileInputStream fis = new FileInputStream("C:\\Users\\chintv\\eclipse-workspace\\adosolution\\userdataforado.xlsx");
 
		    	workbook = new XSSFWorkbook(fis);
 
		        Sheet sheet = (Sheet) workbook.getSheetAt(0);
 
		        Thread.sleep(1000);
 
		        // Assuming the first row is the header
 
		        Row row = ((XSSFSheet) sheet).getRow(1); // Get the second row (index 1)		       
 
		        Cell username=row.getCell(0);
 
		        Cell password=row.getCell(1);		        
 
		        String username1=username.getStringCellValue();
 
		        String password1=password.getStringCellValue();
 
		        // Find the username and password fields and fill them
 
		        WebElement usernamefield=driver.findElement(By.id("username"));
 
		        WebElement passwordfield=driver.findElement(By.id("password"));
 
 
		       usernamefield.sendKeys(username1);
 
		       passwordfield.sendKeys(password1);
 
 
		       Thread.sleep(1000);
 
//		        // Click the login button
 
 
		       driver.findElement(By.xpath("//span[@class=\"mdc-button__label\"]")).click();
 
			Thread.sleep(2000);
 
		    } catch (IOException e) {
 
		        e.printStackTrace();
 
		    } finally {
 
		        if (workbook != null) {
 
		            try {
 
		                workbook.close();
 
		            } catch (IOException e) {
 
		                e.printStackTrace();
 
		            }
 
		        }
 
		    }
 
 
							
 
 
//---------------------------------------FOR SELECTING BELOW OPTIONS--------------------------------------------------------------------//
 
 
				 WebElement home=driver.findElement(By.xpath("/html/body/app-root/app-home/app-header/div/div/nav/a[1]"));
 
				 assertTrue(home.isDisplayed(), "home is not displayed");
 
 
					JavascriptExecutor js = (JavascriptExecutor)driver;
 
					Thread.sleep(3000);
 
					WebElement element = driver.findElement(By.xpath("//h4[text()='Capgemini’s Next Generation Quality Engineering Platform leverages GenAI,']"));
 
					js.executeScript("arguments[0].scrollIntoView(true);", element);
 
					Thread.sleep(2000);
 
						//for portfolio element
 
			        WebElement portfolio = driver.findElement(By.xpath("/html/body/app-root/app-home/div/div[2]/div[1]/div/div/div[2]/div/mat-form-field"));
 
			        portfolio.click();
 
			        Thread.sleep(1000);
 
			       WebElement testing=driver.findElement(By.xpath("//span[text()=' Testing team ']"));
			     
			       testing.click();
 
			       Thread.sleep(1000);
 
			       //for organization
 
			       WebElement component=driver.findElement(By.xpath("/html/body/app-root/app-home/div/div[2]/div[1]/div/div/div[3]/div/mat-form-field"));
 
			       component.click();
 
			       Thread.sleep(1000);
 
			       WebElement Analysis=driver.findElement(By.xpath("//*[@id=\"mat-option-2\"]"));
 
		           Analysis.click();
 
//-------------------------------------------------------------------------------------------------------
 
		           //Selecting keyword
		           
//		           WebElement keyword=driver.findElement(By.xpath("//input[@placeholder='Search by keyword']"));
//		           keyword.click();
//		           keyword.sendKeys("ado");
		           
		           
		           //Selecting solution
 
 
		           Thread.sleep(2000);  
 
		           WebElement solution=driver.findElement(By.xpath("//td/a[text()='Azure Devops AITCG solution']/preceding::mat-radio-button[1]"));
 
		           solution.click();
 
		           Thread.sleep(1000);
 
		           WebElement feature=driver.findElement(By.xpath("//span[text()='Features']"));
 
		           feature.click();
 
		           Thread.sleep(2000);
 
		           Thread.sleep(1000);
 
		           WebElement featureOption=driver.findElement(By.xpath("//tbody//tr//td//a[text()='3365 Feature Analysis - E2E Scenarios ']//preceding::mat-radio-button[1]"));
 
		           featureOption.click();
 
		           Thread.sleep(1000);
 
		           WebElement analysisButton=driver.findElement(By.xpath("//button[text()='Analysis']"));
 
		           analysisButton.click();
 
		           Thread.sleep(1000);
 
		           WebElement FeatureTestCases=driver.findElement(By.xpath("//span[text()='Feature Test Cases']"));
 
		           FeatureTestCases.click();
 
		           Thread.sleep(1000);
 
		           WebElement prompt=driver.findElement(By.xpath("//span[text()='Select Prompt']"));
 
		           prompt.click();
 
 
//		           Select select = new Select(prompt);
//
//		           select.selectByVisibleText("Descriptive Test");
//
		           
		          
		           List<WebElement> options1=driver.findElements(By.xpath("//div[@role='listbox']/mat-option"));
                   
                		   for(WebElement op:options1) {
                		    	 String option=op.getText();
                		    	
                		    	 if(option.equals("Feature functional test cases")) {
                		    		 op.click();
                		    	 }
                		   }
		           
		         
		           WebElement generate=driver.findElement(By.xpath("//button[text()='Generate Test Cases ']"));
 
		           generate.click();
 
		           Thread.sleep(8000);
		           
 
 
		           WebElement checkBox=driver.findElement(By.xpath("/html/body/app-root/app-feature-analysis-board/div/app-ai-functional-test-cases/div/form/div[4]/div/div/div/div/table/tbody/tr[1]/td[1]/input"));
 
		           checkBox.click();
		           
 
 
		           Thread.sleep(2000);
 
		           WebElement download=driver.findElement(By.xpath("//button[text()='Download Test Cases ']"));
 
		           download.click();
 
		           Thread.sleep(2000);
 
		           WebElement upload=driver.findElement(By.xpath("//button[text()='Upload to Azure DevOps ']"));
 
		           upload.click();
 
		           
 
		           WebElement testcaseTitle=driver.findElement(By.xpath("//tbody/tr[1]/td[2]/textarea[1]"));
 
		           String tittle=testcaseTitle.getText();
 
		           String tittle1 = testcaseTitle.getAttribute("value");
 
		        		System.out.println(tittle1);
 
		     driver.close();
 
 
	driver.get("https://dev.azure.com/QEPSRETesting/Gen%20AI%20QEP%202.0/_workitems/");
 
	
 
	 driver.get("https://login.microsoftonline.com/organizations/oauth2/v2.0/authorize?redirect_uri=https%3A%2F%2Fportal.azure.com%2Fsignin%2Findex%2F&response_type=code%20id_token&scope=https%3A%2F%2Fmanagement.core.windows.net%2F%2Fuser_impersonation%20openid%20email%20profile&state=OpenIdConnect.AuthenticationProperties%3D3MttA3_BQpxyUyA6H3HO67aDE33ecJbhiCm-F3cNR3MbFKxRTtBFIZqF5DkfEXCt3-54OFZPqeadrHfx-sOt72Twqd12fse15ndh3tcalWBNseQX_kjKkgVp_0RxFD4FehNQwiW-bRdTxQs7kSpnSZeoOSsIFABWNromZLFVZh4TyyTtARtAeCcPrLPwA4mYx_8muj0p8q7JGxsDZLZ5M3cC5odCm5orOqJkn16SvHjoJVAyWF03w37Domtel3b5Uu5f-2u3nQBicn_ndFKPHTrV9SGFeEsA056lq4NiO6JozgiTixIrq0XRpopvAoxVtcn8dTArDSfN0h6mwh7mTJ2KKHilP-0CdTiZrmuzEQuiWFC1RG2XwgVxmySC6b9hYQHxRizSrwM3UxxekhQrjo9U3n_Jp9xSkAEG5bjVx7Ceo1wd6Q3DhrtHXtmAelXoi5MIkhCk0nqGwEWPoGewPTLgDCeF7H0eGQQHcn09ktM&response_mode=form_post&nonce=638839184044296254.ZmU1ZDNjNzctZjc4NC00N2Y4LTgxZTctYTU5MjJiOWY3NzI4NGQ0ZjgwMDAtZDNiNS00N2Y0LWJlN2UtZTRjOWJhNjdlOGJk&client_id=c44b4083-3bb0-49c1-b47d-974e53cbdf3c&site_id=501430&client-request-id=79873295-ca87-4de3-9218-776ebf41e149&x-client-SKU=ID_NET472&x-client-ver=8.3.0.0&sso_reload=true");
 
	
 
	WebElement login= driver.findElement(By.id("i0116"));
 
	login.sendKeys("deepika.ghildiyal@capgemini.com");
 
	
 
	
 
	 WebElement next=driver.findElement(By.id("idSIButton9"));
 
	 next.click();
 
	
 
	
 
	 Thread.sleep(2000);
 
	 WebElement option=driver.findElement(By.id("idSIButton9"));
 
	 option.click();
 
	
 
	WebElement search=driver.findElement(By.id("l1-search-input"));
 
	search.click();
 
	search.sendKeys(tittle1);
 
	}
 
 
}
 
 
 
 
 
