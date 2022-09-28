package algo.insertionsort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] myArray = { 4, 2, 6, 5, 1, 3 };

		insertionSort(myArray);

		System.out.println(Arrays.toString(myArray));

	}

	public static void insertionSort(int[] myArray) {

		for (int i = 1; i < myArray.length; i++) {

			int temp = myArray[i];
			int j = i - 1;

			while (j > -1 && temp < myArray[j]) {
				myArray[j + 1] = myArray[j];
				myArray[j] = temp;
				j--;
			}
		}

	}

}
