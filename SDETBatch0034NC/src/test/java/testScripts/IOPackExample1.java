package testScripts;

import java.io.File;

public class IOPackExample1 {

	public static void main(String[] args) throws Exception {

		File file = new File("Shareef.txt");

		if (!file.exists()) {
			file.createNewFile();
		} else {
			System.out.println("File Already exits");
		}

		System.out.println(file.isFile()); // true
		System.out.println(file.isDirectory()); // false

		File path = new File("C:\\Users\\91900\\Documents\\SDETBatch3&4\\JavaPractice");
		String[] all = path.list();

		for (String single : all) {
			System.out.println(single);
		}

	}

}
