package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorEx3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apple.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[.='iPhone']")).click();
		driver.findElement(By.xpath("//h3[.='iPhone 13 Pro']")).click();
		
		
		

	}

}
