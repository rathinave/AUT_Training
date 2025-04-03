package Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_Pages.Login_Page;
import POM_Pages.Product_Page;
import Utilites.common_methods;

public class NewTest extends common_methods {
	
	Login_Page lp;
	Product_Page pp;
	
	@BeforeMethod
	public void bm()
	{
		Launch_chrome("https://www.saucedemo.com/"); 
		lp = new Login_Page(dr);
		pp = new Product_Page(dr);
	}
	
	@AfterMethod
	public void am()
	{
		dr.close();
	}
	
	@Test
	public void test1() 
	{
		lp.enter_name("standard_user");
		lp.enter_pwd("secret_sauce");
		lp.click_login();
		String a = pp.get_title();
		assertEquals(a, "Products");
	}
	@Test
	public void test2() 
	{
		lp.enter_name("standard_user");
		lp.enter_pwd("secret_sauce");
		lp.click_login();
		String a = pp.get_title();
		assertEquals(a, "Product");
	}
}
