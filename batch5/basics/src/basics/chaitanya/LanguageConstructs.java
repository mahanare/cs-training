package basics.chaitanya;

import java.util.Scanner;

public class LanguageConstructs {

	Scanner reading = new Scanner(System.in);

	void ifDemo() {
		System.out.println("-------------  If Demo  ---------------");
		System.out.println("Enter an integer value : ");
		int input = reading.nextInt();

		if (input >= 0) {
			if (input == 0) {
				System.out.println("Entered Value is " + input);
			} else {
				System.out.println("Entered Value is " + input
						+ " which is greater than '0' ");
			}
		} else {
			System.out.println("Enter value is lessthan '0' ");
		}
	}

	void simpleForDemo() {
		System.out
				.println("-------------  Simple for-loop Demo  ---------------");
		System.out.println("Enter an input range : ");
		int input = reading.nextInt();

		for (int i = 0; i < input; i++) {
			System.out.println("Entered Value is : " + i);
		}
	}

	void intArrayForDemo() {
		System.out
				.println("-------------  Simple for-loop Demo  ---------------");
		System.out.println("1. Simple Array.");
		System.out.println("2. Custom Array.");
		System.out.println("Please Enter your choice of Array: ");
		int selection = reading.nextInt();
		if (selection == 1) {
			System.out.println("Entered into a Simple Array");
			int input[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

			input[0] = 1;
			input[1] = 2;

			for (int i : input) {
				System.out.println("Value :" + i);
			}
		} else {
			System.out.println("Entered into Custom Array");
			int input[][] = { { 1, 2, 3, 4 }, { 5, 6 }, { 7, 8, 9, 10 } };
			for (int[] array1 : input) {
				System.out.println("Entered into new sub-array");
				for (int array2 : array1) {
					System.out.println("Values in sub-array are " + array2);
				}
			}
		}
	}

	void whileDemo() {

	}

	public static void main(String[] args) {

		LanguageConstructs Demos = new LanguageConstructs();
		Demos.ifDemo();
		Demos.simpleForDemo();
		Demos.intArrayForDemo();
		// Demos.whileDemo();

	}

}
