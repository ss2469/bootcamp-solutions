package part1.bootcamp.difficult;

public class Program_07_Find_Max_Subarray_Sum {

	// Write a program to find the maximum subarray sum in an array of integers in Java.

	public static void main(String[] args) {

		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int maxSum = maxSubArraySum(nums);

		System.out.println("Maximum subarray sum is: " + maxSum);
	}

	// Function to find the maximum subarray sum using Kadane's Algorithm
	public static int maxSubArraySum(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int maxSum = nums[0];
		int currentSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			currentSum = Math.max(nums[i], currentSum + nums[i]);
			maxSum = Math.max(maxSum, currentSum);
		}

		return maxSum;
	}

}
