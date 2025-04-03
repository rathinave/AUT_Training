package Stepdef1;

import static org.testng.Assert.assertEquals;
import POM_Pages.Login_Page;
import POM_Pages.Product_Page;
import Utilities.Base_class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Base_class {
	Login_Page lp;
	Product_Page pp;
	
	@Given("Login page is displayed")
	public void login_page_is_displayed() {
		Launch_chrome("https://www.saucedemo.com/");
		lp = new Login_Page(dr);
		pp = new Product_Page(dr);
	}
	@When("Enter the username {string}")
	public void enter_the_username(String string) {
	    lp.enter_name(string);
	}
	@When("Enter the password {string}")
	public void enter_the_password(String string) {
		lp.enter_pwd("secret_sauce");
	}
	@When("Click the login button")
	public void click_the_login_button() throws InterruptedException {
		Thread.sleep(3000);
		lp.click_login();
	}
	@Then("The Product page is displayed {string}")
	public void the_product_page_is_displayed(String string) {
		String s= pp.get_title();	
		assertEquals(string, s);
	}
	@Then("The Page was closed")
	public void the_page_was_closed() throws InterruptedException {
		  Thread.sleep(3000);
		  dr.quit();
	}
	



}
