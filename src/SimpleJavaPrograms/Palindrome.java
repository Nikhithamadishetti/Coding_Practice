package SimpleJavaPrograms;

public class Palindrome {

	public static void main(String[] args) {
		String str="A man, a plan, a canal, Panama!";
		String input=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		int n=input.length();
		boolean object=palindrome(input,0,n);
        //System.out.print(object);
        if (object) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
	}
		
	public static boolean palindrome(String str,int i,int n) {
		if(i>=n/2) {
			return true;
		}
		if(str.charAt(i)!=str.charAt(n-i-1)) {
			return false;
		}
		else {
			return  palindrome(str,i+1,n);
		}
		
	}
	
}
