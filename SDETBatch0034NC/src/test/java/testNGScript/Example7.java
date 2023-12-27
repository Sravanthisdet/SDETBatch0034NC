package testNGScript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7 {

	@Test
	public void method1() {

		String str1 = "ITIdustry";
		String str2 = "Business";
		String str3 = "SDET";

		Assert.assertEquals(str1.equals(str2), false, "Please check the values Shareef");

		System.out.println(str3);

	}

}
