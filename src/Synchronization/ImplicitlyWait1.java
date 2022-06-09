package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://laptop-iq6c4opo/login.do");
		
		
		String obj = driver.getTitle();
		if (obj.equals("actiTIME - Login"))
		{
			System.out.println("Yes it is matched");
		}
		else
		{
			System.out.println("its not matched");
		}
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		String obj2 = driver.getTitle();
		if (obj.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Yes it is matched");
		}
		else
		{
			System.out.println("its not matched");
		}
		
		

	}

}
