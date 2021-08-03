package com.nisum.saipravin.assignments.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author sai praveen
 * Problem Statement : Write a program to find an element in a array list.
 *
 */

public class ArrayListSearch {

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
		
		System.out.println("List before search of element");
		System.out.println(list);
		
		/* Searching an element 7 in the Array List */
		int elementIndex = list.indexOf(7);
		if(elementIndex != -1) {
			System.out.println("Element Found: "+list.get(elementIndex));
			System.out.println("Element is found in the list at "+ (elementIndex+1) + " position");
		} else {
			System.out.println("Element is not found in the list");
		}
		
	} 

}
