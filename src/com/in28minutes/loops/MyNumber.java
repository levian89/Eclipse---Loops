package com.in28minutes.loops;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		// 2 to number-1
		// How can I check if a number is divisible by 2

		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) { // check if a number is divisible by i (if remainder of dividing the number with
									// i == 0, it means the number is divisible by i); if it is divisible, it return
									// false (it's not a prime); if I use other condition like if (number % i != 0),
									// this check if a number is not divisible by i... for example 7 % 2 != 0 ->
									// true, so it executes the condition returnig prime is true and it does not
									// check the division with other numbers: 3, 4, 5, 6 etc... also for ex when 8 %
									// 2 != 0 -> false, for prime numbers it should return prime is false but it
									// does not, because the condition is not true so it is not a good condition for
									// checking prime numbers

				return false;
			}
		}
		return true;
	}

	public int sumUpToN() {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		int sum = 0;
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public void printNumberTriangle() {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}