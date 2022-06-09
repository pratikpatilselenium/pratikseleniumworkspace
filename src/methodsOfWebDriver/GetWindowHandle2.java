package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 13pro max",Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='APPLE iPhone 13 Pro Max (Graphite, 512 GB)']")).click();
		String parentHandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		for (String handle:allHandles)
		{
			if(!handle.equals(parentHandle))
			{
				driver.switchTo().window(handle);
			}
			else
			{
				
			}
		}
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
		
		

	}

}
