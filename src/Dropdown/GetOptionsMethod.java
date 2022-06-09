package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/HTML/MultiSelectDropdown.html");
		Thread.sleep(5000);
		WebElement obj = driver.findElement(By.id("menu"));
		Select element = new Select(obj);
		List<WebElement> text = element.getOptions();
		for(int i=0;i<text.size();i++)
		{
			WebElement s = text.get(i);
			String list = s.getText();
			System.out.println(list);
		}

	}

}
