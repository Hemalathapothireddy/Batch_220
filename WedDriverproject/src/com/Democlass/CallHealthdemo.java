package com.Democlass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.jna.platform.win32.OaIdl.SYSKIND;

public class CallHealthdemo {
	
		
  
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.amazon.com");
		driver.findElement(By.xpath(".//*[@id='navSwmHoliday']/a")).click();
		driver.findElement(By.linkText("Camera and Photo")).click();
		WebElement camera=driver.findElement(By.xpath(".//span[text()='Sports & Action Cameras']"));
		Actions action=new Actions(driver);
		action.moveToElement(camera).perform();
		//Thread.sleep(3000);
		driver.findElement(By.xpath(".//div[text()='Sony']")).click();
		if(driver.findElement(By.xpath(".//div[text()='Sony']")).isDisplayed()){
			System.out.println("test is passed");
		}
		else{System.out.println("test is failed");}
		*///driver.close();
		/*driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Your Orders")).click();
		driver.findElement(By.id("signInSubmit")).click();		WebElement errorMessage=driver.findElement(By.xpath(".//*[@id='auth-password-missing-alert']/div/div"));
		System.out.println(errorMessage.getText());
		  errorMessage = driver.findElement(By.xpath(".//*[@id='auth-email-missing-alert']/div/div"));
		  System.out.println(errorMessage.getText());
	
	*/
		//driver.findElement(By.id("ap_email")).sendKeys("lathareddy");
		//driver.findElement(By.id("ap_password")).sendKeys("hello123");
		//driver.findElement(By.id("signInSubmit")).click();
		//driver.findElement(By.name("rememberMe")).click();
		//driver.findElement(By.id("auth-fpp-link-bottom")).click();
			//if(driver.findElement(By.id("ap_forgotpassword1A_footer_string_header")).isDisplayed())
			//{
				//System.out.println("test is passed");
		//}
		//else{System.out.println("test is failed");}
				
		
		
			Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0,-500)");
		driver.get("https://www.callhealth.com/");
		driver.findElement(By.xpath("//a[@class='login noAnc logReg']")).click();
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		Thread.sleep(3000);
				driver.findElement(By.xpath("//*[text()='Medicines at Home']")).click();
				String url=driver.getCurrentUrl();
				System.out.println(url);
				
				if (url.equals("https://www.callhealth.com/medicines/medicines-at-home")){
					System.out.println("test is passed");
				}
				else{
					System.err.println("test is failed");
				}
		
		 
				//driver.close();
	  
		

	}

}
