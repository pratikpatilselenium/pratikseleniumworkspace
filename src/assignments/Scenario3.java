package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
	
		act.dragAndDrop(src, target).perform();
		
		
		
	}

}
