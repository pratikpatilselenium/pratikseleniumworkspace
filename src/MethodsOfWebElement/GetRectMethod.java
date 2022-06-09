package MethodsOfWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com");
		WebElement text = driver.findElement(By.xpath("//p[.=\"Get the app.\"]"));
		Rectangle obj =text.getRect();
		int height = obj.getHeight();
		int width = obj.getWidth();
		System.out.println(height);
		System.out.println(width);
		
		

	}

}
