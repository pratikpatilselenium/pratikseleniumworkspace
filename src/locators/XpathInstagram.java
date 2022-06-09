package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathInstagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		
		Thread.sleep(4000);
		//login operation
		
		
		driver.findElement(By.name("username")).sendKeys("pratik");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.cssSelector("button[class*='L3NKy']")).click();
		driver.close();
		
		
		
	}

}