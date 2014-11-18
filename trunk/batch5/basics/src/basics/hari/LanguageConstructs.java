package basics.hari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LanguageConstructs {

	public void ifDemo() {
		int number = 100;

		if (number > 100) {
			System.out.println("Number is greater than 100");
		} else if (number > 90) {
			System.out.println("Number is greater than 90 and less than 100");
		} else if (number > 80) {
			System.out.println("Number is greater than 90 and less than 80");
		} else if (number > 70) {
			System.out.println("Number is greater than 90 and less than 70");
		} else if (number > 60) {
			System.out.println("Number is greater than 90 and less than 60");
		} else if (number > 50) {
			System.out.println("Number is greater than 90 and less than 50");
		}
	}

	public void forDemo() {

		// initialization, termination; increment condition
		for (int i = 0; i < 10; i++) {
			System.out.println("i value :" + i);
		}

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i : numbers) {
			System.out.println("i value from array :" + i);
		}

		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}

		for (int i = 0; i < 20; i++)
			System.out.println("i value is : " + i);
		System.out.println("i value is : " + (3 - 1)); // this is not part of
														// for loop.

		for (int i = 0; i < 20; i++) {
			System.out.println("i value is : " + i);

		}
	}

	public void whileDemo() {
		Scanner scanner = new Scanner(System.in);
		int i = 0;

		while (i != 0) { // while has a single condition always.
			System.out
					.println("Please enter 0 to exit, any other number to continue");
			i = scanner.nextInt();
			System.out.println("You entered : " + i);

		}

		scanner.close();

	}

	public void doWhileDemo() {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		do {
			System.out
					.println("Please enter 0 to exit, any other number to continue");
			i = scanner.nextInt();
			System.out.println("You entered : " + i);

		} while (i != 0);

		scanner.close();
	}

	public void switchDemo() {
		Scanner scanner = new Scanner(System.in);
		int i = 1;

		while (i != 0) { // while has a single condition always.
			System.out
					.println("Please enter 0 to exit, any other number to continue");
			i = scanner.nextInt();
			switch (i) {
			case 0:
				System.out.println(" 0 is entered, top while gets terminiated");
				break;
			case 1:
				System.out.println("i value is 1");
				// you can write any code here.
				break;
			case 2:
				System.out.println("i value is 2");
				break;
			case 3:
				System.out.println("i value is 3");
				break;
			default:
				System.out
						.println("i value is not 0, 1,2,3 and something else");
				break;

			}

		}

		scanner.close();

	}

	public void bufferredReaderDemo() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String message = br.readLine();
		System.out.println("message entered is : " + message);
	}

	public static void main(String[] args) throws IOException {

		LanguageConstructs demo = new LanguageConstructs();
		// demo.whileDemo();
		// demo.bufferredReaderDemo();
		// demo.switchDemo();
		demo.doWhileDemo();

	}

}
