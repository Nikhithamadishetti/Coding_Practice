package SimpleJavaPrograms;

public class StringSplit {

	public static void main(String[] args) 
	{
	  String str="java,selenium,maven,TestNg";
      String str1[]=str.split(",");
      for(String str2:str1)
      {
    	  System.out.println(str2);
      }
	}

}
