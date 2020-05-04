package ro.siit;

import java.util.Scanner;

public class ProductOf2Numbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of the first number ::");
		int a = sc.nextInt();
		System.out.println("Enter the value of the 2nd number ::");
		int b = sc.nextInt();
		int result = a * b;
		System.out.println("Product of the given two numbers is ::" + result);

	}
}
