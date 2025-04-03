package Wait_Function;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_Ass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://the-internet.herokuapp.com/dynamic_controls");
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//form[@id='input-example']/button")).click();
		Thread.sleep(1000);
		WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(30));
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='input-example']/input")));
		ele.sendKeys("rathinavel");
		dr.quit();
		


	}

}
