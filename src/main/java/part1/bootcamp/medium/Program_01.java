package part1.bootcamp.medium;

public class Program_01 {

	public static void main(String[] args) {
		
		// Write a Java program to find the factorial of a number using recursion.
		
		/* The factorial of a number is a mathematical operation that multiplies a given integer by all the integers from 1 up to that number. 
		 * It is denoted by the symbol !
		 * Examples:
		 * 0! = 1
		 * 1! = 1
		 * 2! = 2 X 1 = 2
		 * 3! = 3 X 2 X 1 = 6
		 * 4! = 4 X 3 X 2 X 1 = 24
		 * 5! = 5 X 4 X 3 X 2 X 1 = 120
		 */

		int number = 5;
		long factorial = findFactorial(number);
		
		System.out.println("Factorial of " + number + " = " + factorial);
		
		/* Using without recursion
		for(int i = 1; i <= number; i++) {
			
			factorial *= i;
		}
		*/
		
	}
	
	public static long findFactorial(int n) {
		
		if(n == 0)
			return 1;
		
		return n * findFactorial(n - 1);
		
	}

}
