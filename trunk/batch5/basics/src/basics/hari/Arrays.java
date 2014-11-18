package basics.hari;

public class Arrays {

	public void arraysDemoForInt() {
		int numbers[] = { 1, 2, 4, 5 };
		int[] myNumbers = { 6, 7, 8, 9, 10 };

		for (int i : myNumbers) {
			System.out.println("i value is : " + i);
		}

		int dNumbers[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 1, 3, 4 } };

		for (int[] is : dNumbers) {
			System.out.println("into new sub array now");
			for (int i : is) {

				System.out.println("sub array : i value is " + i);
			}
		}

	}

	public static void main(String[] args) {
		Arrays demo = new Arrays();
		demo.arraysDemoForInt();

	}

}
