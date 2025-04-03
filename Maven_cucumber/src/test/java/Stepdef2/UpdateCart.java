package Stepdef2;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.common_methods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateCart extends common_methods{
	
	static String s1 = "//table[@class='cart']//tbody/tr[";
	static String s2 = "]/td[5]/input";
	static String ful_xp;
	static int i = 1;
	
	@When("User select the product {string}")
	public void user_select_the_product(String string) {
	    ful_xp=s1+string+s2;
	    WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(2));
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(ful_xp)));
		ele.click();
	    //dr.findElement(By.xpath(ful_xp)).click();
	}
	
	
	@When("Update the quantity of the product {string} qty {string}")
	public void update_the_quantity_of_the_product_qty(String string, String string2) throws InterruptedException {
		
		String s= dr.findElement(By.xpath("//table[@class='cart']//tbody/tr["+string+"]/td[5]/input")).getDomAttribute("value"); // to read the values in quantity box
		dr.findElement(By.xpath("//table[@class='cart']//tbody/tr["+string+"]/td[5]/input")).clear();
		int  q = Integer.parseInt(s) - Integer.parseInt(string2);
		dr.findElement(By.xpath("//table[@class='cart']//tbody/tr["+string+"]/td[5]/input")).sendKeys(String.valueOf(q));
	}
	
	@When("Click the Update shopping button")
	public void click_the_update_shopping_button() throws InterruptedException {
		
		WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(2));
		String s = "//input[@value='Update shopping cart']";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(s)));
		ele.click();
	  // dr.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
	   //Thread.sleep(1000);
	}
	
	@Then("Verify the product quantuty updated or not {string}")
	public void verify_the_product_quantuty_updated_or_not(String string) throws InterruptedException {
		Thread.sleep(3000);
		
		String s= dr.findElement(By.xpath("//table[@class='cart']//tbody/tr["+i+"]/td[5]/input")).getDomAttribute("value");
		assertEquals(string,s);
		i++;
	}
}
