package algo.selectionsort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] myArray = { 4, 2, 6, 5, 1, 3 };

		selectionSort(myArray);

		System.out.println(Arrays.toString(myArray));

	}

	private static void selectionSort(int[] myArray) {

		for (int i = 0; i < myArray.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < myArray.length; j++) {
				if (myArray[minIndex] > myArray[j]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = myArray[i];
				myArray[i] = myArray[minIndex];
				myArray[minIndex] = temp;
			}
		}

	}

}
