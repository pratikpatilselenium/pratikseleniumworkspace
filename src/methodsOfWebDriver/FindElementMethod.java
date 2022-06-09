package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-iq6c4opo/login.do");
		Thread.sleep(4000);
		WebElement usernametextBox = driver.findElement(By.xpath("//input[@name='username']"));
		usernametextBox.sendKeys("admin");
		//String textIs = usernametextBox.getText();
		System.out.println(usernametextBox);

	}

}
