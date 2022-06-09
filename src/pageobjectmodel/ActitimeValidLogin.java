package pageobjectmodel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeValidLogin extends BaseTest{

	
	public static void main(String[] args) throws IOException  {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flibrary flib = new Flibrary();
		String username = flib.readPropFile("./data/config.properties", "username");
		String password = flib.readPropFile("./data/config.properties", "password");
		
		LoginPage lgn = new LoginPage(driver);
		lgn.actitimeValidLogin(username, password);
		
		
		
		


	}

}
