package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	HomePage homePage;

	//PageFactory
	@FindBy(id="emailId")
	WebElement emailAdr;
	
	@FindBy(id="passwordId")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"wrapall\"]/div/app-root/div/ng-component/div/app-create-account/div/form/div/div[2]/div[4]/div[2]/button")
	WebElement signInBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String email,String pwd) throws Exception{
		emailAdr.sendKeys(email);
		password.sendKeys(pwd);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(signInBtn).click().build().perform();
		signInBtn.click();
		return homePage;
	}
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	
}
