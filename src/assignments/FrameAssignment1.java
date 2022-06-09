package assignments;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FrameAssignment1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement element = driver.findElement(By.xpath("//iframe[@name='chat-widget']"));
		element.click();
		driver.switchTo().frame(element);
		
		driver.findElement(By.id("name")).sendKeys("pratik");
		driver.findElement(By.id("email")).sendKeys("pratik@gmail.com");
		
		driver.findElement(By.xpath("//span[.='Start the chat']")).click();
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/selenium3.jpeg");
		Files.copy(src, dest);
		
		
		
		
	}

}
