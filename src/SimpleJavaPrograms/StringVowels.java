package SimpleJavaPrograms;

public class StringVowels 
{
	public static void main(String args[]) 
	{
		    String str="Nikhitha";
			int count=0;
			str=str.toLowerCase();
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					count++;
				}
			}
			System.out.println(count);
				
	}

}
