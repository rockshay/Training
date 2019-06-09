package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest() {
		super();
		loginPage = new LoginPage();
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
	}
	
	@BeforeTest
	public void login() throws Exception {
		homePage = loginPage.login("akshay123409876@gmail.com", "Password123");
	}
	
	@Test
	public void validateAccountLogin() {
		String homePageTitle = homePage.validatePageTitle();
		Assert.assertEquals(homePageTitle, "Staples® Official Online Store"); 
		
		String validateSignIn = homePage.validateAccountSignInSignOut();
		Assert.assertEquals(validateSignIn,"Account");
	}
	
	@Test
	public void logoutTest() throws Exception {
		homePage.signOut();
		String validateSignout = homePage.validateAccountSignInSignOut();
		Assert.assertEquals(validateSignout,"Sign In");
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
