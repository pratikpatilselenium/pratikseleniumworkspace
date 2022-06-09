package assignments;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeValidLogin {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		Flib flib = new Flib();
		String bValue = flib.readPropFile("./data/config.properties", "browser");
		System.out.println(bValue);
		String url = flib.readPropFile("./data/config.properties", "url");

		if (bValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(url);
		}

	}

}
