package com.nisum.saipravin.assignments.Arrays;

/**
 * Problem Statement: Write a program to reverse the array
 * @author sai praveen
 *
 */
public class ArrayReverse {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Array before reversing");
		ArrayUtilities.printArray(arr);

		/* Reversing the array */
		reverseArray(arr);
		
		System.out.println("Array after reversing");
		ArrayUtilities.printArray(arr);


	}
	
	/**
	 * Reverses the content of the array.
	 * @param arr the array whose content to be reversed
	 */
	public static void reverseArray(int[] arr) {
		int arrayLength = arr.length;
		
		for(int i = 0; i < arrayLength/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arrayLength-i-1];
			arr[arrayLength-i-1] = temp;
		}
	}

}
