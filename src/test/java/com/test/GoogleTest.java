package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
   
	/*WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RASHMI\\Downloads\\bselenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://www.google.com");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	*/
	
}
