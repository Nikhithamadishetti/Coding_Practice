package SimpleJavaPrograms;

public class ArrayMultipleDataypes {

	public static void main(String[] args) 
	{
		// Array Declaration #1
		int arr[] = new int[5];
		System.out.println(arr.length);

		// Array Declartion #2
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int x1 = arr1.length;
		int sum = 0;
		for (int x : arr1) 
		{
			sum = sum + x;
		}
		System.out.println(sum);

		// Array Object
		Object arr2[] = { 1, "hi", 0.1 };
		for (Object y : arr2) 
		{
			System.out.println(y);
		}

	}
}
