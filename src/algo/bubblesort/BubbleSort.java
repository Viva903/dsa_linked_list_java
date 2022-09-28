package algo.bubblesort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] myArray = { 4, 2, 6, 5, 1, 3 };

		bubbleSort(myArray);

		System.out.println(Arrays.toString(myArray));

	}

	public static void bubbleSort(int[] inArray) {

		for (int i = 0; i < inArray.length - 1; i++) {
			for (int j = 0; j < inArray.length - i - 1; j++) {
                if (inArray[j] > inArray[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = inArray[j];
                    inArray[j] = inArray[j + 1];
                    inArray[j + 1] = temp;
                }
			}
		}

	}
}
