package com.selenium.prj1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExp {
  @Test
  @Parameters({"OS"})
  public void f(String OS) {
	  System.out.println("Running Test on OS : "+OS);
  }
}
