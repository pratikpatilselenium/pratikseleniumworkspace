package pageobjectModel2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {

	static WebDriver driver;


	public void setUp() throws IOException
	{

		Flibrary flib=new Flibrary();
		String Value = flib.readPropFile(PROP_PATH, "browser");
		

		String url = flib.readPropFile(PROP_PATH, "url");

		if(Value.equalsIgnoreCase("chrome"))
		{

			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


		}

		else if (Value.equalsIgnoreCase("firefox"))
		{

			System.setProperty(GECKO_KEY, GECKO_VALUE);
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

	public void tearDown()
	{
		driver.quit();
	}



}
