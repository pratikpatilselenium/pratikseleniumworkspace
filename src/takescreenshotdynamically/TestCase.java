package takescreenshotdynamically;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListner.class)
public class TestCase extends BaseTest{
	
	@BeforeMethod
	public void setup()
	{
		initialization();
	}
	
	@Test
	public void validLogin() throws InterruptedException
	{
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
	}
	
	@Test
	public void fail1()
	{
		Assert.fail();
	}
	
	
	@Test
	public void fail2()
	{
		Assert.fail();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
