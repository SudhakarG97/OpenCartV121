package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.TestBase;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPageHeadding;

public class TC002_LoginPage extends TestBase {

	@Test (groups ="sanity")
	public void verify_login() {
		logger.info("*****Test case is started");

		try {
			HomePage hp = new HomePage(driver);
			hp.Myaccount();
			hp.login();

			LoginPage lp = new LoginPage(driver);
			lp.logineamilid(p.getProperty("email"));
			lp.loginpassword(p.getProperty("pswd"));
			lp.loginbtn();

			MyAccountPageHeadding mp = new MyAccountPageHeadding(driver);
			boolean targetpage = mp.verifyheadding();
			AssertJUnit.assertEquals(targetpage, true);
		} catch (Exception e) {
			AssertJUnit.fail();
		}
		logger.info("**********Finshed the Loginpage test case*******");

	}

}
