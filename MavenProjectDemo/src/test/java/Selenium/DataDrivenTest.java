package Selenium;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTest {
   static String filepath="C:\\Users\\SDIRISAN\\Downloads\\LoginCred.xlsx";
    public static void main(String[] args) throws IOException {
      //  FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\Test Data\\LoginCred.xlsx");
    	FileInputStream file = new FileInputStream(filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        int totalRows = sheet.getLastRowNum();
        System.out.println("Number of rows: " + totalRows);

        for (int r = 0; r <= totalRows; r++) {
            XSSFRow row = sheet.getRow(r);
            if (row == null) continue;

            String mobileNumber = row.getCell(0).getStringCellValue(); // Assuming column 0 is mobile number
            String day = row.getCell(1).getStringCellValue();         // Assuming column 1 is day

            System.out.println("Login Attempt " + r + ": Mobile Number = " + mobileNumber + ", Day = " + day);

            driver.get("https://www.makemytrip.com/");
            driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).clear();
            driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys(mobileNumber);
            driver.findElement(By.xpath("//div/button/span[text()='Continue']")).click();

            // You can use the 'day' value for logging, conditional logic, or screenshots
        }

        workbook.close();
        file.close();
        driver.quit();
    }
}
