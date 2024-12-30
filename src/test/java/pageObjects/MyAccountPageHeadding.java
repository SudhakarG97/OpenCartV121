package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPageHeadding extends BasePage {

	// constructor
	public MyAccountPageHeadding(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// locators

	@FindBy(xpath = "//h2[text()='My Account']")
	WebElement msgHeadding;

	// verify the headding

	public boolean verifyheadding() {
		try {

			return (msgHeadding.isDisplayed());

		} catch (Exception e) {

			return false;
		}
	}
}
