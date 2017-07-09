import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadrivenframeworkdemo {
	public static WebDriver driver;
	@Test(dataProvider="getData")
	public  void Adminlogin(String username, String password) throws InterruptedException{
		driver= new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		System.out.println(driver.getTitle());
		Assert.assertEquals("http://opensource.demo.orangehrmlive.com/index.php/dashboard", driver.getCurrentUrl());
		driver.close();
	}
	
	

	@DataProvider
	public Object[][] getData(){
		
		Object[][] data=new Object[2][2];
		data[0][0]="Admin";
		data[0][1]="ddmin1";
		
		data[1][0]="Admin";
		data[1][1]="admin";
		
		
		return data;
		
		
		
		
		
	
	

	}

}
