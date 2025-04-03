package Utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class common_methods {
	
	protected static WebDriver dr ;
	protected static void Launch_chrome(String str)
	{
		dr = new ChromeDriver();
		dr.get(str);
		dr.manage().window().maximize();
	}

}
