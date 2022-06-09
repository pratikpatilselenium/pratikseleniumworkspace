package assignments;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBasedPopupUsingRobotClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.filemail.com/share/upload-file");
		driver.findElement(By.xpath("//span[.='Add Files']")).click();
		
		Thread.sleep(3000);
		//Runtime.getRuntime().exec("C:/Users/HP/Desktop/filemailupload.exe");
		Runtime.getRuntime().exec("C:/Users/HP/Desktop/filemailupload2.exe");

	}

}
