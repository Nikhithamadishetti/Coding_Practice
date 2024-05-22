package SimpleJavaPrograms;

public class SwapArrayElements {

	public static void main(String[] args) {

		int arr[] = { 10, 20 };
		int temp = 0;
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("index :" + i + ", value :" + arr[i]);
		}

	}

}
