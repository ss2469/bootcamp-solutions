package part1.bootcamp.medium;

public class Program_07 {

	public static void main(String[] args) {

		// Write a Java program to implement Selection Sort algorithm.

		// Selection Sort sorts an array by repeatedly finding the minimum/maximum
		// element and putting it at the beginning.

		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };

		selectionSort(arr);

	}

	public static void selectionSort(int arr[]) {

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element
			int minNum = i;
		
			for (int j = i+1; j < n; j++) {
				
				if (arr[j] < arr[minNum])   // ascending order
					minNum = j;	
			}
			
			// Swap the found minimum element with the first element
			int temp = arr[minNum];
			arr[minNum] = arr[i];
			arr[i] = temp;
			
		}	

		System.out.println("Sorted Array: ");
		for (int k = 0; k < n; k++)
			System.out.println(arr[k] + " ");
		System.out.println();

	}

}
