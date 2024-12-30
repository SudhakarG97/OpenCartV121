package testCases;

import org.testng.annotations.Test;
import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.TestBase;
import pageObjects.HomePage;
import pageObjects.RegisterAccount;

public class TC001_AccountRegistration extends TestBase{

	
	

	@Test (groups ={"sanity","regression"})
	public void Verify_Account_registration() {

		try {
			
		
		logger.info("Script is started");
		HomePage hp = new HomePage(driver);
		
		hp.Myaccount();
		logger.info("My account is clicked");
		hp.Register();
		logger.info("Register button is clicked");

		RegisterAccount rsa = new RegisterAccount(driver);
		
	//	rsa.firstname("jones"); //STATIC VALUE
		//rsa.firstname(randomeString().toUpperCase());  //randome string value to avoid duplicate
		
		rsa.firstname(p.getProperty("firstname"));
		
		//rsa.lastname(randomeString().toUpperCase());  //THIS IS RANDOME VALUE TO AVOID DUPLICATE
		
		rsa.lastname(p.getProperty("lastname")); //using property file
		
		//rsa.email("asdf@gmail.com"); //static value
		//rsa.email(randomeString()+"@gmail.com"); //random
		
		rsa.email(p.getProperty("email"));
	//	rsa.telephone("9533252255");  //static value
		
		rsa.telephone(p.getProperty("telephone"));
		
		//rsa.telephone(randomNumber()); //passing randome value
		rsa.password("admin1234");
		rsa.confirmpassword("admin1234");
		rsa.policyagree();
		rsa.submit();
		
		rsa.getConfirmesage();
		logger.info("validating expected messgae");
		
		}
		catch(Exception  e)
		{
			
			logger.info("error logs");
			logger.debug("debug logs");
		}
		
		logger.info("Script end to end is complted");
	}
	
	

	
}

