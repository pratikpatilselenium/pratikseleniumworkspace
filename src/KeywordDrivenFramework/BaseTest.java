package KeywordDrivenFramework;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {

	
	static WebDriver driver;
	
	


	public void OpenBrowser() throws IOException
	{
		Flib flib = new Flib();
		String value = flib.readPropertyFile(PROP_PATH, "browser");
		
		String url = flib.readPropertyFile(PROP_PATH, "url");

	
		if(value.equalsIgnoreCase("chrome"))
		{

			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get(url);
		}

		else if(value.equalsIgnoreCase("firefox"))
		{
			System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get(url);
		}

		else
		{
			System.out.println("enter correct browser");
		}
		
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}




}





