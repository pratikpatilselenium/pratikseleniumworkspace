package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshotMethod2 {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.xpath("//iframe[@id='chat-widget']"));
		element.click();
		driver.switchTo().frame(element);
		driver.findElement(By.id("name")).sendKeys("pratik");
		driver.findElement(By.id("email")).sendKeys("pratik@gmail.com");
	   // driver.findElement(By.xpath("//label[@id='react-aria-5359376287-12']/following-sibling::input[@id='cao9y0rsr1a_146917605549304831']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//span[.='Start the chat']")).click();
		Thread.sleep(4000);
		File src = driver.getScreenshotAs(OutputType.FILE);;
		File type = new File("./screenshots/selenium2.png");
		Files.copy(src, type);
		
		

	}

}
