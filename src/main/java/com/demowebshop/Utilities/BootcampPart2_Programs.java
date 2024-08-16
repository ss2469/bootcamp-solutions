package com.demowebshop.Utilities;

public class BootcampPart2_Programs {

	public static void main(String[] args) {

		// printEvenNumbers1to100();
		// sumOfFirst100Numbers();
		divisbleByFive();
	}

	public static void printEvenNumbers1to100() {

		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0)
				System.out.println(num);
		}
	}

	public static void sumOfFirst100Numbers() {
		int sum = 0;
		for (int num = 1; num <= 100; num++) {
			sum = sum + num;
		}
		System.out.println(sum);
	}

	public static void divisbleByFive() {

		for (int num = 1; num <= 100; num++) {
			if (num % 5 == 0)
				System.out.println(num + " is divisible by 5");
		}
	}

}
