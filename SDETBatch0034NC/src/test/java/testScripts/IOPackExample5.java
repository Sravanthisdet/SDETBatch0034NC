package testScripts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class IOPackExample5 {

	public static void main(String[] args) throws Exception {

		File file = new File("test.txt");

		FileReader fr = new FileReader(file);

		BufferedReader br = new BufferedReader(fr);

		String line;

		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

	}

}
