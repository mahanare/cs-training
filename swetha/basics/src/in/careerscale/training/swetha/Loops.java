package in.careerscale.training.swetha;

public class Loops {

	public void whileDemo() {
		int i = 0;

		while (i < 10) {
			System.out.println(i);
			i++;
		}

		do {
			System.out.println(i);
			i--;

		} while (i >= 0);
	}

	public void forLoop() {
		int i;

		// for (initialization; terminiation; increment condition)
		for (i = 0; i < 10; i++) {
			System.out.println("I am " + i);

		}

		int numbers[] = new int[] { 10, 20, 30 };
		for (int number : numbers) {
			System.out.println("Number is " + number);
		}
	}

	public void switchCase() {
		for (int j = 0; j < 5; j++) {
			switch (j) {
			case 0:
				System.out.println("Number is" + j);
				break;
			case 1:
				System.out.println("Number is" + j);
				break;
			case 2:
			case 3:
			case 4:
				System.out.println("Numbers are more than 1");
				break;
			default:
				System.out.println("goodbye!!");

			}
		}

	}

	public void ifStatement() {
		int a = 10;
		int b = 9;
		if (a < b) {
			System.out.println("a is smaller than b");
		} else if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("a equal to b");
		}

	}
}