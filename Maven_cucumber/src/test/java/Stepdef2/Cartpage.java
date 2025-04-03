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

public class Cartpage extends common_methods{
	
    static  String s1 = "//table[@class='cart']//tbody/tr[";
    static int i=1;
    static String s2 = "]/td[3]";
    static String full_xp;
	
	@When("User select the categories")
	public void user_select_the_categories() {
		
		WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(1));
		String s = "//div[@class='master-wrapper-content']/div[2]//li[1]/a[@href='/books']";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(s)));
		ele.click();
	}
	
	@When("User click the product Name {string}")
	public void user_click_the_product_name(String string) {
		
		WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(1));
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.linkText(string)));
		ele.click();

	}
	
	@When("User Enter the Quantity {string}")
	public void user_enter_the_quantity(String string) {
		
	    dr.findElement(By.xpath("//div[@class='overview']//div[7]/div/input[1]")).clear();
	    dr.findElement(By.xpath("//div[@class='overview']//div[7]/div/input[1]")).sendKeys(string);
	}
	
	@When("User click the add to cart button")
	public void user_click_the_add_to_cart_button() throws InterruptedException {
		
		WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(1));
		String s = "//div[@class='overview']//div[7]/div/input[2]";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(s)));
		ele.click();

	}
	
	@When("User click the shopping cart button")
	public void user_click_the_shopping_cart_button() {
		
		WebDriverWait wt = new WebDriverWait(dr, Duration.ofSeconds(1));
		String s = "//div[@class='header-links-wrapper']/div/ul/li[3]";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(s)));
		ele.click();

	   
	}
	
	@Then("The product added to shopping cart page {string}")
	public void the_product_added_to_shopping_cart_page(String string) throws InterruptedException {
		//Thread.sleep(3000);
		full_xp = s1+i+s2;
		String s = dr.findElement(By.xpath(full_xp)).getText();
		i++;
		assertEquals(s,string);
	}

	
	
	
	
	
}
