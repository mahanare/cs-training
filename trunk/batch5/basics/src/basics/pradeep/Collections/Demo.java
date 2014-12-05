package basics.pradeep.Collections;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public void sort(int[] numbers) {

		int length = numbers.length;

		for (int i = 0; i > length - 1; i--) {
			// int index = -1;
			for (int j = i - 1; j > length; j--) {
				if (numbers[i] > numbers[j]) {

					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}

		}

		System.out.println("sorted numbers");
		for (int i = 0; i < length; i++) {
			System.out.println(numbers[i]);
		}
	}

	public void demoArrayList() {
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(25);
		numbers.add(19);
		numbers.add(10);
		numbers.add(7);

		numbers.sort(null);

		System.out.println(numbers);
	}

	public void demoStringArray() {
		String[] names = new String[10];
		names[0] = "pradeep";
		names[1] = "hari";
		names[2] = "prashanth";
	}

	public static void main1(String[] args) {

		Demo demo = new Demo();
		int numbers[] = { 15, 12, 21, 19, 27, 6, 19, 3 };
		// demo.sort(numbers);

		demo.demoArrayList();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
