package com.nag.binarysearch;

public class BinarySearch {

	/**
	 * The array will be sorted ,will return the position of the element if found
	 * else -1
	 * 
	 * @param array
	 * @param elementToBeSearched
	 * @return
	 */
	public int binarySearch(int[] array, int elementToBeSearched) {
		int lowerIndex = 0;
		int higherIndex = array.length - 1;

		while (lowerIndex <= higherIndex) {
			/**
			 * while calculating the middle value if the array is too big it can go out of
			 * the range of integers and result on overflow error . To avoid that use below
			 * formula for middle calculation
			 */
			int middleIndex = lowerIndex + (higherIndex - lowerIndex) / 2;

			if (array[middleIndex] == elementToBeSearched) {
				return middleIndex;
			} else if (elementToBeSearched < array[middleIndex]) {
				// It means the element is present in the first half of the array
				higherIndex = middleIndex - 1;
			} else {
				// It means that the value is present in the second half of the array
				lowerIndex = middleIndex + 1;
			}
		}
		return -1;
	}

	/**
	 * Another way to write binary search is to take the recurssive approach
	 */

	public int recurssiveBinarySearch(int[] array, int low, int high, int elementToBeSearched) {
		if (low == high) {
			if (array[low] == elementToBeSearched)
				return low;
			else
				return -1;
		} else {

			int middle = low + (high - low) / 2;

			if (array[middle] == elementToBeSearched) {
				return middle;

			} else if (array[middle] < elementToBeSearched) {
				return recurssiveBinarySearch(array, middle + 1, high, elementToBeSearched);
			} else {
				return recurssiveBinarySearch(array, low, middle - 1, elementToBeSearched);
			}
		}

	}

}
