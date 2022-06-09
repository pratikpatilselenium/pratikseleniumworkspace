package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.Text;

public class Scenerio5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		WebElement element = driver.findElement(By.xpath("//a[.='Rings ']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(element).perform();
		driver.findElement(By.xpath("//a[.='Diamond' and @title='Diamond Rings']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='new-price']"));
		for(int i=0;i<list.size();i++)
		{
			WebElement ob = list.get(i);
			String text = ob.getText();
		
			System.out.println(text);
		}
		WebElement element1 = driver.findElement(By.xpath("//span[.=' Popular ']"));
		Thread.sleep(2000);
		act.moveToElement(element1).perform();
		driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
		List<WebElement> list1 = driver.findElements(By.xpath("//span[@class='new-price']"));
		System.out.println("------------------------------------------");
		
		for (int i=0;i<list1.size();i++)
		{
			WebElement ob1 = list1.get(i);
			
			String text1 = ob1.getText();
	
			System.out.println(text1);
		}
		
		if(list.equals(list1))
		{
			System.out.println("both prices are same");
		}
		else
		{
			System.out.println("prices are not same");
		}
		
		Thread.sleep(4000);
		driver.close();
		

	}

}
