package com.Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ParallelDemo {
  WebDriver driver;
    @BeforeMethod
	public void launchBrowser(){
    	driver=new ChromeDriver();
    		   	     	
	}
	
	@Test
	public void loginFacebook(){
		driver.get("https://www.facebook.com/");
		String pagetitle=driver.getTitle();
		System.err.println(pagetitle);
		
	}
	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}
}
