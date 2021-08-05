package com.nisum.saipravin.assignments.Arrays;

import java.util.HashMap;

/**
 * Problem Statement: Write a program to find duplicate values in array
 * @author sai praveen
 *
 */
public class ArrayDuplicate {

	public static void main(String[] args) {
		
		int[] arr = {3,4,10,4,7,5,8,9,11,3};
		
		System.out.println("Array");
		ArrayUtilities.printArray(arr);
		
		System.out.println("Duplicates in the array");
		findDuplicatesInArray(arr);
	}
	
	/**
	 * Prints the duplicate elements in the array
	 * @param arr the array in which duplicates are to be printed.
	 */
	public static void findDuplicatesInArray(int[] arr) {
		
		HashMap<Integer,Integer> elementMap = new HashMap<>();
		
		for(int i : arr) {
			if(elementMap.containsKey(i)) {
				elementMap.put(i, elementMap.get(i)+1);
			} else {
				elementMap.put(i, 0);
			}
		}
		
		elementMap.entrySet().stream().filter( e -> e.getValue() != 0).forEach( e -> System.out.println(e.getKey()));		
	}

}
