package EliminateDuplicate1;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateUsingHashSet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/HTML/MultiSelectDropdown.html");
		Thread.sleep(5000);
		WebElement obj = driver.findElement(By.id("menu"));
		Select se=new Select(obj);
		List<WebElement> list = se.getOptions();
		HashSet<String>element=new HashSet<String>();
		
		for(int i=0;i<list.size();i++)
		{
			WebElement s = list.get(i);
			String mainList = s.getText();
			element.add(mainList);
			
		}
		
		for(String el:element)
		{
			System.out.println(el);
		}
		

	}

}
