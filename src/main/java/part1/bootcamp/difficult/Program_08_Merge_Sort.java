package part1.bootcamp.difficult;

public class Program_08_Merge_Sort {

	// Write a program to implement a merge sort algorithm in Java.

	/*
	 * Merge sort is a “divide and conquer” algorithm.
	 * 
	 * It divides the given list into two equal halves, calls itself for the two
	 * halves and then merges the two sorted halves.
	 */

	public static void main(String[] args) {

		int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
		System.out.println("Original Array:");
		printArray(arr);

		mergeSort(arr);

		System.out.println("\nSorted Array:");
		printArray(arr);

	}

	// Utility function to print an array
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	// Function to perform merge sort
	public static void mergeSort(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return;
		}
		int[] temp = new int[arr.length];
		mergeSort(arr, temp, 0, arr.length - 1);
	}

	// Recursive function to divide array into subarrays and merge them
	private static void mergeSort(int[] arr, int[] temp, int leftStart, int rightEnd) {
		if (leftStart >= rightEnd) {
			return;
		}
		int middle = (leftStart + rightEnd) / 2;
		mergeSort(arr, temp, leftStart, middle); // Sort left half
		mergeSort(arr, temp, middle + 1, rightEnd); // Sort right half
		merge(arr, temp, leftStart, rightEnd); // Merge sorted halves
	}

	// Function to merge two sorted halves into a single sorted array
	private static void merge(int[] arr, int[] temp, int leftStart, int rightEnd) {
		int leftEnd = (leftStart + rightEnd) / 2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart + 1;

		int left = leftStart;
		int right = rightStart;
		int index = leftStart;

		while (left <= leftEnd && right <= rightEnd) {
			if (arr[left] <= arr[right]) {
				temp[index++] = arr[left++];
			} else {
				temp[index++] = arr[right++];
			}
		}

		// Copy remaining elements from left half
		while (left <= leftEnd) {
			temp[index++] = arr[left++];
		}

		// Copy remaining elements from right half
		while (right <= rightEnd) {
			temp[index++] = arr[right++];
		}

		// Copy sorted elements back to original array
		for (int i = leftStart; i <= rightEnd; i++) {
			arr[i] = temp[i];
		}
	}

}
