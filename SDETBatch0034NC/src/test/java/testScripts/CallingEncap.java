package testScripts;

public class CallingEncap {

	public static void main(String[] args) {

		EncapSulationExample1 ex = new EncapSulationExample1();
		System.out.println(ex.getsRollNo());
		System.out.println(ex.getsName());
		System.out.println(ex.getsContact());
		System.out.println(ex.getsAge());
		
		System.out.println();
		System.out.println("After changing age value is :");
		ex.setsAge(25);

	}

}
