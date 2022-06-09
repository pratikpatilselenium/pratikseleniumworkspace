package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByUsingForLoop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/HTML/MultiSelectDropdown.html");
		Thread.sleep(4000);
		WebElement obj = driver.findElement(By.id("menu"));
		Select sel = new Select(obj);
		for(int i=1;i<=9;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		sel.deselectAll();
	}

}
