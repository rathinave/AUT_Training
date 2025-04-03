package com.selenium.prj1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExp1 {
	
	@DataProvider(name = "linkdata")
	public  Object[][] produtc()
	{
		Object[][] data = {
								{"user1","pwd1"},
								{"user2","pwd2"},
								{"user3","pwd3"},
								{"user4","pwd4"},
							};
		return data;
	}

	  @Test(dataProvider = "linkdata")
	  public void testdata(String data1,String data2)
	  {
		  System.out.println("User Id : "+data1+" PWD : "+data2);
	  }
}
