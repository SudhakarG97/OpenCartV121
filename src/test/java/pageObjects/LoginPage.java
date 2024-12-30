package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	//constructor
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//locators
	
	@FindBy(css="input#input-email")
	WebElement loginemail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement loginpswd;
	
	@FindBy(css="input.btn.btn-primary")
	WebElement btnlogin;
	
	//Action methods
	
	public void logineamilid(String lgnusr)
	{
		loginemail.sendKeys(lgnusr);
	}
	
	public void loginpassword(String pswd)
	{
		loginpswd.sendKeys(pswd);
	}
	
	public void loginbtn() {
		
		btnlogin.click();
		
	}

}
