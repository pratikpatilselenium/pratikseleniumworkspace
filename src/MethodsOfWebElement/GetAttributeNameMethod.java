package MethodsOfWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeNameMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com");
		 WebElement obj = driver.findElement(By.name("username"));
		 WebElement obj1 = driver.findElement(By.name("password"));
		 String value = obj.getAttribute("name");
		 //System.out.println(value);
		 //obj.getCssValue("color");
		 

	}

}
