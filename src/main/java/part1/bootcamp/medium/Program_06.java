package part1.bootcamp.medium;

public class Program_06 {

	public static void main(String[] args) {
		
		// Write a Java program to implement bubble sort algorithm.
		
		/* Bubble Sort : It is the simplest algorithm that works by repeatedly swapping the
		 * adjacent elements if they are in the wrong order.
		 */
		
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		
		bubbleSort(arr);

	}
	
	
	
	public static void bubbleSort(int arr[]) {
		
		int n = arr.length;
		
		for(int i = 0; i < n-1; i++)
			for(int j = 0; j < n-i-1; j++)
				if(arr[j] > arr[j +1]) {
					// swap logic
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}	
		
		System.out.println("Sorted Array: ");
		for(int k = 0; k < n; k++)
			System.out.println(arr[k] + " ");
		System.out.println();
		
	}

	
}
