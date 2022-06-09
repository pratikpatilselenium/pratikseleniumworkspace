package pageobjectmodelorangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageOhrm {
	//
	@FindBy(id =   "txtUsername") private WebElement usn;
	@FindBy(id = "txtPassword")private WebElement pass;
	@FindBy(id = "btnLogin")private WebElement lgnBtn;
	
	
	//
	
	public LoginPageOhrm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	//
	
	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLgnBtn() {
		return lgnBtn;
	}
	
	
	//genereic reusable Method
	
	public void logingOhrm(String username,String password)
	{
		usn.sendKeys(username);
		pass.sendKeys(password);
		lgnBtn.click();
	}
	

}
