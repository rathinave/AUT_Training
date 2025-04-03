package Adv_Feartures;

import org.openqa.selenium.JavascriptExecutor;

import Utilites.common_methods;

public class jse1 extends common_methods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launch_chrome("https://demowebshop.tricentis.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)dr;
		jse.executeScript("window.scrollBy(0,400)");

	}

}
