package pkg1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr1 = new ChromeDriver();
		dr1.get("https://demowebshop.tricentis.com/");
		//dr1.navigate().to("https://demowebshop.tricentis.com/");
		
		WebDriverWait wt1 = new WebDriverWait(dr1, Duration.ofSeconds(1));
		WebElement ele1 = wt1.until(ExpectedConditions.elementToBeClickable(By.className("ico-login")));
		ele1.click();
		
		dr1.findElement(By.id("Email")).sendKeys("rathinavelrv28@gmail.com");
		dr1.findElement(By.id("Password")).sendKeys("Rathinavel@2003");
		
		WebDriverWait wt2 = new WebDriverWait(dr1, Duration.ofSeconds(1));
		String s1 = "//input[@value='Log in']";
		WebElement ele2 = wt2.until(ExpectedConditions.elementToBeClickable(By.xpath(s1)));
		ele2.click();
		
		WebDriverWait wt3 = new WebDriverWait(dr1, Duration.ofSeconds(3));
		String s2 = "//div[@class='header-links-wrapper']/div/ul/li[3]";
		WebElement ele3 = wt3.until(ExpectedConditions.elementToBeClickable(By.xpath(s2)));
		ele3.click();
	
		List<WebElement> Rows = dr1.findElements(By.xpath("//table[@class='cart']/tbody/tr"));	
		int i = Rows.size();
		System.out.println(i);

	}

}
