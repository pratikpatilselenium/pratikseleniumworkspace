package Dropdown;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HashsetClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/HTML/MultiSelectDropdown.html");
		Thread.sleep(4000);
		WebElement obj = driver.findElement(By.id("menu"));
		Select opt=new Select(obj);
		
		List<WebElement> list = opt.getOptions();
		
		HashSet<String> obj1=new HashSet<String>();
		for (int i=0;i<list.size();i++)
		{
			WebElement option = list.get(i);
			String s = option.getText();
			obj1.add(s);

		}

		for(String se:obj1)
		{
			System.out.println(se);
		}





	}

}
