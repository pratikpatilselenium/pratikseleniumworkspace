package xpathLocator;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleforgettingText {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the text");
		String obj=sc.nextLine();
		
		WebDriver driver;
		
		
		if(obj.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		
		
		else if(obj.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		else
		{
			System.out.println("enter valid input");
		}

	}

}
