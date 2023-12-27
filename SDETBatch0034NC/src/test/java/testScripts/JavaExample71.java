package testScripts;

import java.io.PrintWriter;
import java.io.FileNotFoundException;

class JavaExample71{

	public static void main(String[] args){
	
		try{	
			PrintWriter pw = new PrintWriter("C:\\Users\\91900\\Documents\\test.txt");
			pw.print("Exception");
			pw.print(108);
			pw.print(true);
		
			pw.flush();
		}
		catch(FileNotFoundException ffe){
		}
		
		
	}
}
