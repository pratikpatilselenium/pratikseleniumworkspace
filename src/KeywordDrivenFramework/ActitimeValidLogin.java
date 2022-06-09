package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActitimeValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.OpenBrowser();
		Flib flib = new Flib();
		
		String username = flib.readPropertyFile(PROP_PATH, "password");
		
		String password = flib.readPropertyFile(PROP_PATH, "password");
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		bt.closeBrowser();
		
		

	}

}
