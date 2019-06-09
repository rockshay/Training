package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	HomePage homePage;

	//PageFactory
	@FindBy(id="username")
	WebElement emailAdr;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="sign-in-button")
	WebElement signInBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String email,String pwd) throws Exception{
		emailAdr.sendKeys(email);
		password.sendKeys(pwd);
		signInBtn.click();
		return new HomePage();
	}
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	
}
