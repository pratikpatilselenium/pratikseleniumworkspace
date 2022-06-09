package pageobjectModel2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeValidLogin extends BaseTest{

	
	public static void main(String[] args) throws IOException, InterruptedException  {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flibrary flib = new Flibrary();
		String username = flib.readPropFile(PROP_PATH, "username");
		String password = flib.readPropFile(PROP_PATH, "password");
		
		LoginPage lgn = new LoginPage(driver);
		lgn.actitimeValidLogin(username, password);
		Thread.sleep(3000);
		bt.tearDown();
		
		
		
		


	}

}
