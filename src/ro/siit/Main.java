package ro.siit;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

// Even numbers to 100 or any number (just change 100 with the number you want):

        System.out.println("Insert a number to which you find out the even numbers to:");

        int number = scanner.nextInt();

        for (int num = 0; num < 100; num = num + 2) {
            System.out.println(num);
        }

// Odd numbers to 99 or the number we want (just change 100 with the number you want):

        System.out.println("Insert a number to which you find out the odd numbers to:");

        for (int num = 1; num <= 99; num = num + 2) {
            System.out.println(num);
        }

// Is number even or odd:
        System.out.println("Insert a number to see if it's even or odd:");

        number = scanner.nextInt();
        int rem = number % 2;

        if (rem == 0) {
            System.out.println("The Number" + number + "is even.");
        } else {
            System.out.println("The Number" + number + "is odd.");
        }

// Is number positive or negative:

        System.out.println("Insert 2 numbers and see if the sum between them is positive or negative:");
        int number1, number2, sumOf;
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        sumOf = number1 - number2;

        if (sumOf > 0) {
            System.out.println("The sum between the 2 numbers is positive.");
        } else {
            System.out.println("The sum between the 2 numbers is negative");
        }

// Multiplication table:

        System.out.println("Insert the number you want the multiplication table for:");
        number = scanner.nextInt();
        int result = 0;

        for (int count = 1; count <= 10; count++) {
            result = number * count;
            System.out.println(count + " * " + number + "=" + result);
        }

        System.out.println("Insert 2 numbers to calculate the sum of squares of the 2:");

// Find square of 2 numbers:
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        int square;

        square = (number1 * number1 + number2 * number2);
        System.out.println("The square of the 2 numbers is:" + square);

// Calculate the given power of a number:

        number = scanner.nextInt();
        int power = scanner.nextInt();
        result = 1;

        for (int i = 1; i < power; i++) {
            result = result * number;
        }
        System.out.println("The number" + number + "to the power of" + power + "is equal to:" + result);

// Factorial of number:
        System.out.println("Enter the number you want to factorize/find the factorial of:");
        number = scanner.nextInt();
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
    }

