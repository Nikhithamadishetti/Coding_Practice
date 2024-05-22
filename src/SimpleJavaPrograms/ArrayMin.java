package SimpleJavaPrograms;

public class ArrayMin {

	public static void main(String[] args) {
		// print min array element
		int arr[] = { 98, 45, 32, 76, 18, 55 };
		int min = arr[0];

		// Using normal For-Loop
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];

			}

		}

		// Using For-Each Loop
		for (int x : arr) {
			if (min > x) {
				x = min;

			}

		}

		System.out.print(min);
	}

}
