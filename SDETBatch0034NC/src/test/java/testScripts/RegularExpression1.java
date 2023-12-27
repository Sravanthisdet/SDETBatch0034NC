package testScripts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression1 {

	public static void main(String[] args) {

		String str = "Shareef123$SDET456@Kosmik";

		Pattern digits = Pattern.compile("[^a-zA-Z0-9]+");

		Matcher allDigits = digits.matcher(str);

		while (allDigits.find()) {
			System.out.println(allDigits.group());
		}

	}

}
