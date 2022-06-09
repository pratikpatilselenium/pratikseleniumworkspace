package Dropdown;

import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateUsingLinkedHashset {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/HTML/MultiSelectDropdown.html");
		Thread.sleep(4000);
		WebElement obj = driver.findElement(By.id("menu"));
	
		Select option=new Select(obj);
		List<WebElement> we = option.getOptions();
		
		
		LinkedHashSet<String> list=new LinkedHashSet<String>();
		
		for(int i=0;i<we.size();i++)
		{
			WebElement get = we.get(i);
			String s = get.getText();
			list.add(s);
		}
		
		for(String getList:list)
		{
			System.out.println(getList);
		}
		

	}

}
