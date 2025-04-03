package Adv_Feartures;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilites.common_methods;

public class mousehover extends common_methods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launch_chrome("https:/www.myntra.com/");
		
		WebElement menu = dr.findElement(By.xpath("//div[@class='desktop-userIconsContainer']"));
		Actions act = new Actions(dr);
		act.moveToElement(menu).perform();

	}

}
