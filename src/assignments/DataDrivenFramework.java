package assignments;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DataDrivenFramework {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		FileLibraryFlipkart fl = new FileLibraryFlipkart();
		String username = fl.readData("./data/FlipkartLoginData.xlsx", "FlipkartLoginCreds", 1, 0);
		String password = fl.readData("./data/FlipkartLoginData.xlsx", "FlipkartLoginCreds", 1, 1);

		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//a[.='Login']"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(element).perform();
		driver.findElement(By.xpath("//div[.='My Profile']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']/descendant::span[.='Login']")).click();
		
		
		
		

	}

}
