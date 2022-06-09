package Dropdown;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateUsingTreeSet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/HTML/MultiSelectDropdown.html");
		WebElement element = driver.findElement(By.id("menu"));
		Select sel=new Select(element);
		TreeSet<String> obj=new TreeSet<String>();
		
		for(int i=1;i<=4;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
			
			
		}
		List<WebElement> allOptions = sel.getAllSelectedOptions();
		
		
		for(int i=0;i<allOptions.size();i++)
		{
			WebElement op = allOptions.get(i);
			String data = op.getText();
			obj.add(data);
		}
		
		
		for(String var:obj)
		{
			System.out.println(var);
		}
		
		
		
		
	}

}

