package com.nisum.saipravin.assignments.Arrays;


/**
 * Problem Statement: Write a program to sort array using Bubble sort
 * @author sai praveen
 *
 */
public class ArraySort {

	public static void main(String[] args) {
		
		int[] arr = {3,4,10,4,7,5,8,9,11,3};
		
		System.out.println("Array before sorting");
		ArrayUtilities.printArray(arr);

		/* Sorting the array */
		bubbleSort(arr);
		
		System.out.println("Array after sorting");
		ArrayUtilities.printArray(arr);

	}

	/**
	 * Sorts the given array using bubble sort algorithm
	 * 
	 * @param list the list that is to be sorted
	 */
	public static void bubbleSort(int[] arr) {
		
		int arrLength = arr.length;
		boolean swapped = true;
		
		for(int pass= arrLength-1; pass >= 0 && swapped; pass--) {
			swapped = false;
			for(int i = 0; i<= pass-1;i++) {
				if(arr[i] > arr[i+1]) {
					// Swapping elements in the array
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
					swapped = true;
				}
			}
		}
	}

}
