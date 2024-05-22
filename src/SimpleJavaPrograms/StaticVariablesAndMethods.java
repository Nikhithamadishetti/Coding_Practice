package SimpleJavaPrograms;

public class StaticVariablesAndMethods {
	
	int a=10;
	static int b=20;
	public static void staticMethod() {
		System.out.println("niki");
	}
	public void Nonstaticmrthod() {
		System.out.println("krish");
	}

	public static void main(String[] args) {
		//calling static variable without object creation
		System.out.println(b);
		
		
		//calling static variable with object creation
		StaticVariablesAndMethods svar=new StaticVariablesAndMethods();
		System.out.println(svar.a);
		
		//calling static method without object creation
		staticMethod();
		
		//calling non-static method with object creation
		svar.Nonstaticmrthod();
		svar.method1();
	}

	public void method1(){
		System.out.println(b);
		System.out.println(a);
		staticMethod();
		Nonstaticmrthod();
	}

}
