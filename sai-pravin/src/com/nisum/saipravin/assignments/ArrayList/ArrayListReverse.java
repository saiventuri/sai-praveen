package com.nisum.saipravin.assignments.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Statement: Write a program to reverse the given array lists
 * @author sai praveen
 *
 */

public class ArrayListReverse {

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
		
		System.out.println("List before Reversing of elements");
		System.out.println(list);
		
		/* Reversing the ArrayLList */
		reverseList(list);
		
		System.out.println("List after Reversing of elements");
		System.out.println(list);

	}
	
	/**
	 * Reverses the given list
	 * @param list the list that is to be reversed
	 */
	public static void reverseList(List<Integer> list) {
		int size = list.size();
		
		for(int i=0; i < size/2 ; i++) {
			int temp = list.get(size-1-i);
			list.set(size-i-1, list.get(i));
			list.set(i, temp);
		}
		
	}

}
