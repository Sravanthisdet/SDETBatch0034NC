package ncPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Rule no = 1, create individual class for each web page
public class NCDashBoardPage {
	
	WebDriver driver;
	
	//Rule no = 4, create Constructor for each page class
	public NCDashBoardPage(WebDriver d) {
		this.driver = d;
	}
	
	//Rule no = 2, provide web elements information in created class
	By dashBoard = By.xpath("//h1[contains(text(),'Dashboard')]");
	
	//Rule no =3, create individual methods for each web elements
	public boolean verifyDashBoard() {
		boolean val = driver.findElement(dashBoard).isDisplayed();
		return val;
	}
}
