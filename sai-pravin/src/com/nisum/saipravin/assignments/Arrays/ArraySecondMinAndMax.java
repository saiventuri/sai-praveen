package com.nisum.saipravin.assignments.Arrays;

/**
 * Problem Statement: Write a program to find second min & max number
 * @author sai praveen
 *
 */
public class ArraySecondMinAndMax {

	public static void main(String[] args) {
		
		int[] arr = {3,4,10,4,7,5,8,9,11,3};
		
		System.out.println("Array");
		ArrayUtilities.printArray(arr);
		
		System.out.println("Second smallest element in the array is " + findSecondMinInArray(arr));
		System.out.println("Second largest element in the array is " + findSecondMaxInArray(arr));
	}
	
	/**
	 * Returns the second smallest element in the array
	 * @param arr the array to find second smallest element
	 * @return second smallest element
	 */
	public static int findSecondMinInArray(int[] arr) {
		
		int firstSmallestElement = Integer.MAX_VALUE;
		int secondSmallestElement = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] < firstSmallestElement) {
				secondSmallestElement = firstSmallestElement;
				firstSmallestElement = arr[i];
			} else if (arr[i] < secondSmallestElement && arr[i] != firstSmallestElement) {
				secondSmallestElement = arr[i];
			}
		}
		
		return secondSmallestElement;
	}
	
	/**
	 * Returns the second largest element in the array
	 * @param arr the array to find second largest element
	 * @return second largest element
	 */
	public static int findSecondMaxInArray(int[] arr) {
		
		int firstMaxElement = Integer.MIN_VALUE;
		int secondMaxElement = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > firstMaxElement) {
				secondMaxElement = firstMaxElement;
				firstMaxElement = arr[i];
			} else if (arr[i] > secondMaxElement && arr[i] != firstMaxElement) {
				secondMaxElement = arr[i];
			}
		}
		
		return secondMaxElement;
	}

}
