package Ass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)dr;
		WebElement we = dr.findElement(By.id("login-button"));
		js.executeScript("arguments[0].click();", we);
		
		

	}

}
