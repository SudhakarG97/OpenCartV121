package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	//constructor
	public HomePage(WebDriver driver)
	{
		super(driver);
	}

	
	//locator
	
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement btnlogin;
	
	//Action method
	
	public void Myaccount()
	{
		lnkMyaccount.click();
	}
	
	public void Register()
	{
		lnkRegister.click();
	}
	
	public void login()
	{
		btnlogin.click();
	}
}
