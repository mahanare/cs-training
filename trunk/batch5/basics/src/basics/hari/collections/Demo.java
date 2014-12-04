package basics.hari.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public void sort(int[] numbers) {

		int length = numbers.length;

		for (int i = 0; i < length - 1; i++) {
			// int index = -1;
			for (int j = i + 1; j < length; j++) {
				if (numbers[i] > numbers[j]) {
					// index = j;
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
			/**
			 * if (index != -1) { int temp = numbers[i]; numbers[i] =
			 * numbers[index]; numbers[index] = temp; }
			 */

		}

		System.out.println("sorted numbers");
		for (int i = 0; i < length; i++) {
			System.out.println(numbers[i]);
		}
	}

	public void demoArrayList() {
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(12);
		numbers.add(30);
		numbers.add(3);
		numbers.add(5);

		numbers.sort(null);

		System.out.println(numbers);
	}

	public void demoStringArray() {
		String[] names = new String[10];
		names[0] = "pradeep";
		names[1] = "hari";
		names[2] = "prashanth";
	}

	public static void main(String[] args) {

		Demo demo = new Demo();
		int numbers[] = { 20, 3, 12, 45, 34, 2, 3, 1 };
		// demo.sort(numbers);

		demo.demoArrayList();
	}

}
