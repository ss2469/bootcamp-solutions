package part1.bootcamp.easy;

public class Program_05 {

	public static void main(String[] args) {

		// Write a Java program to check if a given number is prime or not.
		// PRIME NUMBERs: 2, 3, 5, 7, 11, 13, 17, 19, 23,29, 31....
		
		int number = 29;
		int flag = 0;
		int m = number / 2;

		if (number <= 1)
			System.out.println(number + " is NOT a Prime number.");
		else {
			for (int i = 2; i <= m; i++) {

				if (number % i == 0) {
					System.out.println(number + " is NOT a Prime number.");
					flag = 1;
					break;
				}
			}

		}

		if (flag == 0)
			System.out.println(number + " is a Prime number.");

	}

}
