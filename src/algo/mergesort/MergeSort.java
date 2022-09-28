package algo.mergesort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] array1 = { 1, 3, 7, 8 };
		int[] array2 = { 2, 4, 5, 6 };

		System.out.println(Arrays.toString(merge(array1, array2)));

	}

	public static int[] merge(int[] array1, int[] array2) {
		int[] combinedArray = new int[array1.length + array2.length];
		int index = 0;
		int i, j = 0;

		// use while loop simpler.
		for (i = 0; i < array1.length; ) {
			for (; j < array2.length; j++) {
				if (array1[i] < array2[j]) {
					combinedArray[index++] = array1[i];
					i++;
					break;
				} else if (array2[j] < array1[i]) {
					combinedArray[index++] = array2[j];
				}
			}
			if (j >= 4) break;
		}

		while (i < array1.length) {
			combinedArray[index++] = array1[i];
			i++;
		}

		while (j < array2.length) {
			combinedArray[index++] = array2[j];
			j++;
		}

		return combinedArray;
	}

}
