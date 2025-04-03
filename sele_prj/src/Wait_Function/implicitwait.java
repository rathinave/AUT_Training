package Wait_Function;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com");
		dr.manage().window().maximize();
//		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//dr.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
		
		//dr.close();
		//dr.quit();

	}

}
 