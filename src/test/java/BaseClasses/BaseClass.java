package BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	WebDriver driver;
	//String Browser = "browser";
	@BeforeSuite
	public void BeforeSuit() {
		System.out.println("Before suite");
	}
	@BeforeTest
	public void BeforeTests() {
		System.out.println("Before test case");
	}
	@BeforeClass
	@Parameters(value={"Browser"})
	public void BeforeClasss(int Browser)throws Exception {
		switch(Browser) {

		case 1:
			System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing Practice\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(); 
			break;
		case 2:
			System.setProperty("webdriver.edge.driver", "E:\\Automation Testing Practice\\SeleniumMsEdge\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		case 3:
			System.setProperty("webdriver.gecko.driver","E:\\Automation Testing Practice\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		driver.get("https://signup.zerodha.com/api/lead/?c=ZMPHZC");
		System.out.println("Before class");
		System.out.println("Login to application");
	}
	@BeforeMethod
	public void BeforeeMethod() {
		System.out.println("Before Method");
		System.out.println("Do we need to relogin application");
	}



	@AfterMethod
	public void AftereMethod() {
		System.out.println("After Method");
		System.out.println("Navigate to homepage");
	}
	@AfterClass
	public void AfterrClass() {
		System.out.println("After class");
	}
	@AfterTest
	public void AfterTestCase() {
		System.out.println("After test case");
	}
	@AfterSuite
	public void AfterrSuit() {
		System.out.println("After siute");
	}
}
