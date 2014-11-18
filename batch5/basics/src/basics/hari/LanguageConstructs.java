package basics.hari;

public class LanguageConstructs {

	public void ifDemo() {
		int number = 100;

		if (number > 100) {
			System.out.println("Number is greater than 100");
		} else if (number > 90) {
			System.out.println("Number is greater than 90 and less than 100");
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
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
