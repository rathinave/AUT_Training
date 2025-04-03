package Stepdef2;

import static org.testng.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ScenarioContext;
import Utilities.Testcontext;
import Utilities.common_methods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyOrder extends common_methods {
  
	
	@When("User click the order")
	public void user_click_the_order() throws InterruptedException {
		
		    JavascriptExecutor jse = (JavascriptExecutor)dr;
		    jse.executeScript("window.scrollBy(0,700)");
		    Thread.sleep(5000);
		    WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(10));
			String s = "//div[@class='footer-menu-wrapper']/div[3]/ul/li[2]/a";
			WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(s)));
			ele.click();
	}
	
	@Then("Check the order_id should be match")
	public void check_the_order_id_should_be_match() throws InterruptedException {
	
		String exp = (String) Testcontext.current.get(ScenarioContext.ORDER_ID.toString());
	    String ac = dr.findElement(By.xpath("//div[@class='center-2']/div/div[2]/div/div[1]/div[1]/strong")).getText();
	    System.out.println(exp);
	    System.out.println(ac);
	    assertEquals(exp.toLowerCase(),ac.toLowerCase());
	}
}
