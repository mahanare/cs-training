package in.careerscale.training.swetha;

public class SelectionSort {
	public static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index])
					index = j;

			int smallNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallNumber;

		}

		for (int m = 0; m <= arr.length - 1; m++) {
			System.out.print(arr[m] + ",");
		}
	}

	public static void main(String args[]) {
		int input[] = { 20, 2, 17, 5, 4 };
		selectionSort(input);

	}
}
