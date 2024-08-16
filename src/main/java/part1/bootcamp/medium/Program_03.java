package part1.bootcamp.medium;

public class Program_03 {

	public static void main(String[] args) {

		// Write a Java program to check if a given STRING is a palindrome or not.

		String str = "KAYAKING";
		boolean flag = true;
		int left = 0, right = str.length() - 1;

		while (left < right) {

			if (str.charAt(left) != str.charAt(right)) {
				flag = false;
			}
			left++;
			right--;
		}

		if (flag == false)
			System.out.println(str + " is NOT a Palindrome.");
		else if (flag == true)
			System.out.println(str + " is a Palindrome.");

	}

}
