package methodsOfWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindElementsMethod2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		WebElement ele = driver.findElement(By.xpath("//a[.='Earrings ']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(4000);
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='prcs-d']"));
		for(int i=0;i<list.size();i++)
		{
			WebElement getList = list.get(i);
			String text = getList.getText();
			System.out.println(text);
		}

	}

}
