package part1.bootcamp.easy;

import java.util.Scanner;

public class Program_08 {

	public static void main(String[] args) {
		
		// Write a Java program to implement a simple calculator.
		
		char operator;
		double number1, number2, result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose an operator: +, -, *, /");
		operator = input.next().charAt(0);
		
		System.out.println("Enter first number: ");
		number1 = input.nextDouble();
		
		System.out.println("Enter second number: ");
		number2 = input.nextDouble();
		
		switch (operator) {
		
		case '+':
			result = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;
			
		case '-':
			result = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + result);
			break;
			
		case '*':
			result = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = " + result);
			break;
			
		case '/':
			result = number1 / number2;
			System.out.println(number1 + " / " + number2 + " = " + result);
			break;
		
		}
		
		input.close();

	}

}
