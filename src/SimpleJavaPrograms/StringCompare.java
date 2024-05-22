package SimpleJavaPrograms;

public class StringCompare {

	public static boolean VowelCount() {

		String str = "Nikhitha";
		String str1 = "Laddu";
		
		boolean x1 = str.equals(str1);
		System.out.print(x1);
		return x1;

	}
	public static void main(String args[]) {
		boolean x1 = VowelCount();
		if (x1 == true) 
		{
			System.out.println("strings are equal");
		} else 
		{
			System.out.println("Strings not equal");

		}
	}
}
