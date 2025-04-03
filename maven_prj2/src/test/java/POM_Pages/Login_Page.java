package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	WebDriver dr;
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement uname;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement btn;
	
	public Login_Page(WebDriver dr)
	{
		this.dr = dr;
		PageFactory.initElements(dr,this);
	}
	
	public void enter_name(String str)
	{
		uname.sendKeys(str);
	}
	
	public void enter_pwd(String str)
	{
		pwd.sendKeys(str);
	}
	
	public void click_login()
	{
		btn.click();
	}
	

}
