package Dropdown;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateValues {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/HTML/MultiSelectDropdown.html");
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.id("menu"));
		Select option=new Select(element);
		List<WebElement> obj = option.getOptions();
		TreeSet<String> list = new TreeSet<String>();
		for(int i=0;i<obj.size();i++)
		{
			WebElement se = obj.get(i);
			String p = se.getText();
			list.add(p);

		}

		for(String s:list)
		{
			System.out.println(s);
		}




	}

}
