package testNGScript;

import org.testng.annotations.Test;

public class Example6 {

	@Test(invocationCount = 1000000000, invocationTimeOut = 1000)
	public void method1() {
		System.out.println("ITIndustry");
	}

}
