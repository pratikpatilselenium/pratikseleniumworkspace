package assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandleMethodUsingForLoop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.guru99.com/file-sharing-sites.html");
		WebElement element = driver.findElement(By.xpath("//a[.='https://disk.yandex.com/']"));
		Point loc = element.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		Thread.sleep(4000);
		element.click();
		String parentHandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		//Using advance for loop
		/*for(String wh:allHandles)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
		}*/
		
		//using iterator
		java.util.Iterator<String> it=allHandles.iterator();
		
		while (it.hasNext())
		{
			String handle = it.next();
			if (!parentHandle.equals(handle))
			{
				driver.switchTo().window(handle);
			}
		}
		
		
		driver.findElement(By.xpath("//h2[@id='share-title']/ancestor::div[@class='info info_background-blue']/descendant::a[@class='button button_register button_with-icon']/descendant::span[.='Get started']")).click();
		
		
		
		

	}

	private static void While(boolean hasNext) {
		// TODO Auto-generated method stub
		
	}

}
