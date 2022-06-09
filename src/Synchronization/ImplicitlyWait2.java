package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitlyWait2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//actiTIME - Login//actiTIME - Enter Time-Track
		driver.get("http://laptop-iq6c4opo/login.do");
		
		//WebDriverWait obj = new WebDriverWait(driver,30)
		//obj.until(ExpectedConditions.titleContains("login"));
		System.out.println("login page is verified");
		
		
		String obj1= driver.getTitle();
		
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//obj.until(ExpectedConditions.titleContains(Enter));
		
		

	}

}
