package pageobjectModel2;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActitimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		LoginPage lgn = new LoginPage(driver);
		lgn.actitimeInvalidLogin();
		
		Thread.sleep(3000);
		bt.tearDown();
		
		
		

	}

}
