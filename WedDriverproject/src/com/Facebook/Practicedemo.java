package com.Facebook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practicedemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.icicibank.com/index2.page");
		driver.findElement(By.xpath("//a[text()='Allow']")).click();
		driver.findElement(By.linkText("Private")).click();	
		   String parent = driver.getWindowHandle();
		   System.out.println(parent);
		   for(String child:driver.getWindowHandles()){
			   System.out.println(child);
			   driver.switchTo().window(child);}
			   driver.findElement(By.id("Search")).sendKeys("helloworld");
			 String url=driver.getCurrentUrl();
			 if(url.equals("http://www.icicibankprivatebanking.com/")){
				 System.out.println("test is passed");
			 }
			 else{
				 System.out.println("test is faled");
			 }
			 driver.switchTo().window(parent);
			 driver.findElement(By.linkText("NRI")).click();
			 String url1=driver.getCurrentUrl();
	if(url1.equals("https://www.icicibank.com/nri-banking/nri-banking.page?")){
				 System.out.println("test is passed2");
			 }
			 else{
				 System.err.println("test is failed2");
			 }
		   
		driver.close();
	}
	
	
	

}
