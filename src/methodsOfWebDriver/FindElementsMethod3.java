package methodsOfWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[.='English']")).click();
		List<WebElement> element = driver.findElements(By.xpath("//a[@class='dropdown-item']"));
		
		for(int i=0;i<element.size();i++)
		{
			WebElement list = element.get(i);
			String opt = list.getText();
			System.out.println(opt);
		}

	}

}
