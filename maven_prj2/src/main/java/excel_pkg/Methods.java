package excel_pkg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//import org.apache.commons.collections4.iterators.EntrySetMapIterator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Methods {
	static HashMap<Integer,Student> marks = new HashMap<>();
	
	public static void read_data() throws IOException, NumberFormatException
	{
		String filename = "student1.xlsx";
		String sheetname = "Sheet1";
		FileInputStream fis1 = new FileInputStream(filename);
		XSSFWorkbook wb1 = new XSSFWorkbook(fis1);
		XSSFSheet sh1 = wb1.getSheet(sheetname);
		
		for(int i=1; i<=3; i++)
		{
		
			XSSFRow r = sh1.getRow(i);
			
			XSSFCell cell1 = r.getCell(0);
			double s1 = cell1.getNumericCellValue();
			
			XSSFCell cell2 = r.getCell(1);
			double s2 = cell2.getNumericCellValue();
			
			XSSFCell cell3 = r.getCell(2);
			double s3 = cell3.getNumericCellValue();
			
			marks.put((int)s1,new Student((int)s1, (int)s2, (int)s3));
		}
		
	}
	public static void write_data() throws IOException
	{
		String filename = "student1.xlsx";
		String sheetname = "Sheet2";
		FileInputStream fis2 = new FileInputStream(filename);
		XSSFWorkbook wb2 = new XSSFWorkbook(fis2);
		XSSFSheet sh2 = wb2.getSheet(sheetname);
		
		int rc = 1;
		for(Map.Entry<Integer, Student> e : marks.entrySet())
		{
			Student s = e.getValue();
			
			XSSFRow r = sh2.getRow(rc);

			XSSFCell c = r.getCell(3);
			
		    int avg = (int)(s.Maths + s.Phy)/2;
		    System.out.println(avg);
			c.setCellValue(avg);
			rc++;
			
		}
		FileOutputStream fos = new FileOutputStream(filename);
		wb2.write(fos);
		wb2.close();
		
	}

}
