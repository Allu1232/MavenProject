package Selenium;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.xssf.usermodel.XSSFCell;

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
public class Day40_DynamicData {
	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Test Data\\myfile_dynamic");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("DynamicData");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows?");
		int noofrows=sc.nextInt();
		System.out.println("Enter how many cells?");
		int noofcells=sc.nextInt();
		for(int r=0; r<=noofrows; r++)
		{
		XSSFRow currentRow=sheet.createRow(r);
		for(int c=0;c<noofcells;c++)
		{
		XSSFCell cell=currentRow.createCell(c);
		cell.setCellValue(sc.next());
		workbook.write(file); // attach workbook to the file
		workbook.close();
		file.close();
		System.out.println("File is creataed.....");
}}}}
