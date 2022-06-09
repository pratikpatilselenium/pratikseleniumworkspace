package testngpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelMethodExecution {
	WebDriver driver;
	@BeforeClass
	public void setProperty()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	@BeforeMethod
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com");
		
		

	}
	@Test
	public void browser1() {
		Reporter.log("browser1 opened",true);
	}

	@Test
	public void browser2() {
		Reporter.log("browser2 opened",true);
	}

	@Test
	public void browser3() {
		Reporter.log("browser3 opened",true);
	}

	@Test
	public void browser4() {
		Reporter.log("browser4 opened",true);
	}
}
