package SimpleJavaPrograms;
import java.util.*;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>();

        // Add elements to the ArrayList
        myList.add(4);
        myList.add(2);
        myList.add(7);
        myList.add(1);
        myList.add(9);
        myList.add(3);

        // Sort the elements of the ArrayList
        Collections.sort(myList);
        
        // Print Sorted Elements from ArrayList
        System.out.println(myList);

        // Display elements of the sorted ArrayList
        System.out.println("Sorted elements of the ArrayList:");
        for (int x:myList) 
        {
            System.out.println(x);
        }
	}

}
