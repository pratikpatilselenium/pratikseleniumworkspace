package assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTestNG {
	WebDriver driver;
	@BeforeClass
	public void setProperty()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	@BeforeMethod
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	@Test
	public void orangeHrmLogin() throws InterruptedException {

		SoftAssert softAssert = new SoftAssert();
		String actualLoginPageTitle = driver.getTitle();
		softAssert.assertEquals(actualLoginPageTitle, "OrangeHRM");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(4000);
		WebElement dashboard = driver.findElement(By.xpath("//h1[.='Dashboard']"));
		boolean statusOfDashboard = dashboard.isDisplayed();
		Assert.assertEquals(statusOfDashboard, true);
		String actualHomePageTitle = driver.getTitle();
		softAssert.assertEquals(actualHomePageTitle, "OrangeHRMHomePage");
		Reporter.log("create user",true);
		Reporter.log("create new contact",true);
		softAssert.assertAll();






	}
}
