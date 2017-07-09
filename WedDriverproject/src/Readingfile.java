
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Readingfile {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.callhealth.com/#!/home");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@class='close freedomClose']")).click();
		driver.findElement(By.xpath(".//*[@id='CPCarousel']/ol/li[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath(".//a[text()='Consult a Doctor Now']")).click();
		//Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[text()='Consult Now']")).click();
		driver.findElement(By.id("eConOrder")).click();
		driver.findElement(By.id("eConOrder")).sendKeys("ENT");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Book Service']")).click();
		driver.findElement(By.xpath(".//*[@id='emailId']")).sendKeys("lathareddy");
		driver.findElement(By.xpath(".//*[@id='passwordVal']")).sendKeys("Jhspreddy$");
		driver.findElement(By.xpath(".//*[text()='Login']")).click();
		//driver.close();
			
	}
		


			
		
		

		 
	
	
		
				
		
		
		
		
	}
	
	
	