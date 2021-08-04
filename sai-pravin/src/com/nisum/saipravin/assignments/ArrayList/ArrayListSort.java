package com.nisum.saipravin.assignments.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Statement: Write a program to sort the given array list
 * @author sai praveen
 * 
 */

public class ArrayListSort {

	public static void main(String[] args) {
		/* Initialize the Array List */
		List<Integer> list = new ArrayList<>();
		
		/* Adding Elements to the ArrayList */
		list.add(4);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(10);
		list.add(7);
		list.add(6);
		list.add(4);
		list.add(8);
		list.add(9);
		
		System.out.println("List before sorting of elements");
		System.out.println(list);
		
		/* Sorting the list using bubbleSort technique */
		bubbleSort(list);
		
		System.out.println("List after sorting of elements");
		System.out.println(list);
	}
	
	/**
	 * Sorts the given list according to bubble sort algorithm
	 * 
	 * @param list the list that is to be sorted
	 */
	public static void bubbleSort(List<Integer> list) {
		
		int size = list.size();
		boolean swapped = true;
		
		for(int pass= size-1; pass >= 0 && swapped; pass--) {
			swapped = false;
			for(int i = 0; i<= pass-1;i++) {
				if(list.get(i) > list.get(i+1)) {
					// Swapping elements in the list
					int temp = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, temp);
					swapped = true;
				}
			}
		}
		

	}
}
