package week7;

import java.util.Scanner;

public class Recursing {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 10;
		countdown(n);
		int factN = factorial(n);
		System.out.println(factN);
		for (int i = 0; i < n; i++) {
			System.out.println(factorial(i));
		}

		int fibNum = fibonacci(n);
		String another = "y";
		while (another.equals("y")) {
			System.out.println("Enter the fib level you want to go to");
			fibNum = input.nextInt();
			for (int i = 0; i < fibNum; i++) {
				System.out.print(fibonacci(i) + ", ");
				if (i % 7 == 0)System.out.println();
			}
			System.out.println("Again?");
			another = input.next();
		}
	}

	private static int fibonacci(int n) {
		if (n < 1) {
			System.out.println("please use postive integers only");
			return 0;
		}
		if (n == 1 || n == 2)
			return 1;

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	private static void countdown(int n) {
		if (n == 0) {
			System.out.println("Blastoff");
		} else {
			countdown(n - 1);
			System.out.println(n);

		}
	}

	private static int factorial(int n) {
		if (n == 0)
			return 1;
		int recurse = factorial(n - 1);// base case is when the looping stops
		int result = n * recurse;
		return result;
	}

	private static void ForFibonacci(int terms) {
		if (terms < 1) {
			System.out.println("please use postive integers only");
			return;// this isnt actually returning anything just stopping the method from
					// continuing
		}
		int firstTerm = 0;
		int secondTerm = 1;

		System.out.printf("Fibonacci sequence up to %d terms", terms);

		if (terms == 1) {
			System.out.println(firstTerm);
			return;
		}

		System.out.println(firstTerm + ", " + secondTerm);
		for (int i = 2; i < terms; i++) {
			int nextTerm = firstTerm + secondTerm;
			System.out.println(", " + nextTerm);

			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}
