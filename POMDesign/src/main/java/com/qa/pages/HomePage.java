package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(id="accountSignOut")
	WebElement accountSignout;
	
	@FindBy(id="section-account")
	WebElement accountMenu;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public void signOut() {
		//System.out.println(accountMenu.getAttribute("title"));
		Actions actions = new Actions(driver);
		actions.moveToElement(accountMenu).build().perform();
		accountSignout.click();
	}

	/**
	 * @return
	 */
	public String validateAccountSignInSignOut() {
		return accountMenu.getAttribute("title");
	}
	
}
