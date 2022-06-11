package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	@DataProvider(name  = "orangehrmlogin")
	public Object[][] invalidData()
	{
		Object data[][]=new Object[4][2];
		data[0][0]="Admin";
		data[0][1]="admin1234";
		
		data[1][0]="Ad min";
		data[1][1]="admi n1234";
		
		data[2][0]="Admin$";
		data[2][1]="admin$1234";
		
		data[3][0]="Admin";
		data[3][1]="admin123";
		return data;
	}
	
	@Test(dataProvider  = "orangehrmlogin")
	public void login(String username,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
