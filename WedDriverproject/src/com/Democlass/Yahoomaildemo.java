package com.Democlass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoomaildemo {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://login.yahoo.com/");
	driver.findElement(By.id("login-username")).sendKeys("chitti1151@yahoo.com");
	driver.findElement(By.id("login-signin" )).click();
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys("prayaag0314");
	driver.findElement(By.id("login-signin" )).click();
	//driver.findElement(By.xpath("//a[text()='I'll secure my account later']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'Mail')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Compose')]")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[contains(@id,'to-field')]")).sendKeys("hemajayanthreddy@gmail.com");
	//driver.findElement(By.id("subject-field")).sendKeys("hi");
	driver.findElement(By.id("rtetext")).sendKeys("Hi hema, how are u?");
	//driver.findElement(By.xpath("//span[starts-with@id,'yui_3_16_0_ym19_1_1499')]")).click();
 // driver.findElement(By.xpath("//div[text()='Maha']")).click();
  Thread.sleep(2000);
 // driver.findElement(By.xpath(".//span[text()='Delete']")).click();
 // driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_16_0_ym19_1_1499564268440_')]")).click();
 // driver.findElement(By.xpath("//a[@class='btn x-gap btn-inbox']")).click();
//	driver.findElement(By.xpath("//b[text()='Hema']")).click();
	//driver.findElement(By.id("yucs-signout")).click();
	//driver.close();
	

	}

}
