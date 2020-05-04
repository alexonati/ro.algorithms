package ro.siit;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String args[]) {
		int i;
		int fact = 1;
		System.out.print("Introduceti numarul ");
		Scanner scanner1 = new Scanner(System.in);
		String number = scanner1.nextLine();
		int result1 = Integer.parseInt(number);
		for (i = 1; i <= result1; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}
