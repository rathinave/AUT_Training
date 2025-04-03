package Wait_Function;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait_Ass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://the-internet.herokuapp.com/dynamic_controls");
		dr.manage().window().maximize();
		Thread.sleep(5000);
		dr.findElement(By.xpath("//form[@id='input-example']/button")).click();
		Wait<WebDriver> wt = new FluentWait<WebDriver>(dr)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='input-example']/input")));
        ele.sendKeys("Selenium");
        
	}

}
