package basics.harsha;

import java.util.Scanner;

import basics.harsha.Exceptions.DenominatorZeroException;
import basics.harsha.Exceptions.NumberException;

public class NumberCalculator {

	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int subtract(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	public static int multiplyPositive(int num1, int num2)
			throws NumberException {
		if (num1 < 0 || num2 < 0) {
			NumberException e1 = new NumberException();
			throw e1;
		}
		int result = num1 * num2;
		return result;
	}

	public static double divide(double num1, double num2) {
		double result = num1 / num2;
		return result;
	}

	public static double dividePositive(double num1, double num2) throws DenominatorZeroException, NumberException {
		double result = 0;
	try {
			if (num1 < 0 || num2 < 0) {
				throw new NumberException();
			} else if (num2 == 0) {
				throw new DenominatorZeroException(num2);
			}
		} catch (NumberException e) {
			e.printStackTrace();
		} catch (DenominatorZeroException e) {
			e.printStackTrace();
			throw e;
		} finally {
			result = num1 / num2;
		}

		return result;
	}

	public static void main(String[] args) throws DenominatorZeroException, NumberException {

		System.out.println("Choose an operation: ");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Divide Positive");

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
			int product;
			try {
				product = multiplyPositive(a, b);
				System.out.println("Product is " + product);
			} catch (NumberException e) {
				e.printStackTrace();
			}

			break;
		case 4:
			double division = divide(a, b);
			System.out.println("Division is " + division);
			break;

		case 5:
			double divisionPositive = dividePositive(a, b);
			System.out.println("Division is " + divisionPositive);
			break;

		default:
			System.out.println("Invalid Case");
			break;

		}

		sc.close();

	}
}
