package Stepdef2;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.common_methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends common_methods{
     
	@Given("Login Page Displayed")
	public void login_page_displayed() {
		Launch_chrome("https://demowebshop.tricentis.com/");
	}
	
	@When("User click the login button")
	public void user_click_the_login_button() {
		WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(1));
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.className("ico-login")));
		ele.click();
		//dr.findElement(By.className("ico-login")).click();
	}
	
	@When("User enter the email_id {string}")
	public void user_enter_the_email_id(String string) {
		
		dr.findElement(By.id("Email")).sendKeys(string);
	}
	
	@When("User enter the password {string}")
	public void user_enter_the_password(String string) {
		
		dr.findElement(By.id("Password")).sendKeys(string);
	}
	
	@When("User click login")
	public void user_click_login() {
		
		WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(1));
		String s = "//input[@value='Log in']";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(s)));
		ele.click();
	}
	
	@Then("Check the account {string}")
	public void check_the_account(String string) throws InterruptedException {
		
		Thread.sleep(1000);
		if(string.equals( "Login was unsuccessful. Please correct the errors and try again."))
		{
			assertEquals(string, dr.findElement(By.xpath("//form[@action='/login']//span")).getText());
			System.out.println("Login Unsuccessful...!");
		}
		
		else 
		{
			String s = dr.findElement(By.xpath("//div[@class='header-links-wrapper']/div//a[@class='account']")).getText();
			assertEquals(s, string);
			System.out.println("login Successful...!");
		}  
	}

}
