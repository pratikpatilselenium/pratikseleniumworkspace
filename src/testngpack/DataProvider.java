package testngpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DataProvider {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-iq6c4opo/login.do");

	}



	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

    @org.testng.annotations.DataProvider(name = "testDataActitime")
    public  Object[][] testData()
    {
    	Object[][] data= new Object[4][2];
    	
    	data[0][0]="admin";
    	data[0][1]="man ager";
    	
    	data[1][0]="ad min";
    	data[1][1]="manager";
    	
    	data[2][0]="admin123";
    	data[2][1]="manager1245";
    	
    	data[3][0]="admin$";
    	data[3][1]="dgsh$12";
    	
		return data;
    	
    }


	@Test(dataProvider = "testDataActitime")
	public void loginActitime(String username, String password) throws InterruptedException {

		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		
	}

}
