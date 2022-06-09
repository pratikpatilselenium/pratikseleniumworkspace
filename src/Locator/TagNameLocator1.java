package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/HTML/text.html");
		driver.findElement(By.id("i1")).sendKeys("chhpri");
		driver.findElement(By.id("i2")).sendKeys("nibba");
		Thread.sleep(5000);
		driver.close();

	}

}
