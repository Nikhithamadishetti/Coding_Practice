package SimpleJavaPrograms;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {

		// create arraylist //Example-1
		ArrayList<Object> mylist = new ArrayList<Object>();
		mylist.add(100);
		mylist.add("niki");
		mylist.add(10.2);
		mylist.add('a');
		mylist.add(null);
		mylist.add(null);
		System.out.println("print all the elements in array list:" + mylist);

		// Remove Duplicates
		HashSet<Object> removedup = new HashSet<Object>(mylist);
		System.out.println("print all the elements in Hash list:" + removedup);

		// Adding all collection elements without duplicates into ArrayList again
		ArrayList<Object> uniqueList = new ArrayList<Object>(removedup);

		// insert element into array list at 4th place
		mylist.add(3, "krish");
		System.out.println(mylist);

		// print sublist of mylist
		mylist.subList(1,4);
		System.out.println(mylist.subList(1,4));

		// print size of array list
		System.out.println("print size of array list:" + mylist.size());

		// replace 3rd element in arraylist
		mylist.set(2,"middle");
		System.out.println(mylist);

		// get or retrieve elemets from list
		System.out.println(mylist.get(2));

		// remove element from arraylist
		mylist.remove(5);
		System.out.println(mylist);

		// Approach 1 iterating to all elements
		for (int i = 0; i < mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}

		// Approach 2 iterating to all elements using foreach loop
		for (Object x : mylist) {
			System.out.println(x);
		}

		// Approach 3 using iterator specific to collection for iterating to all elements
		Iterator<Object> it = mylist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// remove random elements from Array list
		ArrayList<String> mylist2 = new ArrayList<String>();
		mylist2.add("niki");
		mylist2.add("madi");
		mylist.removeAll(mylist2);
		System.out.println(mylist);

		// to remove all elememnts in list
		mylist.clear();
		System.out.println(mylist);
		
		// Preparing list of Elements with duplicates //Example -2
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 4, 6, 7, 2, 3, 5, 4, 3, 8, 2, 8));
		// Coverting list of elemenets into HashSet to remove Duplicate elements
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		// Coverting back to ArrayList to perform actions on List elements
		ArrayList<Integer> numbersListWithoutDuplicate = new ArrayList<Integer>(linkedHashSet);
		System.out.println(numbersListWithoutDuplicate);
	}
	
	
}
