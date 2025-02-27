package TestBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import pageObjects.BasePage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TestBase {

	

	public WebDriver driver;
	
	public  Logger logger;
	
	public Properties p;

	@BeforeClass (groups="sanity")
	@Parameters({"os","browser"})
	public void setup(String os, String br) throws IOException {
		
		//method reading the data from properties file
		FileReader file =  new FileReader("./src//test//resources//config.properties");
		
			p= new Properties();
			p.load(file);
		
		//logger class for generating the logs for each class
		logger=LogManager.getLogger(this.getClass());
		
		switch(br.toLowerCase())
		{
		case "chrome": driver = new ChromeDriver();
		break;
		
		case "edge": driver = new EdgeDriver();
		break;
		
		case "firefox": driver = new FirefoxDriver();
		break;
		
		default: System.out.println("Invalid browser name");
		return;
				
		}

		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appurl1"));

	}

	@AfterClass
	public void closewindow() {
		System.out.println("All tests are passed");
		driver.close();
	}

	//method for generating the random string
	public String randomeString() {

		String generatedvalue = RandomStringUtils.randomAlphabetic(5);
		return generatedvalue;
	}

	//method for generating the random number
	public String randomNumber() {
		String numbericvalue = RandomStringUtils.randomNumeric(10);
		return numbericvalue;

	}
}
