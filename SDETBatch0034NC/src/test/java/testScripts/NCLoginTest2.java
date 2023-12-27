package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ncPages.NCUtility;
import ncPages2.NCLoginPage;

public class NCLoginTest2 {

	public static void main(String[] args) {

//		
//		
//		String s = "Shareef";
//		s.charAt(index);
//		s.compareTo("another string");
//		s.compareToIgnoreCase("another case");
//		s.concat("string");
//		s.contains("string");
//		s.equals("another string object");
//		s.equalsIgnoreCase("another string");
//		s.indexOf('Char');
//		s.isEmpty();
//		s.lastIndexOf("sub string");
//		s.length();
//		s.replace("old string", "new string");
//		s.replaceAll("String", "new string");
//		s.split(" ");
//		s.substring("start string index", "end sting index");
//		s.toCharArray();
//		s.toLowerCase();
//		s.toUpperCase();
//		s.trim();
//		

		WebDriver driver = new ChromeDriver();

		NCUtility nu = new NCUtility(driver);
		NCLoginPage nlp = new NCLoginPage(driver);

		nu.launchNC();
		nu.ncMaximize();

		nlp.enterEmail();
		nlp.enterPassword();
		nlp.clickOnLogin();

		nu.tearDown();

	}

}
