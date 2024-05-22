package SimpleJavaPrograms;
import java.util.*;
public class ArrayMax {

	public static void main(String[] args) 
	{
		//print max array element
		int arr[]= {98,45,32,76,18,55};
    	int max=arr[0];
    	
     //Using For each loop
    	for(int x:arr) {
    		if(x>max)
    		{
    			max=x;
    		}
    	}
    	
     //Using normal For Loop
		for(int i=0;i<arr.length;i++) 
		{
			if(max<arr[i]) 
			{
				max=arr[i];
				
			}
			
		}
		System.out.print(max);
       }
	}
	

