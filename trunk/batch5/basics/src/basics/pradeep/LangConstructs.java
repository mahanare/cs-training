package basics.pradeep;

import java.util.Scanner;

public class LangConstructs {
	public void ifDemo() {
		int number = 80;
		if (number > 80) {
			System.out.println("Number is greater than 80");
		} else if (number > 70) {
			System.out.println("Number is greater than 70 and less than 80");
		} else if (number > 60) {
			System.out.println("Number is greater than 60 and less than 80");
		}

	}

	public void ifDem() {
		for (int i = 1; i < 10; i++) {
			System.out.println("i value :" + i);
		}
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i : numbers) {
			System.out.println("i value from array:" + i);
		}
		for (int i = 0; i >= 0; i--) {
			System.out.println("i");
		}
		for (int i = 0; i < 20; i++) {
			System.out.println("i value is" + i);
		}

	}

	public void whileDemo() {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		while (i != 1) {
			System.out
					.println("please enter 1 to exit, any other number to continue");
			i = scanner.nextInt();
			System.out.println("you entered:" + i);

		}
		scanner.close();
	}

	public void doWhileDemo() {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		do {
			System.out
					.println("please enter 1 to exit, any other number to continue");
			i = scanner.nextInt();
			System.out.println("you entered:" + i);

		} while (i != 1);
		System.out.println("exit the program");
		scanner.close();
	}

	public void switchDemo() {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		while (i != 1)
			System.out
					.println("please enter 1 to exit, any other number to continue");
		i = scanner.nextInt();
		switch (i) {
		case 0:
			System.out
					.println("0 is entered, while top number gets terminated");
			break;
		case 1:
			System.out.println("i value is 1");
			break;
		case 2:
			System.out.println("i value is 2");
		default:
			System.out.println("i value is not 0,1,2 and something else");
			break;
		}

		scanner.close();
	}

	public static void main(String[] args) {
		LangConstructs Demo = new LangConstructs();
		Demo.doWhileDemo();
		Demo.ifDem();
		Demo.switchDemo();
		Demo.whileDemo();

		// TODO Auto-generated method stub

	}

}
