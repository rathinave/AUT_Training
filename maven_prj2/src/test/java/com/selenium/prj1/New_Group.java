package com.selenium.prj1;

import org.testng.annotations.Test;

public class New_Group {
  @Test(groups = {"F1","F2"})
  public void test1() {
	  System.out.println("Executing F1 and F2 testcase");
  }
  @Test(groups = {"F1"})
  public void test2() {
	  System.out.println("Executing F1  testcase");
  }
  @Test(groups = {"F2"})
  public void test3() {
	  System.out.println("Executing F2 testcase");
  }
  @Test(groups = {"F1"})
  public void test4() {
	  System.out.println("Executing F1 testcase");
  }
}
