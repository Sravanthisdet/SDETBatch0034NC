package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ncPages.NCDashBoardPage;
import ncPages.NCLoginPage;
import ncPages.NCUtility;

public class NCLoginTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Object creation for WebPages classes
		NCUtility nu = new NCUtility(driver);
		NCLoginPage nlp = new NCLoginPage(driver);
		NCDashBoardPage ndp = new NCDashBoardPage(driver);

		nu.launchNC();
		nu.ncMaximize();
		nlp.enterEmail();
		nlp.enterPassword();
		nlp.clickOnLoginBtn();
		boolean output = ndp.verifyDashBoard();

		if (output == true) {
			System.out.println("NC Login Success");
			nu.doNCLogout();
		} 
		else {
			System.out.println("NC Login Failed");
		}
		
		nu.tearDown();

	}

}
