package assignments;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class WoodlandWebsite {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("-start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.navigate().to("https://www.woodlandworldwide.com/");
		WebElement element = driver.findElement(By.id("tp_men"));
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		driver.findElement(By.xpath("//a[@id='men_apparels_t-shirts_round-tees']")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='price']"));
		JavascriptExecutor je=(JavascriptExecutor)driver;
		
		for(int i=0;i<elements.size();i++)
		{
			WebElement list = elements.get(i);
			Point loc = list.getLocation();
			int xaxis = loc.getX();
			int yaxis = loc.getY();
			je.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
			String price = list.getText();
			Thread.sleep(2000);
			System.out.println(price);
			
		}
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File f=new File("./screenshots/woodland.png");
		Files.copy(sc, f);
		
		

	}

}
