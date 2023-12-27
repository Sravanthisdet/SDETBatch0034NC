package testScripts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class IOPackExample4 {

	public static void main(String[] args) throws Exception {

		File file = new File("test.txt");

		if (!file.exists()) {
			file.createNewFile();
		} else {
			System.out.println("File Already Exists");
		}

		FileWriter fw = new FileWriter(file);

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("Shareef");
		bw.newLine();
		bw.write("SDET");
		bw.newLine();
		bw.write("15Lack package");
		bw.flush();

	}

}
