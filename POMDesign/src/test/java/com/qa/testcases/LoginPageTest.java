package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test
	public void loginPageTitleTest() {
		String title = loginPage.validatePageTitle();
		Assert.assertEquals(title, "It's easy to find the Office Supplies, Copy Paper, Furniture, Ink, Toner, Cleaning Products, Electronics and the Technology you need | Staples®");
	}
	
	@Test
	public void loginTest() throws Exception {
		homePage = loginPage.login("akshay123409876@gmail.com", "Password123");
		Thread.sleep(5000);
		String homePageTitle = homePage.validatePageTitle();
		Assert.assertEquals(homePageTitle, "Staples® Official Online Store"); 
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
