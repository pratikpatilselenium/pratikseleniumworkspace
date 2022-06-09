package pageobjectmodelorangehrm;

import java.io.IOException;

public class OhrmValidLogin extends BaseTestOhrm {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTestOhrm bt = new BaseTestOhrm();
		bt.setUp();
		
		 FlibOhrm flib = new FlibOhrm();
		 String username = flib.readPropFile("./data/config1.properties", "username");
		 String password = flib.readPropFile("./data/config1.properties", "password");
		 
         LoginPageOhrm login = new LoginPageOhrm(driver);
         login.logingOhrm(username, password);
         Thread.sleep(3000);
         bt.tearDown();
         
	}

}
