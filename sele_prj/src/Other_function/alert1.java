package Other_function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
	   dr.get("https://demoqa.com/alerts");
		
		
		WebElement we = dr.findElement(By.xpath("//button[@id='alertButton']"));
		we.click();
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			 e.printStackTrace();
		}
		
		Alert a = dr.switchTo().alert();
		String msg = a.getText();
		System.out.println("Alert Message : "+msg);
		a.accept(); // click on the ok button
	//	a.dismiss(); // click the cancel button

	}

}
