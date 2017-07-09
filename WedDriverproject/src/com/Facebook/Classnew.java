package com.Facebook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class Classnew {
	
	
	
public static void main(String[] args) {
	
//this from hema
	
	WebDriver driver=new ChromeDriver();
		driver=new ChromeDriver();
		driver.get("https://www.macys.com/");
		WebElement movehover = driver.findElement(By.id("flexid_22672"));
		Actions action=new Actions(driver);
		action.moveToElement(movehover).perform();
		driver.findElement(By.linkText("Mattresses")).click();
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains(driver.getCurrentUrl()));
		driver.close();
	}

	
		
	

	
		
		
	
    
    
		 
	
		 }


