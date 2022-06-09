package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorCase3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodlandworldwide.com/collections?clgId=10");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Footwear")).click();
		driver.findElement(By.xpath("//span[contains(text(),' sandals olive')]")).click();

	}

}