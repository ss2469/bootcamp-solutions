package part1.bootcamp.easy;

import java.util.Scanner;

public class Program_07 {

	public static void main(String[] args) {
		
		// Write a Java program to reverse a given string.

		String input;
		String reverse = "";
		
		Scanner scanner = new Scanner((System.in));
		System.out.print("Enter a string: ");
		input = scanner.nextLine();
		scanner.close();
		
		
		
		for( int i = input.length() - 1; i >= 0; i--)
			reverse = reverse + input.charAt(i);
		
		System.out.println("Reversed String: " + reverse);
		
	}

}
