package Dropdown;

import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/HTML/Single%20select%20Dropdown.html");
		Thread.sleep(5000);
		WebElement selectElement = driver.findElement(By.id("menu"));
	    Select option = new Select(selectElement);
	    option.selectByIndex(2);
		

	}

}
