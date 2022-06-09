package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OperationalMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/HTML/MultiSelectDropdown.html");
		Thread.sleep(5000);
		WebElement obj = driver.findElement(By.id("menu"));
		Select sel = new Select(obj);
		for(int i=0;i<=6;i++)
		{
			sel.selectByIndex(i);
		}
		
		WebElement element = sel.getFirstSelectedOption();
		String text = element.getText();
		System.out.println(text);

	}

}
