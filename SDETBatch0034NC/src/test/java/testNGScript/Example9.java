package testNGScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = testNGScript.ListeningClass.class)
public class Example9 {

	@Test
	public void googleMethod() throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.quit();
	}

	@Test
	public void faceBookMethod() throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.quit();
	}

	@Test
	public void method1() {
		Assert.fail();
		System.out.println("Hello");
	}

	@Test
	public void linkedInMethod() throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com");
		Thread.sleep(5000);
		driver.quit();
	}

}
