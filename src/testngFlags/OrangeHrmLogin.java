package testngFlags;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHrmLogin {
   WebDriver driver;
	@Test
    @Parameters({ "browser", "url","username","password"})
  public void orangehrmLgn(String browser,String url,String username,String password) throws InterruptedException {
	  
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get(url);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		  
	  }
	  
	  else if(browser.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		    driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get(url);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		  
	  }
	  
	  else
	  {
		  Reporter.log("invalid",true);
	  }
	  
	  
  }
}
