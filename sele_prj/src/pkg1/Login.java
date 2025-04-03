package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com/");
		
		
		dr.findElement(By.className("ico-login")).click();
		dr.findElement(By.id("Email")).sendKeys("rathinavelrv28@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("Rathinavel@2003");
	    dr.findElement(By.xpath("//input[@value='Log in']")).click();
	    
	    
	    String s = dr.findElement(By.className("account")).getText();
	    if(s.equals("rathinavelrv28@gmail.com"))
	    {
	    	System.out.println("The actual text is same as expected");
	    }
	    else
	    {
	    	System.out.println("The actual text is not same as expected");
	    }
	    
	    // Test the Buying progress
	    dr.findElement(By.linkText("Books")).click();
	    // drop down
	   WebElement we = dr.findElement(By.name("products-orderby"));
	   Select sel = new Select(we);
	   sel.selectByIndex(3);
	}

}
