package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario15 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		WebElement coins = driver.findElement(By.xpath("//a[.='Coins ']"));
		Actions act=new Actions(driver);
		act.moveToElement(coins).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='2 gram' and @data-p='gold-coins-weight-2gms,m' ]")).click();
		WebElement coin = driver.findElement(By.xpath("//h1[.='2 gram 24 KT Gold Coin']"));
		boolean goldCoin = coin.isDisplayed();
		System.out.println(goldCoin);

	}

}
