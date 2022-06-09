package MethodsOfWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com");
		WebElement text = driver.findElement(By.xpath("//p[.=\"Get the app.\"]"));
		Point obj = text.getLocation();
		int xaxis = obj.getX();
		int yaxis = obj.getY();
		System.out.println(xaxis);
		System.out.println(yaxis);

	}

}
