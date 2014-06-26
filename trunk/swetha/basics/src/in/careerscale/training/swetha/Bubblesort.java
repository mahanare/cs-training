package in.careerscale.training.swetha;

public class Bubblesort {
	public static void bubbleSort(int arr[]) {
		int temp = 0;
		int l = arr.length;
		for (int i = 0; i < l - 1; i++) {
			for (int j = 0; j < l - 1; j++) {
				if (arr[j + 1] < arr[j]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int m = 0; m < l; m++) {
			System.out.print(arr[m] + ",");
		}
	}

	public static void main(String args[]) {
		int input[] = { 20, 2, 17, 5, 4 };
		bubbleSort(input);

	}
}
