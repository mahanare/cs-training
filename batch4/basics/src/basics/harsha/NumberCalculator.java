package basics.harsha;

import java.util.Scanner;

public class NumberCalculator {

	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int subtract(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	public static int multiply(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	public static double divide(double num1, double num2) {
		double result = num1 / num2;
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println("Choose an operation: ");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();

		switch (choice) {
		case 1:
			int sum = add(a, b);
			System.out.println("Sum is " + sum);
			break;
		case 2:
			int diff = subtract(a, b);
			System.out.println("Diffence is " + diff);
			break;
		case 3:
			int product = multiply(a, b);
			System.out.println("Sum is " + product);
			break;
		case 4:
			double division = divide(a, b);
			System.out.println("Division is " + division);
			break;
		default:
				System.out.println("Invalid Case");
				break;
		
		}

		sc.close();

	}
}
