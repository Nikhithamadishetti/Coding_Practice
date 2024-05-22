package SimpleJavaPrograms;

public class FindUpperCaseCharInString {

	public static void main(String[] args) {
		String str="Nikhitha";
		int str1=str.length();
		int upper=0;
		int lower=0;
		for(int i=0;i<str1;i++)
		{
			char ch=str.charAt(i);
		   if(Character.isUpperCase(ch)) {
			   upper++;
		   }
		   else {
			   lower++;
		   }
		}
		System.out.println(upper);
	}

}
