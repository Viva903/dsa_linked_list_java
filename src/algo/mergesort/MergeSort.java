package algo.mergesort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

//		int[] array1 = { 1, 3, 7, 8 };
//		int[] array2 = { 2, 4, 5, 6 };
//
//		System.out.println(Arrays.toString(merge(array1, array2)));

		int[] myArray = { 3, 1, 4, 2 };

		System.out.println(Arrays.toString(mergeSort(myArray)));
	}

	public static int[] mergeSort(int[] intArray) {
		if (intArray.length == 1)
			return intArray;

		int mid = intArray.length / 2;
		int[] left = Arrays.copyOfRange(intArray, 0, mid);
		int[] right = Arrays.copyOfRange(intArray, mid, intArray.length);

		return merge(mergeSort(left), mergeSort(right));
	}

	private static int[] merge(int[] array1, int[] array2) {
		int[] combinedArray = new int[array1.length + array2.length];
		int index = 0;
		int i, j = 0;

		// use while loop simpler.
		for (i = 0; i < array1.length;) {
			for (; j < array2.length; j++) {
				if (array1[i] < array2[j]) {
					combinedArray[index++] = array1[i];
					i++;
					break;
				} else if (array2[j] < array1[i]) {
					combinedArray[index++] = array2[j];
				}
			}
			if (j >= array2.length)
				break;
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
