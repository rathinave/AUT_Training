package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
//   demowebshop.tricentis.com
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com/");
		dr.findElement(By.className("ico-register")).click();
        dr.findElement(By.id("gender-male")).click();
        dr.findElement(By.id("FirstName")).sendKeys("Rathinavel");
        dr.findElement(By.id("LastName")).sendKeys("P");
        dr.findElement(By.id("Email")).sendKeys("rathinavelrv28@gmail.com");
        dr.findElement(By.id("Password")).sendKeys("Rathinavel@2003");
        dr.findElement(By.id("ConfirmPassword")).sendKeys("Rathinavel@2003");
        dr.findElement(By.id("register-button")).click();

	}

}
