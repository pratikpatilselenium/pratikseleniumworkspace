package dynamicalscreenshot2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListner.class)


public class TestCase extends BaseTest {
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	@Test
	public void validLiginActitime()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebElement actitime = driver.findElement(By.xpath("//img[@src='/img/default/top_nav/default-logo.png?hash=1692528820']"));
		boolean status = actitime.isDisplayed();
		Assert.assertEquals(status, true);
		
		
	}
	
	@Test
	public void failActitime1()
	{
		Assert.fail();
	}
	
	@Test
	public void failActitime2()
	{
		Assert.fail();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
