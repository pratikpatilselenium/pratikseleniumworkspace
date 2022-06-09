package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathUsingAxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='desktop-bound']/descendant::input[@class='desktop-searchBar']")).sendKeys("tshirts",Keys.ENTER);
		driver.findElement(By.xpath("//h4[.='Yoga Tshirts']/ancestor::div[@class='product-productMetaInfo']/descendant::span[@class='product-discountedPrice']")).click();

	}

}
