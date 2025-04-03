package com.selenium.prj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	static WebDriver dr;
	public static void log()
	{
		 dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		
		
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
	}
	

}
