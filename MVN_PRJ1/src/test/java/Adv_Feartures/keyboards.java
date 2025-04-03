package Adv_Feartures;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilites.common_methods;

public class keyboards extends common_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launch_chrome("https://www.saucedemo.com/"); 
		
		WebElement we1 = dr.findElement(By.xpath("//*[@id=\"user-name\"]"));
		Actions act = new Actions(dr);
		act.sendKeys(we1,"hello").keyDown(Keys.CONTROL).sendKeys("acvvv").keyUp(Keys.CONTROL).perform();
		act.contextClick(we1).perform();							
	}

}