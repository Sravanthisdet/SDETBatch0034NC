package testScripts;

import java.io.File;
import java.io.FileReader;

public class IOPackExample3 {

	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("C:\\Users\\91900\\eclipse-workspace\\SDETBatch0034NC\\HeroiensName.txt");

		int i;

		while ((i = reader.read()) != -1) {
			System.out.print((char) i);
		}

	}

}
