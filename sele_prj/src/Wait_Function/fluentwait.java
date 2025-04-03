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

public class fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com/books");
		
		String xp = "//h2[@class='product-title']//a[@href='/computing-and-internet']";
		
		Wait<WebDriver> wt = new FluentWait<WebDriver>(dr)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		WebElement we = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(xp)));
		we.click();

	}

}
