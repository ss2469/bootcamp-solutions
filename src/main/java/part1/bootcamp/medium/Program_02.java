package part1.bootcamp.medium;

public class Program_02 {

	public static void main(String[] args) {
		
		// Write a Java program to check if a given NUMBER is a palindrome or not.
		
		long number = 123454321;
		
		
		if(isPalindrome(number)) {
			System.out.println(number + " is a Palindrome.");
		} else {
			System.out.println(number + " is NOT a Palindrome.");
		}
		

	}
	
	
	public static boolean isPalindrome(long num) {
		
		long originalNumber = num;
		long reverseNumber = 0;
		
		while(num > 0) {
			
			long remainder = num % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			num = num / 10;
		}
		
		return originalNumber == reverseNumber;
		
	}

}
