package Stepdef;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_steps2 extends Utilities.common_methods  {
	

	@When("User Enter the username {string}")
	public void user_enter_the_username(String string) {
		dr.findElement(By.id("user-name")).sendKeys(string);
	}
	
	@When("User Enter the password {string}")
	public void user_enter_the_password(String string) {
		dr.findElement(By.id("password")).sendKeys(string);

	}
	
	@When("User Click the login button")
	public void user_click_the_login_button() {
		dr.findElement(By.id("login-button")).click();

	}
	
	@Then("The application should display the message {string}")
	public void the_application_should_display_the_message(String string) {
		if(string.equals("Products"))
		{
			String s = dr.findElement(By.xpath("//span[@class='title']")).getText();
			assertEquals(s, "Products");
		}
		else
		{
			String s = dr.findElement(By.xpath("//h3[@data-test='error']")).getText();
			assertEquals(string,s);
		}
	}

}
