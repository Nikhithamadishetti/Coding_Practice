package SimpleJavaPrograms;

class Parent {
	void display() 
	{
		System.out.println("Parent's display method");
	}
}

class Child extends Parent {
	void display() 
	{
		super.display();
		System.out.println("Child's display method");
	}
}

public class simple_test_prog {

	public static void main(String[] args) {
	   // Parent parent = new Parent();
	   // parent.display(); // Output: "Parent's display method"
		Child child = new Child();
		child.display(); // Output: "Child's display method"

	}

}
