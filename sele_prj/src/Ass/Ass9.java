package Ass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().maximize();
		
		WebElement we = dr.findElement(By.id("user-name"));
		
		Actions a = new Actions(dr);
		a.sendKeys(we).keyDown(Keys.SHIFT).sendKeys("asd").keyUp(Keys.SHIFT).sendKeys("qwe").perform();

	}

}
