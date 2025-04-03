package Wait_Function;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_Ass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//form[@id='checkbox-example']/button")).click();
		
		WebDriverWait wt = new WebDriverWait(dr, Duration.ofMillis(5000));
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='checkbox-example']/button")));
		ele.click();
		
		WebDriverWait wt2  = new WebDriverWait(dr, Duration.ofMillis(5000));
		WebElement ele2 = wt2.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='checkbox-example']/div[1]/input")));
		ele2.click();
		

	}

}
