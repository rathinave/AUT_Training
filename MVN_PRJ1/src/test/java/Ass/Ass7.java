package Ass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass7 {
	   static WebDriver dr = new ChromeDriver();
	    @BeforeMethod
		// TODO Auto-generated method stub
	    public void bm()
	    {
				
				dr.get("https://jqueryui.com/checkboxradio/");
				dr.manage().window().maximize();
	    }
	    @Test
	    public void test()
	    {
	         String s = dr.getTitle();
	         assertTrue(s.contains("Checkbox"));
	    }
		


}
