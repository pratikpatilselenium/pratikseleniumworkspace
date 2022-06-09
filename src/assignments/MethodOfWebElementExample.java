package assignments;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class MethodOfWebElementExample {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
		WebElement element = driver.findElement(By.xpath("//div[.=' KEEP IN TOUCH ']"));
		boolean var = element.isDisplayed();
		System.out.println(var);
		boolean obj = element.isSelected();
		System.out.println(obj);
		Point loc = element.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		System.out.println(xaxis);
		System.out.println(yaxis);
		String cssValue = element.getCssValue("font-family");
		System.out.println(cssValue);
		Rectangle area = element.getRect();
		int height = area.height;
		int width = area.width;
		System.out.println(height);
		System.out.println(width);
		String tag = element.getTagName();
		System.out.println(tag);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/myntra.png");
		Files.copy(src, dest);
		

	}

}
