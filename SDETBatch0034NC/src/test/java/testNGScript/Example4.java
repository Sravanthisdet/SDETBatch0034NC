package testNGScript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example4 {

	@Test
	public void method1() {
		Assert.fail();
		System.out.println("method1");
	}

	@Test(dependsOnMethods = "method1")
	public void method2() {
		System.out.println("method2");
	}

//	@Test(groups = "Smoke")
//	public void radha() {
//		Assert.fail();
//		System.out.println("Radha");
//	}
//
//	@Test(groups = "Smoke")
//	public void krishna() {
//		Assert.fail();
//		System.out.println("Krishna");
//	}
//
//	@Test(groups = "Regression", dependsOnGroups = "Smoke")
//	public void rukmini() {
//		System.out.println("Rukmini");
//	}
//
//	@Test(groups = "Regression", dependsOnGroups = "Smoke")
//	public void satyabhama() {
//		System.out.println("Satyabhama");
//	}

}
