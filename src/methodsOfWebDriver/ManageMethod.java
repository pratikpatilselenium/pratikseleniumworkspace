package methodsOfWebDriver;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*Options op = driver.manage();
		org.openqa.selenium.WebDriver.Window wi = op.window();
		wi.maximize();*/
	}

}
