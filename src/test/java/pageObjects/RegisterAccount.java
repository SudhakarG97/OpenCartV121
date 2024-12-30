package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegisterAccount extends BasePage {

	//constructor
	public RegisterAccount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	//locators
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@name='telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtPaswd;
	
	@FindBy(css = "input#input-confirm")
	WebElement txtcnfmpswd;
	
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement checkagree;
	
	@FindBy(xpath="//label[normalize-space()='Yes']")
	WebElement subscribe;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement btnContinue;
	
	//Action Method
	
	public void firstname(String firstname)
	{
		txtFirstname.sendKeys(firstname);
	}
	
	public void lastname(String lastname)
	{
		txtLastname.sendKeys(lastname);
	}
	
	public void email(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void telephone(String telphne)
	{
		txtTelephone.sendKeys(telphne);
	}
	
	public void password(String pswd)
	{
		txtPaswd.sendKeys(pswd);
	}
	
	public void confirmpassword(String pswd)
	{
		txtcnfmpswd.sendKeys(pswd);
	}
	
	public void subcribe()
	{
		subscribe.click();
	}
	
	public void policyagree()
	{
		checkagree.click();
	}
	
	public void submit()
	{
		btnContinue.click();
	}
	
	public void getConfirmesage()
	{
		WebElement value = driver.findElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']"));
		Assert.assertEquals(value.getText(), "Your Account Has Been Created!");
	}
		
	
}
