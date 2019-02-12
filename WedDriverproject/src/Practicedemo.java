import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practicedemo{
	
	public static void main(String[] args) throws InterruptedException {
		//this has been modified
		//testng has been added to the project
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicibank.com/");
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//*[text()='Allow']")).click();
		
		WebElement mousehover = driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/a[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(mousehover).perform();
		
		driver.findElement(By.linkText("Personal, NRI and Young Stars")).click();
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL")).sendKeys("helloworld");
		driver.findElement(By.id("AuthenticationFG.ACCESS_CODE")).sendKeys("324566");
		driver.findElement(By.id("VALIDATE_CREDENTIALS1")).click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.contains("https://infinity.icicibank.com/corp/AuthenticationControlle")){
			System.out.println("test case is passed");
		}
		else
		{
			System.out.println("test case is failed");
		}
		
		driver.close();
		
		
		
	}
	
	}


