package com.selenium.prj1;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderAss extends Login {
	static int i = 1;
	String xp_p1 = "//div[@class='inventory_list']/div[";
	String xp_p3 = "]/div[2]//a/div";
	String full_xp;
	
	
	
	
	@DataProvider(name = "linkdata")
	public  Object[] produtc()
	{
		Object[] e_prd = {
				         "Sauce Labs Backpack",
				          "Sauce Labs Bike Light",
				          "Sauce Labs Bolt T-Shirt",
				          "Sauce Labs Fleece Jacket",
				          "Sauce Labs Onesie",
				          "Test.allTheThings() T-Shirt (Red)"
						};
		return e_prd;
	}
	
		@BeforeClass
		public void bc()
		{
			log();
		}
	
	
	  @Test(dataProvider = "linkdata")
	  public void test(String e_prd)
	  {
		  full_xp = xp_p1 + i + xp_p3;
		 
		  String a_prd = dr.findElement(By.xpath(full_xp)).getText();
		  assertEquals(a_prd, e_prd);
		  i++;
	  }
}
