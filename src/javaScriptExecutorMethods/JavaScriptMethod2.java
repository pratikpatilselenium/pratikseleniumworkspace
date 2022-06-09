package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptMethod2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/HTML/DisabledLoginPage.html");
		 WebElement usn = driver.findElement(By.id("i1"));
		WebElement pass = driver.findElement(By.id("i2"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		if(usn.isEnabled())
		{
			usn.sendKeys("sotu");
			System.out.println("if executed");
		}
		else
		{
			jse.executeScript("document.getElementById(\"i1\").value='sotu'");
			System.out.println("else executed");
		}
		
		if(pass.isEnabled())
		{
			pass.sendKeys("sotu123");
			System.out.println("if executed");
		}
		else
		{
			jse.executeScript("document.getElementsByName(\"n2\").value='sotu123'");
			System.out.println("else executed");
		}
		
		
		
		
		
		

	}

}
