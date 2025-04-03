package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log_class {
	public static void ValidLogin(String name,String pass)
	{
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		
		dr.findElement(By.id("user-name")).sendKeys(name);
		dr.findElement(By.id("password")).sendKeys(pass);
		dr.findElement(By.id("login-button")).click();
		
		if(dr.findElement(By.className("app_logo")).getText().equals("Swag Labs"))
		{
			System.out.println("TestCase - Pass");
		}
		else
		{
			System.out.println("TestCase - Fail");
		}
	}

	public static void InvalidLogin(String name,String pass)
	{
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		
		dr.findElement(By.id("user-name")).sendKeys(name);
		dr.findElement(By.id("password")).sendKeys(pass);
		dr.findElement(By.id("login-button")).click();
		
		String s = dr.findElement(By.xpath("//div[@class='error-message-container error']/h3")).getText();
		if(s.equals("Epic sadface: Username and password do not match any user in this service"))
		{
			System.out.println("TestCase - Pass");
		}
		else
		{
			System.out.println("TestCase - Fail");
		}
	}
}
