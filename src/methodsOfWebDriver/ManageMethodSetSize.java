package methodsOfWebDriver;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodSetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		org.openqa.selenium.Dimension target=new org.openqa.selenium.Dimension(100, 200);
		driver.manage().window().setSize(target);

	}

}
