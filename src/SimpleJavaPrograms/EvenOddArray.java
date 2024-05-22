package SimpleJavaPrograms;

public class EvenOddArray {

	public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int arr1=arr.length;
        int count=0;
        int count1=0;
        for(int x:arr)
        {
        	if(x%2==0)
        	{
        		count++;
        	}
        	else {
        		count1++;
        	}
        }
        System.out.print("Even numbers:" +count);
	}

}
