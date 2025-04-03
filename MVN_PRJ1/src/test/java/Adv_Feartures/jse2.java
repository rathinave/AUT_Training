package Adv_Feartures;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utilites.common_methods;

public class jse2 extends common_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Launch_chrome("https://www.saucedemo.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) dr;
		WebElement we = dr.findElement(By.xpath("//*[@id=\"user-name\"]"));
		jse.executeScript("arguments[0].value='standard_user';",we);

	}

}
