package part1.bootcamp.medium;

public class Program_09 {

	public static void main(String[] args) {
		
		// Write a Java program to implement binary search algorithm.

		/* Binary Search is a fast searching algorithm with run-time complexity of O(log n).
		 * It works on the principle of DIVIDE and CONQUER.
		 * It is used in a sorted array.
		*/
		
		int[] sortedArray = {11, 22, 34, 45, 56, 67, 89, 90};
		int target = 67;
		
		int index = binarySearch(sortedArray, target);
		
		if (index != -1) {
			System.out.println("Element " + target + " found at index: " + index);
		} else {
			System.out.println("Element " + target + " NOT found at index: " + index);
		}
		
	}
	
	// Method
	public static int binarySearch(int[] arr, int target) {
		
		int left = 0;
		int right = arr.length - 1;
		
		while (left <= right) {
			int mid = left + (right -left) / 2;
			
			// Check if target is present at mid
			if (arr[mid] == target) {
				return mid;
			}
			
			// If target is greater, ignore left half
			if (arr[mid] < target) {
				left = mid + 1;
			} else { // If target is smaller, ignore right half
				right = mid -1;
			}
		}

		// Element not present in array
		return -1;	
	}
	
	
}
