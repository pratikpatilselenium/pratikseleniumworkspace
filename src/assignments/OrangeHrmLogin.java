package assignments;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		FileLibraryFlipkart flib=new FileLibraryFlipkart();
		int data = flib.rowCount("./data/FlipkartLoginData.xlsx", "FlipkartInvalidLoginCreds");


		for(int i=1;i<=data;i++)
		{
			String username = flib.readData("./data/FlipkartLoginData.xlsx", "FlipkartInvalidLoginCreds", i, 0);
			String password = flib.readData("./data/FlipkartLoginData.xlsx", "FlipkartInvalidLoginCreds", i, 1);
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		}

	}

}
