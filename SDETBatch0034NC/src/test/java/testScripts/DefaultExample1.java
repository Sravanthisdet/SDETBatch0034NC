package testScripts;

class JavaExample53{
	
	int a = 10;
	String str = "SDET";
	
	void method1(){
		System.out.println("This is a Default method");
	}
	
}

class JavaExample54{
	
	public static void main(String[] args){
		
		JavaExample53 je53 = new JavaExample53();
		System.out.println(je53.a);
		System.out.println(je53.str);
		je53.method1();
	}
	
}
