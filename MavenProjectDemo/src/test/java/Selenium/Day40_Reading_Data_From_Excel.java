package Selenium;
import java.io.FileInputStream;
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

	
public class Day40_Reading_Data_From_Excel {
		public static void main(String[] args) throws IOException {
			FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Test Data\\Testdata.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheet("Sheet1");  //XSSFSheet sheet=workbook.getSheetAt(0);
			int totalRows=sheet.getLastRowNum();
			
			int totalCells=sheet.getRow(1).getLastCellNum();
			System.out.println("number of rows:"+ totalRows); //5
			System.out.println("number of cells:"+ totalCells); //4
			
			for(int r=0;r<=totalRows;r++)
			{
			XSSFRow currentRow=sheet.getRow(r);
			for(int c=0;c<totalCells;c++)
			{
			XSSFCell cell=currentRow.getCell(c);
			System.out.print(cell.toString()+"\t");
			}
			System.out.println();
			}
			workbook.close();
			file.close();
			}
			}



