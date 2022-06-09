package MethodsOfWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com");
		 WebElement obj = driver.findElement(By.name("username"));
		 WebElement obj1 = driver.findElement(By.name("password"));
		 obj.sendKeys("pratik");
		 obj1.sendKeys("123456");
		 Thread.sleep(4000);
		 obj1.clear();
		

	}

}
