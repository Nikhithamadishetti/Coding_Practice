package SimpleJavaPrograms;
import java.util.*;
public class HashSetDemo {

    public static void main(String args[]) {
        HashSet<Object> mylist = new HashSet<Object>();
        mylist.add(100);
        mylist.add("niki");
        mylist.add(10.2);
        mylist.add('a');
        mylist.add(null);
        mylist.add(null);
        System.out.println("print all the elements in array list:" + mylist);

        //Size of  Hashlist
        System.out.println(mylist.size());
        
        //Insertion is not possible
        //Accessing specific element is not possible
        //not possible becoz no indexing  //getting single element is not possoble wth Hashset
        System.out.println(((List<Object>) mylist).get(3)); 
        
       
        //we can only remove elements from hashset using only value
        System.out.println(mylist.remove(10.2));
        System.out.println(mylist);
       
        
        //need to convert hashset ->  ArrayList to peform all operarions to have indexing
        ArrayList<Object> mylist1 = new ArrayList<Object>(mylist);
        System.out.println(mylist1);
        System.out.println(mylist1.get(3));

        //for loop is not possible in Hashset becoz no indexing
        //Advanced for loop i.e foreach loop is possible
        for (Object x : mylist) {
            System.out.println(x);
        }

        // iterative approch is also possible 
        Iterator<Object> it=mylist.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        //clear all elements
        mylist.clear();
        System.out.println(mylist);
    }
}
