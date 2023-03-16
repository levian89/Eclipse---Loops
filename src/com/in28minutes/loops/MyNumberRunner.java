package com.in28minutes.loops;

public class MyNumberRunner {

	public static void main(String[] args) {

		MyNumber number = new MyNumber(7);

		boolean isPrime = number.isPrime();
		System.out.println("is Prime " + isPrime);

		// int sum = number.sumUpToN();
		// System.out.println("sum up to n is " + sum);

		// int sumOfDivisors = number.sumOfDivisors();
		// System.out.println("sum of divisors is " + sumOfDivisors);

		// number.printNumberTriangle();
	}
}
