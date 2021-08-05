package com.nisum.saipravin.assignments.Arrays;

/**
 * Problem Statement: Write a program to merge two arrays into one
 * @author sai praveen
 *
 */
public class ArrayMerge {

	public static void main(String[] args) {
		
		int[] arr1 = {3,4,10,4,7,5,8,9,11,3};
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("First Array");
		ArrayUtilities.printArray(arr1);
		
		System.out.println("Second Array");
		ArrayUtilities.printArray(arr2);
		
		int[] res = mergeArrays(arr1,arr2);
		
		System.out.println("Merged Array");
		ArrayUtilities.printArray(res);
	}
	
	/**
	 * Merges the given 2 arrays into a single array
	 * @param arr1 First array to be merged
	 * @param arr2 Second array to be merged
	 * @return merged array
	 */
	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		
		int[] mergedArray = new int[arr1.length+arr2.length];
		
		System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);  
		System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
		return mergedArray;
	}

}
