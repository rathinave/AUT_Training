package Testng_reports;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM_Pages.Login_Page;
import POM_Pages.Product_Page;
import Utilites.common_methods;


@Listeners(Listener2.class)
public class Listener_report1 extends common_methods {
	
		Login_Page lp;
		Product_Page pp;
		
		@BeforeMethod
		public void bm() throws IOException
		{
			
			Launch_chrome("https://www.saucedemo.com/"); 
			lp = new Login_Page(dr);
			pp = new Product_Page(dr);
		}		
		
		@Test
		public void Test1()
		{
			lp.enter_name("standard_user");
			lp.enter_pwd("secret_sauce");
			lp.click_login();
			String a = pp.get_title();
			assertEquals(a, "Products");
		}
		
		@Test
		public void Test2() throws IOException
		{
			lp.enter_name("standard_user");
			lp.enter_pwd("secret_sauce");
			lp.click_login();
			String a = pp.get_title();
			assertEquals(a, "Products1");
			
		}
		
		@AfterMethod
		public void am()
		{
			//dr.close();
			dr.quit();
		}
}
