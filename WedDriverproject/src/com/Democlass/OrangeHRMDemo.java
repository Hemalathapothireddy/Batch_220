package com.Democlass;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRMDemo {
	WebDriver driver;
	static String username="Admin";
	static String password="admin";
	@BeforeMethod
	public void loginPage(){
		 driver=new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
	}
	@Test
	public void recruitment(){
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		//Actions action=new Actions(driver);
		//action.moveToElement(obj).perform();
		//driver.findElement(By.id("menu_recruitment_viewCandidates")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("hemalatha");
		WebElement role=driver.findElement(By.id("searchSystemUser_userType"));
		Select dropdown=new Select(role);
		dropdown.selectByVisibleText("ESS");
		List<WebElement>options=dropdown.getOptions();
		System.out.println(options.size());
		for(int a=0; a<options.size(); a++){
			System.out.println(options.get(a).getText());
		}
		driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Fiona Grace");
		WebElement status=driver.findElement(By.id("searchSystemUser_status"));
		Select dropdown1=new Select(status);
		dropdown1.selectByIndex(2);
		driver.findElement(By.id("searchBtn")).click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "http://opensource.demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
	}
	
	@AfterMethod
    public void closeBrowser(){
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
		driver.close();
	
}
}
