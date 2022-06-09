package windowbasedpopups;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WindowPopupMethod2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://smallpdf.com/jpg-to-pdf");
			driver.findElement(By.xpath("//span[.='Got it']")).click();
			driver.findElement(By.xpath("//span[.='Choose Files']")).click();
			Thread.sleep(3000);
			/*File f=new File("C:/Users/HP/Desktop/jpegtopdfFU.exe");
			String abspath = f.getAbsolutePath();*/
			Runtime.getRuntime().exec("C:/Users/HP/Desktop/jpegtopdfFU.exe");
			Thread.sleep(10000);
			TakesScreenshot ts=(TakesScreenshot)driver;
			File img = ts.getScreenshotAs(OutputType.FILE);
			File trg=new File("C:/Users/HP/Pictures/Screenshots/imagetopdf2.png");
			Files.copy(img, trg);
			
			
			

	}

}
