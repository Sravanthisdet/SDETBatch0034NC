package testNGScript;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example8 {

	@Test(enabled = false)
	public void method1() {

		String str1 = "SDET";
		String str2 = "SDET";
		String str3 = "Student";

		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(str1.equals(str3), true);

		System.out.println(str2);

		sa.assertAll();

	}
	
	@Parameters({"email", "pws","SDETclass"})
	@Test(enabled = false)
	public void testMethod1(String e, String p, String sc) {
		System.out.println(e);
		System.out.println(p);
		System.out.println(sc);
	}
	
	
	@Test(dataProvider = "testData", dataProviderClass = testNGScript.DataProviderExample.class)
	public void inputMethod(String un, String pws) {
		
		System.out.println(un);
		System.out.println(pws);
		
	}

	
	
	
	
	
	
	
	
}
