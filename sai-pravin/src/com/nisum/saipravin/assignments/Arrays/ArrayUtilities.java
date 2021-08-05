package com.nisum.saipravin.assignments.Arrays;

/**
 * Common utility class containing method used by all problems of arrays
 * @author sai praveen
 *
 */
public class ArrayUtilities {

	/**
	 * Prints the content of the array
	 * @param arr the array whose content needs to be printed
	 */
	public static void printArray(int[] arr) {
		
		for(int e: arr) {
			System.out.print(e + "\t");
		}
		
		System.out.println();
	}

}
