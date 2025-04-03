package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.jqueryui.com/");
		
		//dr.findElement(By.linkText("Widgets")).click();
		//dr.findElement(By.linkText("Checkboxradio")).click();
		dr.findElement(By.xpath("//*[text()='Checkboxradio']")).click();
		
		
	     WebElement we = dr.findElement(By.xpath("//iframe[@class='demo-frame']"));
		dr.switchTo().frame(we);
		
		dr.findElement(By.xpath("//label[@for='radio-1']")).click();
		dr.findElement(By.xpath("//label[@for='checkbox-1']")).click();
			
	}

}
