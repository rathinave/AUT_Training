package Ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/large");
		dr.manage().window().maximize();
		
		String s = dr.findElement(By.xpath("//tbody/tr[20]/td[10]")).getText();
		System.out.println(s);

	}

}
