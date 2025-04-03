package Adv_Feartures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilites.common_methods;

public class drag extends common_methods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Launch_chrome("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		
		WebElement we1 = dr.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement we2 = dr.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions act = new Actions(dr);
		Thread.sleep(3000);
		act.dragAndDrop(we1, we2).perform();

	}

}
