package testScripts;

public class JavaExample50 {

	public int b = 20;
	private int a = 10;
	private String str = "MLA";

	private void method1() {
		System.out.println("This is a Private Method");
	}

	private class JavaExample51 {

	}

	public static void main(String[] args) {
		JavaExample50 je50 = new JavaExample50();
		System.out.println(je50.a);
		System.out.println(je50.str);
	}

}

class JavaExample52 {

	public static void main(String[] args) {
		JavaExample50 je50 = new JavaExample50();
		//System.out.println(je50.a);
		//System.out.println(je50.str);
	}

}
