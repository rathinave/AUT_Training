package Adv_Feartures;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utilites.common_methods;

public class screenshot extends common_methods {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Launch_chrome("https://www.saucedemo.com/"); 
		TakesScreenshot ss = ((TakesScreenshot) dr);
		File srcf = ss.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\rathinavel.p\\Documents\\ss\\1.png");
	    FileUtils.copyFile(srcf, destfile);

	}

}
