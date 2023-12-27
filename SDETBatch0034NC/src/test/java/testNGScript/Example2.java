package testNGScript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example2 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is a pre-condition for suite level");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is a pre-condition for test level");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is a pre-condition for Class level");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is a pre-condition for method level");
	}

	@Test(groups = "Smoke")
	public void Ex2TestMethod1() {
		System.out.println("This is First Real Test Method");
	}
	
	@Test(groups = "Regression")
	public void testMethod2() {
		System.out.println("This is Second Real Test Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is a post condition for method level");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is a post-condition for Class level");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is a post-condition for test level");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This is a post-condition for suite level");
	}

}
