package testNGScript;

import org.testng.annotations.Test;

public class Example1 {

	@Test(groups = "Smoke")
	public void Ex1TestMethod1() {
		System.out.println("Hello Darling TestNG");
	}

	@Test(groups = "Regression")
	public void testMethod2() {
		System.out.println("Bye Darling TestNG");
	}

}
