package xpathLocator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorEx5 {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.myntra.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shoes");
			Thread.sleep(5000);
			List<WebElement> elements = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
			
			/*for(int i=0;i<elements.size();i++)
			{
				WebElement obj = elements.get(i);
				String list = obj.getText();
				System.out.println(list);
			}*/
			for(WebElement opt:elements)
			{
				String list = opt.getText();
				System.out.println(list);
			}
			

	}

}
