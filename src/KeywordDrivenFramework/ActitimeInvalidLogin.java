package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActitimeInvalidLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		BaseTest bt = new BaseTest();
		bt.OpenBrowser();
		
		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH, "InvalidLoginCreds");
		for(int i=1;i<=rc;i++)
		{
		   String username = flib.readDataFromExcel(EXCEL_PATH, "InvalidLoginCreds", i, 0);
		   String password = flib.readDataFromExcel(EXCEL_PATH, "InvalidLoginCreds", i, 1);
		   
		   driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("username")).clear();
			
			
		}

	}

}
