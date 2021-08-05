package com.nisum.saipravin.assignments.Arrays;

/**
 * Problem Statement: Write a program to remove an element from array
 * @author sai praveen
 *
 */
public class ArrayElementRemoval {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Array before removing element 6");
		ArrayUtilities.printArray(arr);

		/* Reversing the array */
		arr = removeElementFromArray(arr, 6);
		
		System.out.println("Array after removing element 6");
		ArrayUtilities.printArray(arr);
		

	}
	
	/**
	 * Removes the given element from the array.
	 * @param arr the array from which the deletion has to happen
	 * @param element the element that is to be removed from the array
	 * @return array not containing the given element
	 */
	public static int[] removeElementFromArray(int[] arr, int element) {
		
		int indexOfElement = ArrayBinarySearch.binarySearch(arr, element);
		
		if(indexOfElement == -1) {
			return arr;
		} else {
			int[] resArray = new int[arr.length - 1];
			
			int i=0;
			int j=0;
			
			while(i<arr.length) {
				if(i != indexOfElement) {
					resArray[j] = arr[i];
					j++;
				}
				i++;
			}

			return resArray;
		}
	}

}
