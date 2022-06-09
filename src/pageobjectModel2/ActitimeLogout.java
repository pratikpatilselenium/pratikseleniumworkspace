package pageobjectModel2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ActitimeLogout extends BaseTest {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		LoginPage lp = new LoginPage(driver);
		Flibrary flib = new Flibrary();
		
		String username = flib.readPropFile(PROP_PATH, "username");
		String password = flib.readPropFile(PROP_PATH, "password");
		
		lp.actitimeValidLogin(username, password);
		
		HomePage hp = new HomePage(driver);
		hp.actitimeLogout();
		Thread.sleep(3000);
		bt.tearDown();
		

	}

}
