package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	@BeforeSuite
	public void BeforeSuit() {
		System.out.println("Before suite");
	}
	@BeforeTest
	public void BeforeTests() {
		System.out.println("Before test case");
	}
	@BeforeClass
	public void BeforeClasss() {
		System.out.println("Before class");
		System.out.println("Login to application");
	}
	@BeforeMethod
	public void BeforeeMethod() {
		System.out.println("Before Method");
		System.out.println("Do we need to relogin application");
	}
	@Test
	public void TestCase1() {
		System.out.println("Test Case 1");
		System.out.println("System crashesh");
	}
	@Test
	public void TestCase2() {
		System.out.println("Test Case 2");
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
