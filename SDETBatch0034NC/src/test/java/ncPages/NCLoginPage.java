package ncPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Rule no = 1, create individual class for each web page
public class NCLoginPage {

	WebDriver driver;

	// Rule no = 4, create a constructor to initialize value to WedDriver object
	public NCLoginPage(WebDriver d) {
		this.driver = d;
	}

	// Rule no = 2, provide web element information in created class
	By email = By.id("Email");

	By pws = By.name("Password");

	By loginBtn = By.tagName("button");

	// Rule no = 3, create individual methods for each web elements based on web
	// element type
	public void enterEmail() {
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("admin@yourstore.com");
	}

	public void enterPassword() {
		driver.findElement(pws).clear();
		driver.findElement(pws).sendKeys("admin");
	}

	public void clickOnLoginBtn() {
		driver.findElement(loginBtn).click();
	}

}
