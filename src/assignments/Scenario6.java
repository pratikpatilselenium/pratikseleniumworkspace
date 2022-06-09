package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario6 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		WebElement rings = driver.findElement(By.xpath("//a[.='Rings ']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(rings).perform();
		
		driver.findElement(By.xpath("//a[.='Diamond' and @title='Diamond Rings']")).click();
		List<WebElement> defaultPrice = driver.findElements(By.xpath("//span[@class='new-price']"));
		JavascriptExecutor je=(JavascriptExecutor)driver;
		for(int i=0;i<defaultPrice.size();i++)
		{
			WebElement defaultList = defaultPrice.get(i);
			Point loc = defaultList.getLocation();
			int xaxis = loc.getX();
			int yaxis = loc.getY();
			je.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
					
			String list = defaultList.getText();
			System.out.println(list);
			Thread.sleep(1000);
			
		}
		System.out.println("--------------------------------------------------");
		
		WebElement pupular = driver.findElement(By.xpath("//span[.=' Popular ']"));
		Thread.sleep(3000);
		act.moveToElement(pupular).perform();
		driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
		List<WebElement> lowToHigh = driver.findElements(By.xpath("//span[@class='new-price']"));
		
		for(int i=0;i<lowToHigh.size();i++)
		{
			WebElement obj = lowToHigh.get(i);
			Point loc1 = obj.getLocation();
			int xa = loc1.getX();
			
			int ya = loc1.getY();
			je.executeScript("window.scrollBy("+xa+","+ya+")");
			
			String sortedList = obj.getText();
			System.out.println(sortedList);
			Thread.sleep(1000);
		}
		
		if(defaultPrice.equals(lowToHigh))
		{
			System.out.println("default price and sorted price are same");
		}
		else
		{
			System.out.println("default price and sorted price are not same");
		}

	}

}
