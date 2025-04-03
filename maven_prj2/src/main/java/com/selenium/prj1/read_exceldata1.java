package com.selenium.prj1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_exceldata1 {

	int lastrownum, lastcellnum;
	
	public static String excel_read() throws IOException
	{
		String filename = "testdata.xlsx";
		String sheetname = "Sheet1";
		FileInputStream fis = new FileInputStream(filename);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheetname);
		
		XSSFRow r = sh.getRow(0);
		XSSFCell cell = r.getCell(0);
		String s = cell.getStringCellValue();
		
		// update the cell
		cell.setCellValue("Rathinavel");
		// create the cell
		XSSFCell cell2 = r.createCell(1);
		cell2.setCellValue("mphasis");
		FileOutputStream fos = new FileOutputStream(filename);
		wb.write(fos);
		
		wb.close();
		
		
		return s;
		
	}


}
