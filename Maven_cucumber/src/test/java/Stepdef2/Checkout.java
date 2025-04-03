package Stepdef2;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ScenarioContext;
import Utilities.Testcontext;
import Utilities.common_methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout extends common_methods {
	
	@Given("The Shopping page is displayed")
	public void the_shopping_page_is_displayed() {
		WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(2));
		String s = "//input[@id='termsofservice']";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(s)));
		ele.click();
	}
	
	@When("User click the checkout button")
	public void user_click_the_checkout_button() throws InterruptedException {
		
		WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(2));
		String s = "//button[@id='checkout']";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(s)));
		ele.click();
	}

	@When("User select the country {string}")
	public void user_select_the_country(String string) {
	    WebElement we = dr.findElement(By.id("BillingNewAddress_CountryId"));
	    Select sc = new Select(we);
	    sc.selectByVisibleText(string);   
	}
	
	@When("User enter the city name {string}")
	public void user_enter_the_city_name(String string) {
	    dr.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys(string);
	}
	
	@When("User enter the address {string}")
	public void user_enter_the_address(String string) {
	   dr.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys(string);
	}
	
	@When("User enter zip code {string}")
	public void user_enter_zip_code(String string) {
	   dr.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys(string);
	}
	
	@When("User enter the phone number {string}")
	public void user_enter_the_phone_number(String string) {
	    dr.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys(string);
	}
	
	@When("User click the continue1 button")
	public void user_click_the_continue1_button() {
		
		WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(2));
		String s = "//li[@id='opc-billing']//input[@type='button']";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(s)));
		ele.click();
	}
	
	@When("User click the continue2 button")
	public void user_click_the_continue2_button() throws InterruptedException {
		//Thread.sleep(1000);
		
		WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(2));
		String s = "//li[@id='opc-shipping']//input[@type='button']";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(s)));
		ele.click();
	}
	
	@When("User click the continue3 button")
	public void user_click_the_continue3_button() throws InterruptedException {

		WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(2));
		String s = "//li[@id='opc-shipping_method']//input[@type='button']";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(s)));
		ele.click();
	}
	
	@When("User click the continue4 button")
	public void user_click_the_continue4_button() throws InterruptedException {
		//Thread.sleep(1000);
		
		WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(2));
		String s = "//li[@id='opc-payment_method']//input[@type='button']";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(s)));
		ele.click();
	}
	
	@When("User click the continue5 button")
	public void user_click_the_continue5_button() throws InterruptedException {
		
		    WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(2));
			String s = "//li[@id='opc-payment_info']//input[@type='button']";
			WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(s)));
			ele.click();
		
	}
	
	@When("User click the confrim button")
	public void user_click_the_confrim_button() throws InterruptedException {

		WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(2));
		String s = "//li[@id='opc-confirm_order']//input[@type='button']";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(s)));
		ele.click();
	   
	}

	@Then("The order id should be match")
	public void the_order_id_should_be_match() throws InterruptedException {
		
	  Thread.sleep(5000);
	  
	  String exp = "Your order has been successfully processed!";
	  String ac = dr.findElement(By.xpath("//div[@class='section order-completed']/div[1]/strong")).getText();
	  
	  String oi = dr.findElement(By.xpath("//div[@class='page checkout-page']/div[2]/div/ul/li")).getText();

		  Testcontext tc = new Testcontext();
		  tc.set(ScenarioContext.ORDER_ID.toString(), oi);
		  System.out.println(ac);
		  System.out.println(oi);
		  assertEquals(exp, ac);
	  
	    WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(5));
		String s = "//div[@class='page checkout-page']/div[2]/div/div[2]/input";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(s)));
		ele.click();
	  
	}
}
