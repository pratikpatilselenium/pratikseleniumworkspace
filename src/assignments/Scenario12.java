package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario12 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		driver.findElement(By.xpath("//span[.='Offers ']")).click();
		WebElement element = driver.findElement(By.xpath("//section[@id='Offers-form']"));
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		driver.findElement(By.xpath("//span[@class='prcs-dlh' and @data-displayname='20% Making Charge Off' ]")).click();
		List<WebElement> discount = driver.findElements(By.xpath("//span[.=' 20% off on making charge ']"));
		
		for(int i=0;i<discount.size();i++)
		{
			WebElement display = discount.get(i);
			boolean list = display.isDisplayed();
			System.out.println(list);
			
		}
		

	}

}
