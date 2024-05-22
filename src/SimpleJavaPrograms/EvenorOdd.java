package SimpleJavaPrograms;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a value:");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.print("even");	
		}
		else {
			System.out.print("odd");
		}
	}

}
