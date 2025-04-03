package com.selenium.prj1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {
	
  @Test
  public void Test1() {
	  Assert.assertEquals(true, true);
	  System.out.println("In Test1");
  }
  @Test
  public void Test2() {
	  Assert.assertEquals(true, true);
	  System.out.println("In Test2");
  }
  @Test
  public void Test3() {
	  Assert.assertEquals(false, false);
	  System.out.println("In Test3");
  }
}
