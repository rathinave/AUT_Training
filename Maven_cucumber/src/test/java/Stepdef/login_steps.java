package Stepdef;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps extends Utilities.common_methods {

	@Given("Login page is displayed")
	public void login_page_is_displayed() {

	    Launch_chrome("https://www.saucedemo.com/");
	    System.err.println("The Login page is displayed");
	}
	
	@When("Enter the username")
	public void enter_the_username() {
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
	   
	}
	
	@When("Enter the password")
	public void enter_the_password() {
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	
	@When("Click the login button")
	public void click_the_login_button() {
		dr.findElement(By.id("login-button")).click();
	}
	
	@Then("The Product page is displayed")
	public void the_product_page_is_displayed() {
		String s = dr.findElement(By.xpath("//span[@class='title']")).getText();
		assertEquals(s, "Products");
	}
	
	@Then("The Page was closed")
	public void the_page_was_closed() {
	    dr.quit();
	}
	
}
