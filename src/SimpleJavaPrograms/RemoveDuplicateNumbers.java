package SimpleJavaPrograms;

import java.util.HashSet;

public class RemoveDuplicateNumbers {

	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<Object>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        hs.add(40);
        hs.add(50);
        
        for(Object x:hs) {
        	System.out.println(x);
        }
	}

}
