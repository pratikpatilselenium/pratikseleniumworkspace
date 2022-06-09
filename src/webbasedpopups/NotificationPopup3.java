package webbasedpopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		co.addArguments("-start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://optinmonster.com/what-is-a-popup-notification/");
		
		
	}

}
