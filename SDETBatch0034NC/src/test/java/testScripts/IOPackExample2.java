package testScripts;

import java.io.File;
import java.io.FileWriter;

public class IOPackExample2 {

	public static void main(String[] args) throws Exception {

		File file = new File("HeroiensName.txt");

		if (!file.exists()) {
			file.createNewFile();
		} else {
			System.out.println("File already Exist");
		}

		FileWriter fw = new FileWriter(file);
		fw.write("KrithiSetti");
		fw.write("Chithu");
		fw.write("Kajal");
		fw.flush();
		fw.close();
	}
}
