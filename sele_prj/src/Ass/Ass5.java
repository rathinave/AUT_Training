package Ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://jqueryui.com/selectmenu/");
		dr.manage().window().maximize();
		
		WebElement we1 = dr.findElement(By.xpath("//iframe[@class='demo-frame']"));
		dr.switchTo().frame(we1);
		
		WebElement we2 = dr.findElement(By.xpath("//span[@id='speed-button']"));
		we2.click();
		
		Select s1 = new Select(we2);
		s1.selectByVisibleText("Slow");
		
		WebElement we3 = dr.findElement(By.xpath("//span[@id='number-button']"));
		Select s2 = new Select(we3);
		s2.selectByIndex(4);
		
		

	}

}
