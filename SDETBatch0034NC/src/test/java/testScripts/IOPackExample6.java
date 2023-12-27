package testScripts;

import java.io.File;
import java.io.PrintWriter;

public class IOPackExample6 {

	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter("test.txt");

		pw.print("SharukKhan");
		pw.println();
		pw.print(108);
		pw.println();
		pw.print(false);

		pw.flush();

		pw.close();

	}

}

class ExceptionExample2 {

	static String str;

	public static void main(String[] args) throws Exception {

		System.out.println(10 / 0); // RTE-ArithmeticException

		System.out.println(str.length()); // RTE-NullPointerException

	}

}





