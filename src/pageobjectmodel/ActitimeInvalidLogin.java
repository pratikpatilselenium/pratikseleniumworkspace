package pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActitimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		LoginPage lgn = new LoginPage(driver);
		lgn.actitimeInvalidLogin();
		
		
		

	}

}
