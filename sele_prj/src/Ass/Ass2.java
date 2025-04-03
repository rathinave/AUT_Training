package Ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/drag-and-drop");
		dr.manage().window().maximize();
		
		
		WebElement we1 = dr.findElement(By.xpath("//div[@id='column-a']"));
		WebElement we2 = dr.findElement(By.xpath("//div[@id='column-b']"));
		Thread.sleep(2000);
		Actions a = new Actions(dr);
		a.dragAndDrop(we1, we2).perform();
	
	}

}
