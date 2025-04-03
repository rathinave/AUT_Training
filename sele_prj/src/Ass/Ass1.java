package Ass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/context-menu");
		dr.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement we = dr.findElement(By.id("hot-spot"));
		Actions ac = new Actions(dr);
		ac.contextClick(we).perform();
		Alert al = dr.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(al.getText());
		al.accept();
		ac.click(we).perform();
	}

}
