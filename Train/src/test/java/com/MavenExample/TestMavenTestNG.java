package com.MavenExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMavenTestNG {
	WebDriver driver ;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gali\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void simpleTest() {
		driver.get("http://www.google.com");
		
	}
	
	@AfterTest
	public void endTest() {
		driver.quit();
	}

}
