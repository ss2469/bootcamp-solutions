package part1.bootcamp.difficult;

public class Program_06_Find_Longest_Common_Subsequence {

	// Write a program to find the longest common subsequence of two strings in
	// Java.

	/*
	 * Longest Subsequence Common (LSC) refers to the longest sequence that can be
	 * derived from two (or more) sequences such that all elements in the
	 * subsequence appear in the same order in both original sequences, but not
	 * necessarily consecutively. In Java, there are two ways to implement the LSC
	 * program, i.e., using the recursive method and using dynamic programming.
	 * 
	 * Dynamic programming algorithm is MORE EFFICIENT than the recursive algorithm.
	 * (Dynamic programming is a technique for solving a complex problem by first
	 * breaking into a collection of simpler subproblems, solving each subproblem
	 * just once, and then storing their solutions to avoid repetitive
	 * computations.)
	 */

	public static void main(String[] args) {

		String text1 = "abcde";
		String text2 = "ace";

		int lengthOfLCS = longestCommonSubsequence(text1, text2);

		System.out.println("Length of Longest Common Subsequence: " + lengthOfLCS);

	}

	// Function to find the length of longest common subsequence
	public static int longestCommonSubsequence(String text1, String text2) {
		int m = text1.length();
		int n = text2.length();

		// Create a 2D array to store lengths of longest common subsequence

		int[][] dp = new int[m + 1][n + 1];

		// Build dp array in bottom-up manner (dp - dynamic programming )

		for (int i = 1; i <= m; i++) {

			for (int j = 1; j <= n; j++) {

				if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;

				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		// Length of LCS will be at dp[m][n]
		return dp[m][n];
	}

}
