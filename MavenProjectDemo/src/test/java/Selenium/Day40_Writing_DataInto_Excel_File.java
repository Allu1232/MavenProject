package Selenium;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day40_Writing_DataInto_Excel_File {
	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Test Data\\myfile.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook();
	XSSFSheet sheet=workbook.createSheet("Data");
	XSSFRow row1=sheet.createRow(0);
	row1.createCell(0).setCellValue("Java");
	row1.createCell(1).setCellValue(19);
	row1.createCell(2).setCellValue("Automation");
	XSSFRow row2=sheet.createRow(1);
	row2.createCell(0).setCellValue("Python");
	row2.createCell(1).setCellValue(3);
	row2.createCell(2).setCellValue("Automation");
	XSSFRow row3=sheet.createRow(2);
	row3.createCell(0).setCellValue("C#");
	row3.createCell(1).setCellValue(5);
	row3.createCell(2).setCellValue("Automation");
workbook.write(file);
workbook.close();
file.close();
System.out.println("file is created");
}
	}
