package com.nisum.saipravin.assignments.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author sai praveen
 * Problem Statement: Write a program to sort the given array list
 *
 */

public class ArrayListSort {

	public static void main(String[] args) {
		/* Initialize the Array List */
		List<Integer> list = new ArrayList<Integer>();
		
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
		
		/* Sorting the ArrayLList using Collections Class utility method */
		Collections.sort(list);
		
		System.out.println("List after sorting of elements");
		System.out.println(list);
	}

}
