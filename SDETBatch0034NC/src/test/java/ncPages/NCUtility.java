package ncPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Rule no = 1, create individual class
public class NCUtility {
	
	WebDriver driver;
	
	//Rule no = 4, create Constructor for each page class
	public NCUtility(WebDriver d) {
		this.driver = d;
	}
	
	//Rule no = 2, provide WebElement information
	By logout = By.xpath("//a[text()='Logout']");
	
	//Rule no = 3, create individual methods for each WebElement
	public void launchNC() {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}
	
	public void doNCLogout() {
		driver.findElement(logout).click();
	}
	
	public void ncMaximize() {
		driver.manage().window().maximize();
	}
	
	
	public void tearDown() {
		driver.quit();
	}
	
}
