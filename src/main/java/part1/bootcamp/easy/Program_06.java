package part1.bootcamp.easy;

public class Program_06 {

	// Write a Java program to check if a given string is a palindrome or not.
	// Example : 'radar', 'madam', 'level', 'defied', 'racecar'

	public static void main(String[] args) {

		String str = "LEVEL";
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
