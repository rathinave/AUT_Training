package com.selenium.prj1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testsuite_tc2 {
  @Test
  public void test1() {
	  WebDriver dr =  new ChromeDriver();
	  dr.get("https://demowebshop.tricentis.com");
	  LocalDateTime myDateObj = LocalDateTime.now();
	  DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	  String formattedDate = myDateObj.format(myFormatObj);
	  System.out.println("In test1 - After formatting: "+formattedDate);
  }
}
