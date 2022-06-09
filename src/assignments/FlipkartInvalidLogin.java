package assignments;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartInvalidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		WebElement element = driver.findElement(By.xpath("//a[.='Login']"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(element).perform();
		driver.findElement(By.xpath("//div[.='My Profile']")).click();
		Thread.sleep(2000);


		FileLibraryFlipkart f1 = new FileLibraryFlipkart();

		int data = f1.rowCount("./data/FlipkartLoginData.xlsx", "FlipkartInvalidLoginCreds");
		System.out.println(data);
		for(int i=1;i<=data;i++)
		{
			String username = f1.readData("./data/FlipkartLoginData.xlsx", "FlipkartInvalidLoginCreds", i, 0);
			String password = f1.readData("./data/FlipkartLoginData.xlsx", "FlipkartInvalidLoginCreds", i, 1);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(username);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys(password);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']/descendant::span[.='Login']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).clear();
		}

	}

}
