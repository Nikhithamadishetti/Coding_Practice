package SimpleJavaPrograms;

public class StaticNonStatic {
	   //Static variable
       public static int age=10;
       
       //static method
       public static void method1() 
       {
    	   System.out.println("This is static method");
       }
       
       //non static instance variable
       int age1=20;
       
       //non static method
       public void method2() 
       {
    	   System.out.println("This is non static method");
       }
       
       public static void main(String args[])
       {
    	   // we can call static variale with class name directly
    	   System.out.println(StaticNonStatic.age);
    	   // we can call static method with classname directly
    	   StaticNonStatic.method1();
    	   
    	   
    	   // we can only call non static instance variables using object 
    	   StaticNonStatic sc=new StaticNonStatic();
    	   System.out.println(sc.age1);
    	   //we can call non static methods using obj
    	   sc.method2();
       }
       
       
       
}
