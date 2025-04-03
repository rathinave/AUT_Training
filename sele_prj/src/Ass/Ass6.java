package Ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://jqueryui.com/checkboxradio/");
		dr.manage().window().maximize();
		
		WebElement we1 = dr.findElement(By.xpath("//iframe[@class='demo-frame']"));
		dr.switchTo().frame(we1);
		
		dr.findElement(By.xpath("//label[@for='radio-3']")).click();
		dr.findElement(By.xpath("//label[@for='checkbox-3']")).click();
		dr.findElement(By.xpath("//label[@for='checkbox-4']")).click();

	}

}
