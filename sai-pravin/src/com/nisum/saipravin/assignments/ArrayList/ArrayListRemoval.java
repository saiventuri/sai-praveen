package com.nisum.saipravin.assignments.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Statement: Write a program to remove the element by given index from a array list.
 * @author sai praveen
 * 
 */
public class ArrayListRemoval {

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
		
		System.out.println("List before removal of element");
		System.out.println(list);
		
		/* Removing element 7 from the list */
		try {
			System.out.println("List after removal of element "+ list.remove(7));
			System.out.println(list);
		} catch(UnsupportedOperationException | IndexOutOfBoundsException ex) {
			System.out.println("Unable to delete element from the list");
		}

	}

}
