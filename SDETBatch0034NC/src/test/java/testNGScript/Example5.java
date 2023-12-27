package testNGScript;

import org.testng.annotations.Test;

public class Example5 {

	@Test(priority = 1, enabled = false)
	public void nagaLakshmi() {
		System.out.println("NagaLakshmi");
	}

	@Test(priority = 0)
	public void rajaSri() {
		System.out.println("RajaSri");
	}

	@Test(priority = 3)
	public void varun() {
		System.out.println("Varun");
	}

	@Test(priority = 2)
	public void saiVamshi() {
		System.out.println("SaiVamshi");
	}

	@Test(priority = 4)
	public void arjun() {
		System.out.println("Arjun");
	}

}
