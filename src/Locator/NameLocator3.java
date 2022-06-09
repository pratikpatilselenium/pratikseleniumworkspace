package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=EAIaIQobChMIv7OTk4Gi9wIVFT5gCh2yVQuEEAAYASAAEgIMJ_D_BwE");
		driver.findElement(By.className("desktop-userTitle")).click();
		driver.findElement(By.className("desktop-linkButton")).click();
		driver.findElement(By.className("submitBottomOption")).click();
		
		Thread.sleep(4000);
		driver.close();
	}

}
