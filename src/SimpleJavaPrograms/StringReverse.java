package SimpleJavaPrograms;

public class StringReverse {

	public static void main(String[] args) {
		//String str = "madam";
	    String str="A man, a plan, a canal, Panama!";
		String input=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		int n=input.length();
//		int n = str.length();
//		
//		StringBuilder sc=new StringBuilder(str);
//    	System.out.print(sc.reverse());		
//    	}

		String res = "";
		
		// loop starts from n-1 becoz string index starts from '0'
		for (int i = n - 1; i >= 0; i--) 
		{
			res = res + str.charAt(i);
			// res=res+input.charAt(i);
		}
		System.out.println(res);
		if (str.equals(res))
		// if(input.equals(res))
		{
			System.out.print("palindorme");
		} 
		else 
		{
			System.out.print("not palindorome");
		}
	}

}
