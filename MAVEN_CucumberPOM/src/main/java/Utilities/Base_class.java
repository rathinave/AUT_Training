package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {
	
	protected static WebDriver dr ;
	protected static void Launch_chrome(String str)
	{
		dr = new ChromeDriver();
		dr.get(str);
		dr.manage().window().maximize();
	}
	
	public static String read_data(int i,int j) throws IOException
	{
		String filename = "userdata.xlsx";
		String sheetname = "Sheet1";
		FileInputStream fis = new FileInputStream(filename);
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			XSSFSheet sh = wb.getSheet(sheetname);
			
			XSSFRow r = sh.getRow(i);
			XSSFCell c= r.getCell(j);
			String s = c.getStringCellValue();
			return s;
		}
	}

}
