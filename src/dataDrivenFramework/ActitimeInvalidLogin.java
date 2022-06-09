package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeInvalidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://laptop-iq6c4opo/login.do");
		FileLibrary flib=new FileLibrary();
		
		int invalidScenarios = flib.getRowCount("./data/ActitimeTestData.xlsx", "InvalidLoginCreds");
		
		
		for(int i=1;i<=invalidScenarios;i++)
		{
			
		
			String username = flib.readData("./data/ActitimeTestData.xlsx", "InvalidLoginCreds", i, 0);
			
			String password = flib.readData("./data/ActitimeTestData.xlsx", "InvalidLoginCreds", i, 1);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		}

	}

}
