package com.selenium.prj1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertsoft {
	  SoftAssert sa;
	  @Test
	  public void Test1() {
		  sa = new SoftAssert();
		  sa.assertEquals(true, true);
		  System.out.println("In Test1");
		  sa.assertAll();
	  }
	  @Test
	  public void Test2() {
		  sa.assertEquals(true, true);
		  System.out.println("In Test2");
		  sa.assertAll();
	  }
	  @Test
	  public void Test3() {
		  sa.assertEquals(false, false);
		  System.out.println("In Test3");
		  sa.assertAll();
	  }
}
