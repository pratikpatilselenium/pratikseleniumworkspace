package pageobjectmodel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest  {

	static WebDriver driver;


	public void openBrowser() throws IOException
	{
		
    
		Flibrary flib=new Flibrary();
		String Value = flib.readPropFile("./data/config.properties", "browser");
		

		String url = flib.readPropFile("./data/config.properties", "url");

		if(Value.equalsIgnoreCase("chrome"))
		{

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


		}

		else if (Value.equalsIgnoreCase("firefox"))
		{

			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		}

		else
		{
			System.out.println("enter correct browser name");
		}




	}

	public void closeBrowser()
	{
		driver.quit();
	}



}
