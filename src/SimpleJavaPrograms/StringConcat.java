package SimpleJavaPrograms;

public class StringConcat {

	public static void main(String[] args) {
		String str1 = "niki";
		String str2 = "krish";
		String str3 = "nikikrish";
		
		// String str4=str1+str2+str3;
		// System.out.println(str4);

		StringBuffer str = new StringBuffer(str1);
		str = str.append(str2).append(str3);
		System.out.println(str);
	}

}
