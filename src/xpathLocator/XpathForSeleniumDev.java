package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForSeleniumDev {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//p[.='Java']/ancestor::div[@class='Java']/descendant::a[text()='API Docs']")).click();
		//driver.findElement(By.xpath("//p[.='Java']/ancestor::div[@class='Java']")).click();
		driver.findElement(By.xpath("//p[.='Java']/ancestor::div[@class='Java']/descendant::a[text()='API Docs']")).click();
		

	}

}
