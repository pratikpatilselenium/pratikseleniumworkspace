package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorEx2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='sc-cqpYsc bhqbRi']")).sendKeys("pizza");
		driver.findElement(By.xpath("//h5[contains(text(),'Chinchwad')]")).click();
		
		
	}

}
