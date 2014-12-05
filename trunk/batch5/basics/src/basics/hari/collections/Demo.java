package basics.hari.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

	public void demoForBasicList() {

		List myList = new ArrayList();

		myList.add(100);
		myList.add("Prasanth");

		// Demo demo = new Demo();
		// myList.add(demo);

		myList.add(new Demo());

		Iterator itr = myList.iterator();

		while (itr.hasNext()) {

			Object item = itr.next();
			System.out.println(item);
			System.out.println(item.getClass());

		}

	}

	public void demoArrayList() {
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(12); // 0
		numbers.add(30); // 1
		numbers.add(3); // 2
		numbers.add(5); // 3
		numbers.add(23); // 4
		numbers.add(5, 150);
		numbers.add(6, 150);
		numbers.add(3, 150);

		List<Integer> subList = new ArrayList<Integer>();
		subList.add(130);
		subList.add(420);
		numbers.addAll(subList);
		numbers.addAll(2, subList);
		numbers.remove(3);
		numbers.remove(new Integer(130));

		for (Integer myNumber : subList) {

		}

		numbers.get(50);
		// numbers.sort(null);

		// System.out.println(numbers);

		Iterator<Integer> itr = numbers.iterator();

		while (itr.hasNext()) {

			Integer item = itr.next();

			System.out.println(item);
			// System.out.println(item.getClass());

		}
	}

	public void demoSet() {

		Set<String> mySet = new HashSet<String>();

		mySet.add("Hari");
		mySet.add("Pradeep");
		mySet.add("Prasanth");
		mySet.add("Hari");
		mySet.add("Pradeep");
		mySet.add("Hari");
		mySet.add("Pradeep");
		mySet.add("Hari");
		mySet.add("Pradeep");
		mySet.add("Hari");
		mySet.add("Pradeep");
		mySet.add("Hari");
		mySet.add("Pradeep");
		mySet.add("Hari");
		mySet.add("Pradeep");
		mySet.add("Prasanth");
		mySet.add("Hari");
		mySet.add("Pradeep");
		mySet.add("Hari");

		Iterator<String> itr = mySet.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public void demoStringArray() {
		String[] names = new String[10];
		names[0] = "pradeep";
		names[1] = "hari";
		names[2] = "prashanth";
	}

	public void demoMap() {

		Map<String, Integer> myMap = new HashMap<String, Integer>();

		class Student {
			private String name;
			private String rollNo;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getRollNo() {
				return rollNo;
			}

			public void setRollNo(String rollNo) {
				this.rollNo = rollNo;
			}

			public Student(String name, String rollNo) {
				this.name = name;
				this.rollNo = rollNo;
			}

			@Override
			public String toString() {

				return "name: " + name + " rollNo: " + rollNo;
			}

		}

		Map<String, Student> myStudents = new HashMap<String, Student>();

		myStudents.put("Hari", new Student("Hari", "1"));
		myStudents.put("pradeep", new Student("pradeep", "2"));

		Set<String> keys = myStudents.keySet();

		Iterator<String> ir = keys.iterator();
		while (ir.hasNext()) {
			String key = ir.next();
			System.out.println(key + " : " + myStudents.get(key));
		}

	}

	public static void main(String[] args) {

		Demo demo = new Demo();
		int numbers[] = { 20, 3, 12, 45, 34, 2, 3, 1 };
		// demo.sort(numbers);

		// demo.demoArrayList();
		// demo.demoForBasicList();
		// demo.demoSet();
		demo.demoMap();
	}

}
