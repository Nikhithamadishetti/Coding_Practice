package SimpleJavaPrograms;

import java.util.Scanner;

public class EligibleVote {

	public static void main(String[] args) {
		int personeligibleforvote=25;
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a value:");
		int num=scanner.nextInt();
		if(personeligibleforvote>=num)
        {
            System.out.println("Eligible");
        }
		else {
			 System.out.println("Not Eligible");
		}
	}

}
