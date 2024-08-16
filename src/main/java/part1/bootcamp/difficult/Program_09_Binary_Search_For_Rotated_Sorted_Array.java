package part1.bootcamp.difficult;

public class Program_09_Binary_Search_For_Rotated_Sorted_Array {

	// Write a program to implement a binary search algorithm for a rotated sorted
	// array in Java.

	public static void main(String[] args) {

		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;

		int index = search(nums, target);

		if (index != -1) {
			System.out.println("Target " + target + " found at index " + index);
		} else {
			System.out.println("Target " + target + " not found");
		}
	}

	// Function to perform binary search on rotated sorted array
	
	public static int search(int[] nums, int target) {
		
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] == target) {
				return mid;
			}

			// Left half is sorted
			if (nums[left] <= nums[mid]) {
				// Check if target is in the left half
				if (nums[left] <= target && target < nums[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			// Right half is sorted
			else {
				// Check if target is in the right half
				if (nums[mid] < target && target <= nums[right]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}

		// Element not found
		return -1;
	}

}
