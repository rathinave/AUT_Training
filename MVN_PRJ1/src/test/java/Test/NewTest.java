package Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_Pages.Login_Page;
import POM_Pages.Product_Page;
import Utilites.common_methods;


public class NewTest extends common_methods {
	
	Login_Page lp;
	Product_Page pp;
	static int r=1;
	static String uid;
	static String pwd;
	
	@BeforeMethod
	public void bm() throws IOException
	{
		
		Launch_chrome("https://www.saucedemo.com/"); 
		lp = new Login_Page(dr);
		pp = new Product_Page(dr);
		uid = read_data(r, 0);
		pwd = read_data(r, 1);
		r++;
	}
	
	@AfterMethod
	public void am()
	{
		//dr.close();
		dr.quit();
	}
	
	@Test
	public void test1() 
	{
		lp.enter_name(uid);
		lp.enter_pwd(pwd);
		lp.click_login();
		String a = pp.get_title();
		assertEquals(a, "Products");
	}
	
	@Test
	public void test2() 
	{
		lp.enter_name(uid);
		lp.enter_pwd(pwd);
		lp.click_login();
		String a = pp.get_title();
		assertEquals(a, "Products");
	}
	
}
