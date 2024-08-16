package part1.bootcamp.easy;

import java.util.Random;

public class Program_10 {

	public static void main(String[] args) {
		
		// Write a Java program to generate a random number between 1 and 100.
		
		//Using java.util.Random class
		
		Random random = new Random();
		
		int randomNumber = random.nextInt(100) + 1;
		
		System.out.println("Random number between 1 and 100: " + randomNumber);
		
	}

}
