package com.nisum.saipravin.assignments.Arrays;

/**
 * Problem Statement: Write a program to search element with binary search
 * @author sai praveen
 *
 */
public class ArrayBinarySearch {

	public static void main(String[] args) {
		
		/* Initialize a sorted array */
        int[] arr = {11,13,14,15,16,17,18,19,23};
		
		System.out.println("Array");
		ArrayUtilities.printArray(arr);
		
		/* Searching 5 in the array using binary search */
		int index = binarySearch(arr,15);
		
		if(index != -1) {
			System.out.println("The Element 15 is present at "+(index+1)+" position in the array");
		} else {
			System.out.println("The element 15 is not present in the array");
		}

	}
	
	/**
	 * Searches an element in the array and returns its index in the array if present using binary search.
	 * @param arr the array that is to be searched
	 * @param element the element that needs to be searched in the array
	 * @return -1 if element is not present in the array else index of the element in the array
	 */
	public static int binarySearch(int[] arr, int element) {
		
		int arrLength = arr.length;
		int low = 0;
		int high = arrLength -1;
		
		while(low <= high) {
			
			int mid = low + ((high - low) / 2);

			if(arr[mid] == element) {
				return mid;
			}
			
			if(element > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		return -1;
	}

}
