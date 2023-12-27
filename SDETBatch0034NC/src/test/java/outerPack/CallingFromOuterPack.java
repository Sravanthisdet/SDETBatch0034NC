package outerPack;

//import testScripts.JavaExample55;
import testScripts.JavaExample56;

public class CallingFromOuterPack extends JavaExample56 {

	public static void main(String[] args) {

		// JavaExample53 je53 = new JavaExample53();

//		JavaExample55 je55 = new JavaExample55();
//		System.out.println(je55.a);
//		je55.method1();
		
		//Create the object to Child class to access the parent class protected datamember
		CallingFromOuterPack je56 = new CallingFromOuterPack();
		System.out.println(je56.a);
		je56.method12();
		

	}

}
