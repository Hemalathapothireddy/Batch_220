package com.Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Paralleldemonew {
	WebDriver driver;
    @BeforeMethod
	public void launchBrowser(){
    	driver=new ChromeDriver();
    			
     }
    @Test
	public void loginGoogle(){
    	driver.get("https://www.google.co.in/");
		String title=driver.getTitle();
		System.out.println(title);
		
	}
    @AfterMethod
    public void closeBrowser(){
    	driver.close();
    }

}
