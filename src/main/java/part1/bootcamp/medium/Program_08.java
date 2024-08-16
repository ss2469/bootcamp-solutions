package part1.bootcamp.medium;

public class Program_08 {

	public static void main(String[] args) {

		// Write a Java program to implement insertion sort algorithm.
		// Insertion Sort builds the final sorted array (or list) one item at a time by
		// comparisons.
		// It is used when number of elements is small.
		// It is much less efficient on large lists than more advanced algorithms such
		// as quicksort, heapsort or mergesort.

		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

		System.out.println("Original Array:");
		printArray(arr);

		insertionSort(arr);

		System.out.println("\nSorted Array:");
		printArray(arr);

	}

	public static void insertionSort(int[] arr) {

		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

	}

	public static void printArray(int[] arr) {
		
		for(int num : arr) {
			System.out.println(num + " ");
		}
		System.out.println();
	}

}
