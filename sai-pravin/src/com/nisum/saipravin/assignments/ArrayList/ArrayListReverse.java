package com.nisum.saipravin.assignments.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author sai praveen
 * Problem Statement: Write a program to reverse the given array list
 *
 */

public class ArrayListReverse {

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
		
		System.out.println("List before Reversing of elements");
		System.out.println(list);
		
		/* Reversing the ArrayLList using Collections Class utility method */
		Collections.reverse(list);
		
		System.out.println("List after Reversing of elements");
		System.out.println(list);

	}

}
