package assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//a[.='Visit W3Schools.com!']")).click();
		
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> allWindow = driver.getWindowHandles();
		
		for (String wh:allWindow)
		{
			if (!parentWindow.equals(wh))
			{
				driver.switchTo().window(wh);
			}
		}
		 
		driver.findElement(By.xpath("//a[.='Tutorials ' and @id='navbtn_tutorials' ]")).click();
		
		

	}

}
