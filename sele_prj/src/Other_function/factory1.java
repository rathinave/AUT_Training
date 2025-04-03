package Other_function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class factory1 {
	
	  WebDriver dr;
	  private String browser;
	  
	  public factory1(String browser)
	  {
		  this.browser = browser;
	  }
	  
	  @Test
	  public void test() 
	  {
		  switch (browser) 
		  {
			    case "Chrome":
				dr = new ChromeDriver();
				break;
			    case "Firefox":
			    dr = new FirefoxDriver();
			    break;
			    case "Edge":
			    dr = new EdgeDriver();
			    break;
		  }
		
	  }
	  @Factory
	  public static Object[] factoycmethod()
	  {
		  Object[] brw = {
					           new factory1("Chrome"),
					           new factory1("Firefox"),
					           new factory1("Edge"),
                         };
		  
		  return brw;
	  }
	  @AfterMethod
	  public void Launch()
	  {
		  dr.get("https://www.saucedemo.com");
		  dr.findElement(By.id("user-name")).sendKeys("standard_user");
		  dr.findElement(By.id("password")).sendKeys("secret_sauce");
		  dr.findElement(By.id("login-button")).click();
	  }
}
