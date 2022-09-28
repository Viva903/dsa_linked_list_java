package algo.quicksort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
//		int[] myArray = { 4, 6, 1, 7, 3, 2, 5 };
//
//		int returnedIndex = pivot(myArray, 0, 6);
//
//		System.out.println("\nReturned Index: " + returnedIndex);
//
//		System.out.println(Arrays.toString(myArray));		

		int[] myArray = { 4, 6, 1, 7, 3, 2, 5 };

		quickSort(myArray);

		System.out.println(Arrays.toString(myArray));
	}

	public static void quickSort(int[] array) {
		quickSortHelper(array, 0, array.length - 1);
	}

	public static void quickSortHelper(int[] array, int left, int right) {
		if (left < right) {
			int pivotIndex = pivot(array, left, right);
			quickSortHelper(array, left, pivotIndex - 1);
			quickSortHelper(array, pivotIndex + 1, right);
		}
	}

	// set a pivot, loop and compare through and return the index of swap variable
	private static int pivot(int[] myArray, int pivotIndex, int endIndex) {

		int swapIndex = pivotIndex;

		for (int i = pivotIndex + 1; i <= endIndex; i++) {
			if (myArray[i] < myArray[pivotIndex]) {
				swapIndex++;
				swap(myArray, swapIndex, i);
			}
		}
		swap(myArray, pivotIndex, swapIndex);
		return swapIndex;
	}

	private static void swap(int[] array, int firstIndex, int secondIndex) {
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
	}

}
