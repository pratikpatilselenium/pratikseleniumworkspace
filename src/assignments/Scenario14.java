package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario14 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		WebElement coins = driver.findElement(By.xpath("//a[.='Coins ']"));
		Actions act=new Actions(driver);
		act.moveToElement(coins).perform();
		driver.findElement(By.xpath("//span[.='1 gram' and @data-p='gold-coins-weight-1gms,m' ]")).click();
		WebElement coin = driver.findElement(By.xpath("//h1[.='1 gram 24 KT Gold Coin']"));
		boolean goldCoin = coin.isDisplayed();
		System.out.println(goldCoin);

	}

}
