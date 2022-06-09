package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//div[text()='Fashion']")).click();
		List<WebElement> element = driver.findElements(By.xpath("//a[@class='_6WOcW9']"));
		
		/*for(int i=0;i<element.size();i++)
		{
			WebElement list = element.get(i);
			System.out.println(list);
		}*/
		for (WebElement sugg:element)
		{
			String list = sugg.getText();
			System.out.println(list);
		}
	}

}
