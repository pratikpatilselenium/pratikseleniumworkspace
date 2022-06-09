package assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que4 {

	public static void main(String[] args) throws InterruptedException {
		//perform the action (maximize) on any of the child window
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
		String parentHandle = driver.getWindowHandle();
		Set<String> allHandle = driver.getWindowHandles();
		
		for(String wh:allHandle)
		{
			if(!parentHandle.equals(wh))
			{
				Thread.sleep(2000);
				driver.switchTo().window(wh).manage().window().maximize();
			}
		}

	}

}
