package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorEx6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shoes");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		Thread.sleep(3000);
		String options = driver.findElement(By.xpath("(//div[@class='product-productMetaInfo'])[1]/ancestor::a[@target='_blank']/descendant::h3[@class='product-brand']")).getText();
		System.out.println(options);

	}

}
