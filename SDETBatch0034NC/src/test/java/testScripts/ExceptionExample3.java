package testScripts;

import java.io.File;

public class ExceptionExample3 {

	public static void main(String[] args) throws Exception {

		System.out.println("Hello");

		Thread.sleep(5000);

		System.out.println("Bye");

		File f = new File("abc.txt");

		f.createNewFile();

	}

}
