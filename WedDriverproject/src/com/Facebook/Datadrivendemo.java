package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadrivendemo {
	@Test(dataProvider="getData")
	public void adminLogin(String username,String password){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/admin/login.php?");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
		driver.quit();
	}
@DataProvider	
public Object[][] getData(){
	
	Object[][] data= new Object[3][2];
	
	data[0][0]="admin";
	data[0][1]="admin@123";
	
	data[1][0]="admin1";
	data[1][1]="admin123";
	
	data[2][0]="add";
	data[2][1]="admn23";
			
	
	
	
	return data;
	
}

	

}
