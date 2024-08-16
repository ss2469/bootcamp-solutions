package part1.bootcamp.medium;

import java.util.Scanner;

public class Program_04 {

	public static void main(String[] args) {
		
		// Write a Java program to reverse a given string without using any built-in functions.
		
		String str;
		String rev = "";
		
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner((System.in));
		str = sc.nextLine();
		
		int length = str.length();
		
		for( int i = length - 1; i >= 0; i--)
			rev = rev + str.charAt(i);
		
		if( str.equals(rev))
			System.out.println(str + " is a Palindrome");
		else
			System.out.println(str + " is not a Palindrome");
	

	}

}
