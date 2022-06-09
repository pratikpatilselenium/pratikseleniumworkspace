package methodsOfWebDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetWindowHandelMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		WebElement element = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		driver.findElement(By.xpath("//span[.='Kadas']")).click();
		driver.findElement(By.xpath("//span[@class='p-wrap']/descendant::a[@target='_blank' and @id='pid_8967' ]")).click();
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		Set<String> allHandles = driver.getWindowHandles();
		System.out.println(allHandles);
	
		
		
		for(String wh:allHandles)
		{
			System.out.println(wh);
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
			
		}
		driver.findElement(By.xpath("//span[.=' Select Size ']")).click();
		driver.findElement(By.xpath("//span[.='2-2(2 2/16\")']")).click();
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();

	}

}
