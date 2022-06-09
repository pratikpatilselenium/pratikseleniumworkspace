package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario10 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(5000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='chat-widget']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("pratik");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pratik@gmail.com");
		driver.findElement(By.xpath("//input[@name='9tusxwjr93j_146917605549304831' and @id='9tusxwjr93j_146917605549304831']")).sendKeys("123456");
		driver.findElement(By.xpath("//span[.='Start the chat']")).click();
		
		
		
	}

}
